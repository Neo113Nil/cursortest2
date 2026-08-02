package io.flutter.view;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import defpackage.cg;
import defpackage.ddf;
import defpackage.eg;
import defpackage.jln;
import defpackage.lw31;
import defpackage.og;
import defpackage.pg;
import defpackage.unr0;
import defpackage.xwc0;
import io.flutter.embedding.android.FlutterView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes4.dex */
public class AccessibilityBridge extends AccessibilityNodeProvider {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int ACTION_SHOW_ON_SCREEN = 16908342;
    private static final int BOLD_TEXT_WEIGHT_ADJUSTMENT = 300;
    private static final float DEFAULT_TRANSITION_ANIMATION_SCALE = 1.0f;
    private static final float DISABLED_TRANSITION_ANIMATION_SCALE = 0.0f;
    private static final int MIN_ENGINE_GENERATED_NODE_ID = 65536;
    private static final int ROOT_NODE_ID = 0;
    private static final float SCROLL_EXTENT_FOR_INFINITY = 100000.0f;
    private static final float SCROLL_POSITION_CAP_FOR_INFINITY = 70000.0f;
    private static final String TAG = "AccessibilityBridge";
    private final pg accessibilityChannel;
    private int accessibilityFeatureFlags;
    private b accessibilityFocusedSemanticsNode;
    private final AccessibilityManager accessibilityManager;
    private final og accessibilityMessageHandler;
    private final AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener;
    private final AccessibilityViewEmbedder accessibilityViewEmbedder;
    private boolean accessibleNavigation;
    private final ContentObserver animationScaleObserver;
    private final ContentResolver contentResolver;
    private final Map<Integer, cg> customAccessibilityActions;
    private Integer embeddedAccessibilityFocusedNodeId;
    private Integer embeddedInputFocusedNodeId;
    private final List<Integer> flutterNavigationStack;
    private final Map<Integer, b> flutterSemanticsTree;
    private b hoveredObject;
    private b inputFocusedSemanticsNode;
    private boolean isReleased;
    private b lastInputFocusedSemanticsNode;
    private Integer lastLeftFrameInset;
    private eg onAccessibilityChangeListener;
    private final xwc0 platformViewsAccessibilityDelegate;
    private int previousRouteId;
    private final View rootAccessibilityView;
    private final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener;
    private static final int SCROLLABLE_ACTIONS = ((Action.SCROLL_RIGHT.value | Action.SCROLL_LEFT.value) | Action.SCROLL_UP.value) | Action.SCROLL_DOWN.value;
    private static final int FOCUSABLE_FLAGS = ((((((((((Flag.HAS_CHECKED_STATE.value | Flag.IS_CHECKED.value) | Flag.IS_SELECTED.value) | Flag.IS_TEXT_FIELD.value) | Flag.IS_FOCUSED.value) | Flag.HAS_ENABLED_STATE.value) | Flag.IS_ENABLED.value) | Flag.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.value) | Flag.HAS_TOGGLED_STATE.value) | Flag.IS_TOGGLED.value) | Flag.IS_FOCUSABLE.value) | Flag.IS_SLIDER.value;
    private static int FIRST_RESOURCE_ID = 267386881;
    static int systemAction = (Action.DID_GAIN_ACCESSIBILITY_FOCUS.value & Action.DID_LOSE_ACCESSIBILITY_FOCUS.value) & Action.SHOW_ON_SCREEN.value;

    public enum AccessibilityFeature {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4),
        BOLD_TEXT(8),
        REDUCE_MOTION(16),
        HIGH_CONTRAST(32),
        ON_OFF_SWITCH_LABELS(64),
        NO_ANNOUNCE(128);

        final int value;

        AccessibilityFeature(int i) {
            this.value = i;
        }
    }

    public enum Action {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
        SET_TEXT(2097152),
        FOCUS(SelfTester_JCP.ENCRYPT_CBC),
        SCROLL_TO_OFFSET(SelfTester_JCP.ENCRYPT_CNT);

        public final int value;

        Action(int i) {
            this.value = i;
        }
    }

    public enum Flag {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_MULTILINE(524288),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(SelfTester_JCP.ENCRYPT_CBC),
        IS_SLIDER(SelfTester_JCP.ENCRYPT_CNT),
        IS_KEYBOARD_KEY(16777216),
        IS_CHECK_STATE_MIXED(SelfTester_JCP.DECRYPT_CFB),
        HAS_EXPANDED_STATE(SelfTester_JCP.DECRYPT_CBC),
        IS_EXPANDED(SelfTester_JCP.DECRYPT_CNT),
        HAS_SELECTED_STATE(SelfTester_JCP.IMITA),
        HAS_REQUIRED_STATE(536870912),
        IS_REQUIRED(1073741824);

        final int value;

        Flag(int i) {
            this.value = i;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class StringAttributeType {
        private static final /* synthetic */ StringAttributeType[] $VALUES;
        public static final StringAttributeType LOCALE;
        public static final StringAttributeType SPELLOUT;
        public static final StringAttributeType URL;

        static {
            StringAttributeType stringAttributeType = new StringAttributeType("SPELLOUT", 0);
            SPELLOUT = stringAttributeType;
            StringAttributeType stringAttributeType2 = new StringAttributeType("LOCALE", 1);
            LOCALE = stringAttributeType2;
            StringAttributeType stringAttributeType3 = new StringAttributeType("URL", 2);
            URL = stringAttributeType3;
            $VALUES = new StringAttributeType[]{stringAttributeType, stringAttributeType2, stringAttributeType3};
        }

        public static StringAttributeType valueOf(String str) {
            return (StringAttributeType) Enum.valueOf(StringAttributeType.class, str);
        }

        public static StringAttributeType[] values() {
            return (StringAttributeType[]) $VALUES.clone();
        }
    }

    public AccessibilityBridge(View view, pg pgVar, final AccessibilityManager accessibilityManager, ContentResolver contentResolver, AccessibilityViewEmbedder accessibilityViewEmbedder, xwc0 xwc0Var) {
        this.flutterSemanticsTree = new HashMap();
        this.customAccessibilityActions = new HashMap();
        this.accessibilityFeatureFlags = 0;
        this.flutterNavigationStack = new ArrayList();
        this.previousRouteId = 0;
        this.lastLeftFrameInset = 0;
        this.accessibleNavigation = false;
        this.isReleased = false;
        this.accessibilityMessageHandler = new ddf(5, this);
        AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: io.flutter.view.AccessibilityBridge.2
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public void onAccessibilityStateChanged(boolean z) {
                if (AccessibilityBridge.this.isReleased) {
                    return;
                }
                AccessibilityBridge accessibilityBridge = AccessibilityBridge.this;
                if (z) {
                    pg pgVar2 = accessibilityBridge.accessibilityChannel;
                    og ogVar = AccessibilityBridge.this.accessibilityMessageHandler;
                    pgVar2.c = ogVar;
                    pgVar2.b.setAccessibilityDelegate(ogVar);
                    AccessibilityBridge.this.accessibilityChannel.b.setSemanticsEnabled(true);
                } else {
                    accessibilityBridge.setAccessibleNavigation(false);
                    pg pgVar3 = AccessibilityBridge.this.accessibilityChannel;
                    pgVar3.c = null;
                    pgVar3.b.setAccessibilityDelegate(null);
                    AccessibilityBridge.this.accessibilityChannel.b.setSemanticsEnabled(false);
                }
                if (AccessibilityBridge.this.onAccessibilityChangeListener != null) {
                    eg egVar = AccessibilityBridge.this.onAccessibilityChangeListener;
                    ((FlutterView) ((jln) egVar).b).resetWillNotDraw(z, AccessibilityBridge.this.accessibilityManager.isTouchExplorationEnabled());
                }
            }
        };
        this.accessibilityStateChangeListener = accessibilityStateChangeListener;
        ContentObserver contentObserver = new ContentObserver(new Handler()) { // from class: io.flutter.view.AccessibilityBridge.3
            @Override // android.database.ContentObserver
            public void onChange(boolean z, Uri uri) {
                if (AccessibilityBridge.this.isReleased) {
                    return;
                }
                float f = Settings.Global.getFloat(AccessibilityBridge.this.contentResolver, "transition_animation_scale", 1.0f);
                AccessibilityBridge accessibilityBridge = AccessibilityBridge.this;
                if (f == 0.0f) {
                    AccessibilityBridge.access$1176(accessibilityBridge, AccessibilityFeature.DISABLE_ANIMATIONS.value);
                } else {
                    AccessibilityBridge.access$1172(accessibilityBridge, ~AccessibilityFeature.DISABLE_ANIMATIONS.value);
                }
                AccessibilityBridge.this.sendLatestAccessibilityFlagsToFlutter();
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                onChange(z, null);
            }
        };
        this.animationScaleObserver = contentObserver;
        this.rootAccessibilityView = view;
        this.accessibilityChannel = pgVar;
        this.accessibilityManager = accessibilityManager;
        this.contentResolver = contentResolver;
        this.accessibilityViewEmbedder = accessibilityViewEmbedder;
        this.platformViewsAccessibilityDelegate = xwc0Var;
        accessibilityStateChangeListener.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(accessibilityStateChangeListener);
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: io.flutter.view.AccessibilityBridge.4
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public void onTouchExplorationStateChanged(boolean z) {
                if (AccessibilityBridge.this.isReleased) {
                    return;
                }
                if (!z) {
                    AccessibilityBridge.this.setAccessibleNavigation(false);
                    AccessibilityBridge.this.onTouchExplorationExit();
                }
                if (AccessibilityBridge.this.onAccessibilityChangeListener != null) {
                    eg egVar = AccessibilityBridge.this.onAccessibilityChangeListener;
                    ((FlutterView) ((jln) egVar).b).resetWillNotDraw(accessibilityManager.isEnabled(), z);
                }
            }
        };
        this.touchExplorationStateChangeListener = touchExplorationStateChangeListener;
        touchExplorationStateChangeListener.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        this.accessibilityFeatureFlags |= AccessibilityFeature.NO_ANNOUNCE.value;
        contentObserver.onChange(false);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, contentObserver);
        if (Build.VERSION.SDK_INT >= 31) {
            setBoldTextFlag();
        }
        xwc0Var.a(this);
    }

    public static /* synthetic */ int access$1172(AccessibilityBridge accessibilityBridge, int i) {
        int i2 = i & accessibilityBridge.accessibilityFeatureFlags;
        accessibilityBridge.accessibilityFeatureFlags = i2;
        return i2;
    }

    public static /* synthetic */ int access$1176(AccessibilityBridge accessibilityBridge, int i) {
        int i2 = i | accessibilityBridge.accessibilityFeatureFlags;
        accessibilityBridge.accessibilityFeatureFlags = i2;
        return i2;
    }

    private AccessibilityEvent createTextChangedEvent(int i, String str, String str2) {
        AccessibilityEvent obtainAccessibilityEvent = obtainAccessibilityEvent(i, 16);
        obtainAccessibilityEvent.setBeforeText(str);
        obtainAccessibilityEvent.getText().add(str2);
        int i2 = 0;
        while (i2 < str.length() && i2 < str2.length() && str.charAt(i2) == str2.charAt(i2)) {
            i2++;
        }
        if (i2 >= str.length() && i2 >= str2.length()) {
            return null;
        }
        obtainAccessibilityEvent.setFromIndex(i2);
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (length >= i2 && length2 >= i2 && str.charAt(length) == str2.charAt(length2)) {
            length--;
            length2--;
        }
        obtainAccessibilityEvent.setRemovedCount((length - i2) + 1);
        obtainAccessibilityEvent.setAddedCount((length2 - i2) + 1);
        return obtainAccessibilityEvent;
    }

    private boolean doesLayoutInDisplayCutoutModeRequireLeftInset() {
        Activity b = lw31.b(this.rootAccessibilityView.getContext());
        if (b == null || b.getWindow() == null) {
            return false;
        }
        int i = b.getWindow().getAttributes().layoutInDisplayCutoutMode;
        return i == 2 || i == 0;
    }

    private Rect getBoundsInScreen(Rect rect) {
        Rect rect2 = new Rect(rect);
        int[] iArr = new int[2];
        this.rootAccessibilityView.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public cg getOrCreateAccessibilityAction(int i) {
        cg cgVar = this.customAccessibilityActions.get(Integer.valueOf(i));
        if (cgVar != null) {
            return cgVar;
        }
        cg cgVar2 = new cg();
        cgVar2.c = -1;
        cgVar2.b = i;
        cgVar2.a = FIRST_RESOURCE_ID + i;
        this.customAccessibilityActions.put(Integer.valueOf(i), cgVar2);
        return cgVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b getOrCreateSemanticsNode(int i) {
        b bVar = this.flutterSemanticsTree.get(Integer.valueOf(i));
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        bVar2.b = i;
        this.flutterSemanticsTree.put(Integer.valueOf(i), bVar2);
        return bVar2;
    }

    private b getRootSemanticsNode() {
        return this.flutterSemanticsTree.get(0);
    }

    private void handleTouchExploration(float f, float f2, boolean z) {
        b i;
        if (this.flutterSemanticsTree.isEmpty() || (i = getRootSemanticsNode().i(new float[]{f, f2, 0.0f, 1.0f}, z)) == this.hoveredObject) {
            return;
        }
        if (i != null) {
            sendAccessibilityEvent(i.b, 128);
        }
        b bVar = this.hoveredObject;
        if (bVar != null) {
            sendAccessibilityEvent(bVar.b, 256);
        }
        this.hoveredObject = i;
    }

    private boolean isImportant(b bVar) {
        if (bVar.h(Flag.SCOPES_ROUTE)) {
            return false;
        }
        return (b.b(bVar) == null && (bVar.d & (~systemAction)) == 0) ? false : true;
    }

    private static /* synthetic */ boolean lambda$shouldSetCollectionInfo$0(b bVar, b bVar2) {
        return bVar2 == bVar;
    }

    private static /* synthetic */ boolean lambda$shouldSetCollectionInfo$1(b bVar) {
        return bVar.h(Flag.HAS_IMPLICIT_SCROLLING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AccessibilityEvent obtainAccessibilityEvent(int i, int i2) {
        AccessibilityEvent obtainAccessibilityEvent = obtainAccessibilityEvent(i2);
        obtainAccessibilityEvent.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtainAccessibilityEvent.setSource(this.rootAccessibilityView, i);
        return obtainAccessibilityEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTouchExplorationExit() {
        b bVar = this.hoveredObject;
        if (bVar != null) {
            sendAccessibilityEvent(bVar.b, 256);
            this.hoveredObject = null;
        }
    }

    private void onWindowNameChange(b bVar) {
        String f = bVar.f();
        if (f == null) {
            f = " ";
        }
        setAccessibilityPaneTitle(f);
    }

    private boolean performCursorMoveAction(b bVar, int i, Bundle bundle, boolean z) {
        int i2 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z2 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i3 = bVar.g;
        int i4 = bVar.h;
        predictCursorMovement(bVar, i2, z, z2);
        if (i3 != bVar.g || i4 != bVar.h) {
            String str = bVar.r;
            if (str == null) {
                str = "";
            }
            AccessibilityEvent obtainAccessibilityEvent = obtainAccessibilityEvent(bVar.b, 8192);
            obtainAccessibilityEvent.getText().add(str);
            obtainAccessibilityEvent.setFromIndex(bVar.g);
            obtainAccessibilityEvent.setToIndex(bVar.h);
            obtainAccessibilityEvent.setItemCount(str.length());
            sendAccessibilityEvent(obtainAccessibilityEvent);
        }
        if (i2 == 1) {
            if (z) {
                Action action = Action.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (b.a(bVar, action)) {
                    this.accessibilityChannel.b(i, action, Boolean.valueOf(z2));
                    return true;
                }
            }
            if (z) {
                return false;
            }
            Action action2 = Action.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
            if (!b.a(bVar, action2)) {
                return false;
            }
            this.accessibilityChannel.b(i, action2, Boolean.valueOf(z2));
            return true;
        }
        if (i2 != 2) {
            return i2 == 4 || i2 == 8 || i2 == 16;
        }
        if (z) {
            Action action3 = Action.MOVE_CURSOR_FORWARD_BY_WORD;
            if (b.a(bVar, action3)) {
                this.accessibilityChannel.b(i, action3, Boolean.valueOf(z2));
                return true;
            }
        }
        if (z) {
            return false;
        }
        Action action4 = Action.MOVE_CURSOR_BACKWARD_BY_WORD;
        if (!b.a(bVar, action4)) {
            return false;
        }
        this.accessibilityChannel.b(i, action4, Boolean.valueOf(z2));
        return true;
    }

    private boolean performSetText(b bVar, int i, Bundle bundle) {
        String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        this.accessibilityChannel.b(i, Action.SET_TEXT, string);
        bVar.r = string;
        bVar.s = null;
        return true;
    }

    private void predictCursorMovement(b bVar, int i, boolean z, boolean z2) {
        int i2;
        int i3 = bVar.h;
        if (i3 < 0 || bVar.g < 0) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8 || i == 16) {
                        if (z) {
                            bVar.h = bVar.r.length();
                        } else {
                            bVar.h = 0;
                        }
                    }
                } else if (z && i3 < bVar.r.length()) {
                    Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(bVar.r.substring(bVar.h));
                    if (matcher.find()) {
                        bVar.h += matcher.start(1);
                    } else {
                        bVar.h = bVar.r.length();
                    }
                } else if (!z && bVar.h > 0) {
                    Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(bVar.r.substring(0, bVar.h));
                    if (matcher2.find()) {
                        bVar.h = matcher2.start(1);
                    } else {
                        bVar.h = 0;
                    }
                }
            } else if (z && i3 < bVar.r.length()) {
                Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(bVar.r.substring(bVar.h));
                matcher3.find();
                if (matcher3.find()) {
                    bVar.h += matcher3.start(1);
                } else {
                    bVar.h = bVar.r.length();
                }
            } else if (!z && bVar.h > 0) {
                Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(bVar.r.substring(0, bVar.h));
                if (matcher4.find()) {
                    bVar.h = matcher4.start(1);
                }
            }
        } else if (z && i3 < bVar.r.length()) {
            bVar.h++;
        } else if (!z && (i2 = bVar.h) > 0) {
            bVar.h = i2 - 1;
        }
        if (z2) {
            return;
        }
        bVar.g = bVar.h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (this.accessibilityManager.isEnabled()) {
            this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(this.rootAccessibilityView, accessibilityEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendLatestAccessibilityFlagsToFlutter() {
        pg pgVar = this.accessibilityChannel;
        pgVar.b.setAccessibilityFeatures(this.accessibilityFeatureFlags);
    }

    private void sendWindowContentChangeEvent(int i) {
        AccessibilityEvent obtainAccessibilityEvent = obtainAccessibilityEvent(i, 2048);
        obtainAccessibilityEvent.setContentChangeTypes(1);
        sendAccessibilityEvent(obtainAccessibilityEvent);
    }

    private void setAccessibilityPaneTitle(String str) {
        this.rootAccessibilityView.setAccessibilityPaneTitle(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccessibleNavigation(boolean z) {
        if (this.accessibleNavigation == z) {
            return;
        }
        this.accessibleNavigation = z;
        int i = this.accessibilityFeatureFlags;
        if (z) {
            this.accessibilityFeatureFlags = AccessibilityFeature.ACCESSIBLE_NAVIGATION.value | i;
        } else {
            this.accessibilityFeatureFlags = (~AccessibilityFeature.ACCESSIBLE_NAVIGATION.value) & i;
        }
        sendLatestAccessibilityFlagsToFlutter();
    }

    private void setBoldTextFlag() {
        int i;
        View view = this.rootAccessibilityView;
        if (view == null || view.getResources() == null) {
            return;
        }
        i = this.rootAccessibilityView.getResources().getConfiguration().fontWeightAdjustment;
        if (i == Integer.MAX_VALUE || i < BOLD_TEXT_WEIGHT_ADJUSTMENT) {
            this.accessibilityFeatureFlags &= ~AccessibilityFeature.BOLD_TEXT.value;
        } else {
            this.accessibilityFeatureFlags |= AccessibilityFeature.BOLD_TEXT.value;
        }
        sendLatestAccessibilityFlagsToFlutter();
    }

    private boolean shouldSetCollectionInfo(b bVar) {
        if (bVar.j <= 0) {
            return false;
        }
        b bVar2 = this.accessibilityFocusedSemanticsNode;
        b bVar3 = null;
        if (bVar2 != null) {
            b bVar4 = bVar2.P;
            while (true) {
                if (bVar4 == null) {
                    bVar4 = null;
                    break;
                }
                if (lambda$shouldSetCollectionInfo$0(bVar, bVar4)) {
                    break;
                }
                bVar4 = bVar4.P;
            }
            if (bVar4 != null) {
                return true;
            }
        }
        b bVar5 = this.accessibilityFocusedSemanticsNode;
        if (bVar5 == null) {
            return true;
        }
        b bVar6 = bVar5.P;
        while (true) {
            if (bVar6 == null) {
                break;
            }
            if (lambda$shouldSetCollectionInfo$1(bVar6)) {
                bVar3 = bVar6;
                break;
            }
            bVar6 = bVar6.P;
        }
        return bVar3 == null;
    }

    private void willRemoveSemanticsNode(b bVar) {
        View d;
        Integer num;
        bVar.P = null;
        if (bVar.i != -1 && (num = this.embeddedAccessibilityFocusedNodeId) != null && this.accessibilityViewEmbedder.platformViewOfNode(num.intValue()) == this.platformViewsAccessibilityDelegate.d(bVar.i)) {
            sendAccessibilityEvent(this.embeddedAccessibilityFocusedNodeId.intValue(), 65536);
            this.embeddedAccessibilityFocusedNodeId = null;
        }
        int i = bVar.i;
        if (i != -1 && (d = this.platformViewsAccessibilityDelegate.d(i)) != null) {
            d.setImportantForAccessibility(4);
        }
        b bVar2 = this.accessibilityFocusedSemanticsNode;
        if (bVar2 == bVar) {
            sendAccessibilityEvent(bVar2.b, 65536);
            this.accessibilityFocusedSemanticsNode = null;
        }
        if (this.inputFocusedSemanticsNode == bVar) {
            this.inputFocusedSemanticsNode = null;
        }
        if (this.hoveredObject == bVar) {
            this.hoveredObject = null;
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        CharSequence b;
        int i2;
        int i3;
        boolean z = true;
        setAccessibleNavigation(true);
        if (i >= 65536) {
            return this.accessibilityViewEmbedder.createAccessibilityNodeInfo(i);
        }
        if (i == -1) {
            AccessibilityNodeInfo obtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(this.rootAccessibilityView);
            this.rootAccessibilityView.onInitializeAccessibilityNodeInfo(obtainAccessibilityNodeInfo);
            if (this.flutterSemanticsTree.containsKey(0)) {
                obtainAccessibilityNodeInfo.addChild(this.rootAccessibilityView, 0);
            }
            obtainAccessibilityNodeInfo.setImportantForAccessibility(false);
            return obtainAccessibilityNodeInfo;
        }
        b bVar = this.flutterSemanticsTree.get(Integer.valueOf(i));
        CharSequence charSequence = null;
        if (bVar != null) {
            int i4 = bVar.i;
            if (i4 == -1 || !this.platformViewsAccessibilityDelegate.g(i4)) {
                AccessibilityNodeInfo obtainAccessibilityNodeInfo2 = obtainAccessibilityNodeInfo(this.rootAccessibilityView, i);
                obtainAccessibilityNodeInfo2.setImportantForAccessibility(isImportant(bVar));
                obtainAccessibilityNodeInfo2.setViewIdResourceName("");
                String str = bVar.o;
                if (str != null) {
                    obtainAccessibilityNodeInfo2.setViewIdResourceName(str);
                }
                obtainAccessibilityNodeInfo2.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
                obtainAccessibilityNodeInfo2.setClassName(AndroidComposeViewAccessibilityDelegateCompat.ClassName);
                obtainAccessibilityNodeInfo2.setSource(this.rootAccessibilityView, i);
                obtainAccessibilityNodeInfo2.setFocusable(bVar.j());
                b bVar2 = this.inputFocusedSemanticsNode;
                if (bVar2 != null) {
                    obtainAccessibilityNodeInfo2.setFocused(bVar2.b == i);
                }
                b bVar3 = this.accessibilityFocusedSemanticsNode;
                if (bVar3 != null) {
                    obtainAccessibilityNodeInfo2.setAccessibilityFocused(bVar3.b == i);
                }
                Flag flag = Flag.IS_TEXT_FIELD;
                if (bVar.h(flag)) {
                    obtainAccessibilityNodeInfo2.setPassword(bVar.h(Flag.IS_OBSCURED));
                    if (!bVar.h(Flag.IS_READ_ONLY)) {
                        obtainAccessibilityNodeInfo2.setClassName(AndroidComposeViewAccessibilityDelegateCompat.TextFieldClassName);
                    }
                    obtainAccessibilityNodeInfo2.setEditable(!bVar.h(r8));
                    int i5 = bVar.g;
                    if (i5 != -1 && (i3 = bVar.h) != -1) {
                        obtainAccessibilityNodeInfo2.setTextSelection(i5, i3);
                    }
                    b bVar4 = this.accessibilityFocusedSemanticsNode;
                    if (bVar4 != null && bVar4.b == i) {
                        obtainAccessibilityNodeInfo2.setLiveRegion(1);
                    }
                    if (b.a(bVar, Action.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                        obtainAccessibilityNodeInfo2.addAction(256);
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    if (b.a(bVar, Action.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                        obtainAccessibilityNodeInfo2.addAction(512);
                        i2 = 1;
                    }
                    if (b.a(bVar, Action.MOVE_CURSOR_FORWARD_BY_WORD)) {
                        obtainAccessibilityNodeInfo2.addAction(256);
                        i2 |= 2;
                    }
                    if (b.a(bVar, Action.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                        obtainAccessibilityNodeInfo2.addAction(512);
                        i2 |= 2;
                    }
                    obtainAccessibilityNodeInfo2.setMovementGranularities(i2);
                    if (bVar.e >= 0) {
                        String str2 = bVar.r;
                        obtainAccessibilityNodeInfo2.setMaxTextLength(((str2 == null ? 0 : str2.length()) - bVar.f) + bVar.e);
                    }
                }
                if (b.a(bVar, Action.SET_SELECTION)) {
                    obtainAccessibilityNodeInfo2.addAction(131072);
                }
                if (b.a(bVar, Action.COPY)) {
                    obtainAccessibilityNodeInfo2.addAction(16384);
                }
                if (b.a(bVar, Action.CUT)) {
                    obtainAccessibilityNodeInfo2.addAction(65536);
                }
                if (b.a(bVar, Action.PASTE)) {
                    obtainAccessibilityNodeInfo2.addAction(32768);
                }
                if (b.a(bVar, Action.SET_TEXT)) {
                    obtainAccessibilityNodeInfo2.addAction(2097152);
                }
                if (bVar.h(Flag.IS_BUTTON)) {
                    obtainAccessibilityNodeInfo2.setClassName("android.widget.Button");
                }
                if (bVar.h(Flag.IS_IMAGE)) {
                    obtainAccessibilityNodeInfo2.setClassName("android.widget.ImageView");
                }
                if (b.a(bVar, Action.DISMISS)) {
                    obtainAccessibilityNodeInfo2.setDismissable(true);
                    obtainAccessibilityNodeInfo2.addAction(1048576);
                }
                b bVar5 = bVar.P;
                View view = this.rootAccessibilityView;
                if (bVar5 != null) {
                    obtainAccessibilityNodeInfo2.setParent(view, bVar5.b);
                } else {
                    obtainAccessibilityNodeInfo2.setParent(view);
                }
                int i6 = bVar.B;
                if (i6 != -1) {
                    obtainAccessibilityNodeInfo2.setTraversalAfter(this.rootAccessibilityView, i6);
                }
                Rect rect = bVar.Z;
                b bVar6 = bVar.P;
                if (bVar6 != null) {
                    Rect rect2 = bVar6.Z;
                    Rect rect3 = new Rect(rect);
                    rect3.offset(-rect2.left, -rect2.top);
                    obtainAccessibilityNodeInfo2.setBoundsInParent(rect3);
                } else {
                    obtainAccessibilityNodeInfo2.setBoundsInParent(rect);
                }
                obtainAccessibilityNodeInfo2.setBoundsInScreen(getBoundsInScreen(rect));
                obtainAccessibilityNodeInfo2.setVisibleToUser(true);
                obtainAccessibilityNodeInfo2.setEnabled(!bVar.h(Flag.HAS_ENABLED_STATE) || bVar.h(Flag.IS_ENABLED));
                if (b.a(bVar, Action.TAP)) {
                    if (bVar.T != null) {
                        obtainAccessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, bVar.T.e));
                        obtainAccessibilityNodeInfo2.setClickable(true);
                    } else {
                        obtainAccessibilityNodeInfo2.addAction(16);
                        obtainAccessibilityNodeInfo2.setClickable(true);
                    }
                } else if (bVar.h(Flag.IS_SLIDER)) {
                    obtainAccessibilityNodeInfo2.addAction(16);
                    obtainAccessibilityNodeInfo2.setClickable(true);
                }
                if (b.a(bVar, Action.LONG_PRESS)) {
                    if (bVar.U != null) {
                        obtainAccessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, bVar.U.e));
                        obtainAccessibilityNodeInfo2.setLongClickable(true);
                    } else {
                        obtainAccessibilityNodeInfo2.addAction(32);
                        obtainAccessibilityNodeInfo2.setLongClickable(true);
                    }
                }
                Action action = Action.SCROLL_LEFT;
                if (b.a(bVar, action) || b.a(bVar, Action.SCROLL_UP) || b.a(bVar, Action.SCROLL_RIGHT) || b.a(bVar, Action.SCROLL_DOWN)) {
                    obtainAccessibilityNodeInfo2.setScrollable(true);
                    if (bVar.h(Flag.HAS_IMPLICIT_SCROLLING)) {
                        if (b.a(bVar, action) || b.a(bVar, Action.SCROLL_RIGHT)) {
                            if (shouldSetCollectionInfo(bVar)) {
                                obtainAccessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(0, bVar.j, false));
                            } else {
                                obtainAccessibilityNodeInfo2.setClassName("android.widget.HorizontalScrollView");
                            }
                        } else if (shouldSetCollectionInfo(bVar)) {
                            obtainAccessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(bVar.j, 0, false));
                        } else {
                            obtainAccessibilityNodeInfo2.setClassName("android.widget.ScrollView");
                        }
                    }
                    if (b.a(bVar, action) || b.a(bVar, Action.SCROLL_UP)) {
                        obtainAccessibilityNodeInfo2.addAction(4096);
                    }
                    if (b.a(bVar, Action.SCROLL_RIGHT) || b.a(bVar, Action.SCROLL_DOWN)) {
                        obtainAccessibilityNodeInfo2.addAction(8192);
                    }
                }
                Action action2 = Action.INCREASE;
                if (b.a(bVar, action2) || b.a(bVar, Action.DECREASE)) {
                    obtainAccessibilityNodeInfo2.setClassName("android.widget.SeekBar");
                    if (b.a(bVar, action2)) {
                        obtainAccessibilityNodeInfo2.addAction(4096);
                    }
                    if (b.a(bVar, Action.DECREASE)) {
                        obtainAccessibilityNodeInfo2.addAction(8192);
                    }
                }
                if (bVar.h(Flag.IS_LIVE_REGION)) {
                    obtainAccessibilityNodeInfo2.setLiveRegion(1);
                }
                if (bVar.h(flag)) {
                    obtainAccessibilityNodeInfo2.setText(b.d(bVar.r, bVar.s));
                    CharSequence[] charSequenceArr = {bVar.e(), b.d(bVar.x, bVar.y)};
                    for (int i7 = 0; i7 < 2; i7++) {
                        CharSequence charSequence2 = charSequenceArr[i7];
                        if (charSequence2 != null && charSequence2.length() > 0) {
                            charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, Extension.FIX_SPACE, charSequence2);
                        }
                    }
                    obtainAccessibilityNodeInfo2.setHintText(charSequence);
                } else if (!bVar.h(Flag.SCOPES_ROUTE) && (b = b.b(bVar)) != null) {
                    obtainAccessibilityNodeInfo2.setContentDescription(b);
                }
                String str3 = bVar.z;
                if (str3 != null) {
                    obtainAccessibilityNodeInfo2.setTooltipText(str3);
                    if (b.b(bVar) == null) {
                        obtainAccessibilityNodeInfo2.setContentDescription(bVar.z);
                    }
                }
                boolean h = bVar.h(Flag.HAS_CHECKED_STATE);
                boolean h2 = bVar.h(Flag.HAS_TOGGLED_STATE);
                if (!h && !h2) {
                    z = false;
                }
                obtainAccessibilityNodeInfo2.setCheckable(z);
                if (h) {
                    obtainAccessibilityNodeInfo2.setChecked(bVar.h(Flag.IS_CHECKED));
                    if (bVar.h(Flag.IS_IN_MUTUALLY_EXCLUSIVE_GROUP)) {
                        obtainAccessibilityNodeInfo2.setClassName("android.widget.RadioButton");
                    } else {
                        obtainAccessibilityNodeInfo2.setClassName("android.widget.CheckBox");
                    }
                } else if (h2) {
                    obtainAccessibilityNodeInfo2.setChecked(bVar.h(Flag.IS_TOGGLED));
                    obtainAccessibilityNodeInfo2.setClassName("android.widget.Switch");
                }
                obtainAccessibilityNodeInfo2.setSelected(bVar.h(Flag.IS_SELECTED));
                obtainAccessibilityNodeInfo2.setHeading(bVar.h(Flag.IS_HEADER));
                b bVar7 = this.accessibilityFocusedSemanticsNode;
                if (bVar7 == null || bVar7.b != i) {
                    obtainAccessibilityNodeInfo2.addAction(64);
                } else {
                    obtainAccessibilityNodeInfo2.addAction(128);
                }
                ArrayList arrayList = bVar.S;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        cg cgVar = (cg) it.next();
                        obtainAccessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(cgVar.a, cgVar.d));
                    }
                }
                Iterator it2 = bVar.Q.iterator();
                while (it2.hasNext()) {
                    b bVar8 = (b) it2.next();
                    if (!bVar8.h(Flag.IS_HIDDEN)) {
                        int i8 = bVar8.i;
                        if (i8 != -1) {
                            View d = this.platformViewsAccessibilityDelegate.d(i8);
                            if (!this.platformViewsAccessibilityDelegate.g(bVar8.i)) {
                                d.setImportantForAccessibility(0);
                                obtainAccessibilityNodeInfo2.addChild(d);
                            }
                        }
                        obtainAccessibilityNodeInfo2.addChild(this.rootAccessibilityView, bVar8.b);
                    }
                }
                return obtainAccessibilityNodeInfo2;
            }
            View d2 = this.platformViewsAccessibilityDelegate.d(bVar.i);
            if (d2 != null) {
                return this.accessibilityViewEmbedder.getRootNode(d2, bVar.b, bVar.Z);
            }
        }
        return null;
    }

    public boolean externalViewRequestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        if (!this.accessibilityViewEmbedder.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = this.accessibilityViewEmbedder.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.embeddedInputFocusedNodeId = recordFlutterId;
            this.inputFocusedSemanticsNode = null;
            return true;
        }
        if (eventType == 128) {
            this.hoveredObject = null;
            return true;
        }
        if (eventType == 32768) {
            this.embeddedAccessibilityFocusedNodeId = recordFlutterId;
            this.accessibilityFocusedSemanticsNode = null;
            return true;
        }
        if (eventType != 65536) {
            return true;
        }
        this.embeddedInputFocusedNodeId = null;
        this.embeddedAccessibilityFocusedNodeId = null;
        return true;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo findFocus(int i) {
        if (i == 1) {
            b bVar = this.inputFocusedSemanticsNode;
            if (bVar != null) {
                return createAccessibilityNodeInfo(bVar.b);
            }
            Integer num = this.embeddedInputFocusedNodeId;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        } else if (i != 2) {
            return null;
        }
        b bVar2 = this.accessibilityFocusedSemanticsNode;
        if (bVar2 != null) {
            return createAccessibilityNodeInfo(bVar2.b);
        }
        Integer num2 = this.embeddedAccessibilityFocusedNodeId;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    public boolean getAccessibleNavigation() {
        return this.accessibleNavigation;
    }

    public int getHoveredObjectId() {
        return this.hoveredObject.b;
    }

    public boolean isAccessibilityEnabled() {
        return this.accessibilityManager.isEnabled();
    }

    public boolean isTouchExplorationEnabled() {
        return this.accessibilityManager.isTouchExplorationEnabled();
    }

    public AccessibilityNodeInfo obtainAccessibilityNodeInfo(View view) {
        return AccessibilityNodeInfo.obtain(view);
    }

    public boolean onAccessibilityHoverEvent(MotionEvent motionEvent, boolean z) {
        if (!this.accessibilityManager.isTouchExplorationEnabled() || this.flutterSemanticsTree.isEmpty()) {
            return false;
        }
        b i = getRootSemanticsNode().i(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z);
        if (i != null && i.i != -1) {
            if (z) {
                return false;
            }
            return this.accessibilityViewEmbedder.onAccessibilityHoverEvent(i.b, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            handleTouchExploration(motionEvent.getX(), motionEvent.getY(), z);
        } else {
            if (motionEvent.getAction() != 10) {
                motionEvent.toString();
                return false;
            }
            onTouchExplorationExit();
        }
        return true;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i, int i2, Bundle bundle) {
        if (i >= 65536) {
            boolean performAction = this.accessibilityViewEmbedder.performAction(i, i2, bundle);
            if (performAction && i2 == 128) {
                this.embeddedAccessibilityFocusedNodeId = null;
            }
            return performAction;
        }
        b bVar = this.flutterSemanticsTree.get(Integer.valueOf(i));
        if (bVar != null) {
            switch (i2) {
                case 16:
                    this.accessibilityChannel.a(i, Action.TAP);
                    return true;
                case 32:
                    this.accessibilityChannel.a(i, Action.LONG_PRESS);
                    return true;
                case 64:
                    if (this.accessibilityFocusedSemanticsNode == null) {
                        this.rootAccessibilityView.invalidate();
                    }
                    this.accessibilityFocusedSemanticsNode = bVar;
                    this.accessibilityChannel.a(i, Action.DID_GAIN_ACCESSIBILITY_FOCUS);
                    HashMap hashMap = new HashMap();
                    hashMap.put("type", "didGainFocus");
                    hashMap.put("nodeId", Integer.valueOf(bVar.b));
                    this.accessibilityChannel.a.z(hashMap, null);
                    sendAccessibilityEvent(i, 32768);
                    if (!b.a(bVar, Action.INCREASE) && !b.a(bVar, Action.DECREASE)) {
                        return true;
                    }
                    sendAccessibilityEvent(i, 4);
                    return true;
                case 128:
                    b bVar2 = this.accessibilityFocusedSemanticsNode;
                    if (bVar2 != null && bVar2.b == i) {
                        this.accessibilityFocusedSemanticsNode = null;
                    }
                    Integer num = this.embeddedAccessibilityFocusedNodeId;
                    if (num != null && num.intValue() == i) {
                        this.embeddedAccessibilityFocusedNodeId = null;
                    }
                    this.accessibilityChannel.a(i, Action.DID_LOSE_ACCESSIBILITY_FOCUS);
                    sendAccessibilityEvent(i, 65536);
                    return true;
                case 256:
                    return performCursorMoveAction(bVar, i, bundle, true);
                case 512:
                    return performCursorMoveAction(bVar, i, bundle, false);
                case 4096:
                    Action action = Action.SCROLL_UP;
                    if (b.a(bVar, action)) {
                        this.accessibilityChannel.a(i, action);
                        return true;
                    }
                    Action action2 = Action.SCROLL_LEFT;
                    if (b.a(bVar, action2)) {
                        this.accessibilityChannel.a(i, action2);
                        return true;
                    }
                    Action action3 = Action.INCREASE;
                    if (b.a(bVar, action3)) {
                        bVar.r = bVar.t;
                        bVar.s = bVar.u;
                        sendAccessibilityEvent(i, 4);
                        this.accessibilityChannel.a(i, action3);
                        return true;
                    }
                    break;
                case 8192:
                    Action action4 = Action.SCROLL_DOWN;
                    if (b.a(bVar, action4)) {
                        this.accessibilityChannel.a(i, action4);
                        return true;
                    }
                    Action action5 = Action.SCROLL_RIGHT;
                    if (b.a(bVar, action5)) {
                        this.accessibilityChannel.a(i, action5);
                        return true;
                    }
                    Action action6 = Action.DECREASE;
                    if (b.a(bVar, action6)) {
                        bVar.r = bVar.v;
                        bVar.s = bVar.w;
                        sendAccessibilityEvent(i, 4);
                        this.accessibilityChannel.a(i, action6);
                        return true;
                    }
                    break;
                case 16384:
                    this.accessibilityChannel.a(i, Action.COPY);
                    return true;
                case 32768:
                    this.accessibilityChannel.a(i, Action.PASTE);
                    return true;
                case 65536:
                    this.accessibilityChannel.a(i, Action.CUT);
                    return true;
                case 131072:
                    HashMap hashMap2 = new HashMap();
                    if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                        hashMap2.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                        hashMap2.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                    } else {
                        hashMap2.put("base", Integer.valueOf(bVar.h));
                        hashMap2.put("extent", Integer.valueOf(bVar.h));
                    }
                    this.accessibilityChannel.b(i, Action.SET_SELECTION, hashMap2);
                    b bVar3 = this.flutterSemanticsTree.get(Integer.valueOf(i));
                    bVar3.g = ((Integer) hashMap2.get("base")).intValue();
                    bVar3.h = ((Integer) hashMap2.get("extent")).intValue();
                    return true;
                case 1048576:
                    this.accessibilityChannel.a(i, Action.DISMISS);
                    return true;
                case 2097152:
                    return performSetText(bVar, i, bundle);
                case 16908342:
                    this.accessibilityChannel.a(i, Action.SHOW_ON_SCREEN);
                    return true;
                default:
                    cg cgVar = this.customAccessibilityActions.get(Integer.valueOf(i2 - FIRST_RESOURCE_ID));
                    if (cgVar != null) {
                        this.accessibilityChannel.b(i, Action.CUSTOM_ACTION, Integer.valueOf(cgVar.b));
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    public void release() {
        this.isReleased = true;
        this.platformViewsAccessibilityDelegate.h();
        setOnAccessibilityChangeListener(null);
        this.accessibilityManager.removeAccessibilityStateChangeListener(this.accessibilityStateChangeListener);
        this.accessibilityManager.removeTouchExplorationStateChangeListener(this.touchExplorationStateChangeListener);
        this.contentResolver.unregisterContentObserver(this.animationScaleObserver);
        pg pgVar = this.accessibilityChannel;
        pgVar.c = null;
        pgVar.b.setAccessibilityDelegate(null);
    }

    public void reset() {
        this.flutterSemanticsTree.clear();
        b bVar = this.accessibilityFocusedSemanticsNode;
        if (bVar != null) {
            sendAccessibilityEvent(bVar.b, 65536);
        }
        this.accessibilityFocusedSemanticsNode = null;
        this.hoveredObject = null;
        sendWindowContentChangeEvent(0);
    }

    public void setOnAccessibilityChangeListener(eg egVar) {
        this.onAccessibilityChangeListener = egVar;
    }

    public void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        while (byteBuffer.hasRemaining()) {
            cg orCreateAccessibilityAction = getOrCreateAccessibilityAction(byteBuffer.getInt());
            orCreateAccessibilityAction.c = byteBuffer.getInt();
            int i = byteBuffer.getInt();
            String str = null;
            orCreateAccessibilityAction.d = i == -1 ? null : strArr[i];
            int i2 = byteBuffer.getInt();
            if (i2 != -1) {
                str = strArr[i2];
            }
            orCreateAccessibilityAction.e = str;
        }
    }

    public void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        b bVar;
        int i;
        int i2;
        b bVar2;
        String str;
        String str2;
        float f;
        float f2;
        View d;
        ArrayList arrayList = new ArrayList();
        while (byteBuffer.hasRemaining()) {
            b orCreateSemanticsNode = getOrCreateSemanticsNode(byteBuffer.getInt());
            ArrayList arrayList2 = orCreateSemanticsNode.R;
            ArrayList arrayList3 = orCreateSemanticsNode.Q;
            AccessibilityBridge accessibilityBridge = orCreateSemanticsNode.a;
            orCreateSemanticsNode.C = true;
            orCreateSemanticsNode.I = orCreateSemanticsNode.r;
            orCreateSemanticsNode.J = orCreateSemanticsNode.p;
            orCreateSemanticsNode.D = orCreateSemanticsNode.c;
            orCreateSemanticsNode.E = orCreateSemanticsNode.d;
            orCreateSemanticsNode.F = orCreateSemanticsNode.g;
            orCreateSemanticsNode.G = orCreateSemanticsNode.h;
            orCreateSemanticsNode.H = orCreateSemanticsNode.l;
            orCreateSemanticsNode.c = byteBuffer.getLong();
            orCreateSemanticsNode.d = byteBuffer.getInt();
            orCreateSemanticsNode.e = byteBuffer.getInt();
            orCreateSemanticsNode.f = byteBuffer.getInt();
            orCreateSemanticsNode.g = byteBuffer.getInt();
            orCreateSemanticsNode.h = byteBuffer.getInt();
            orCreateSemanticsNode.i = byteBuffer.getInt();
            orCreateSemanticsNode.j = byteBuffer.getInt();
            orCreateSemanticsNode.k = byteBuffer.getInt();
            orCreateSemanticsNode.l = byteBuffer.getFloat();
            orCreateSemanticsNode.m = byteBuffer.getFloat();
            orCreateSemanticsNode.n = byteBuffer.getFloat();
            int i3 = byteBuffer.getInt();
            orCreateSemanticsNode.o = i3 == -1 ? null : strArr[i3];
            int i4 = byteBuffer.getInt();
            orCreateSemanticsNode.p = i4 == -1 ? null : strArr[i4];
            orCreateSemanticsNode.q = b.g(byteBuffer, byteBufferArr);
            int i5 = byteBuffer.getInt();
            orCreateSemanticsNode.r = i5 == -1 ? null : strArr[i5];
            orCreateSemanticsNode.s = b.g(byteBuffer, byteBufferArr);
            int i6 = byteBuffer.getInt();
            orCreateSemanticsNode.t = i6 == -1 ? null : strArr[i6];
            orCreateSemanticsNode.u = b.g(byteBuffer, byteBufferArr);
            int i7 = byteBuffer.getInt();
            orCreateSemanticsNode.v = i7 == -1 ? null : strArr[i7];
            orCreateSemanticsNode.w = b.g(byteBuffer, byteBufferArr);
            int i8 = byteBuffer.getInt();
            orCreateSemanticsNode.x = i8 == -1 ? null : strArr[i8];
            orCreateSemanticsNode.y = b.g(byteBuffer, byteBufferArr);
            int i9 = byteBuffer.getInt();
            orCreateSemanticsNode.z = i9 == -1 ? null : strArr[i9];
            int i10 = byteBuffer.getInt();
            orCreateSemanticsNode.A = i10 == -1 ? null : strArr[i10];
            byteBuffer.getInt();
            orCreateSemanticsNode.K = byteBuffer.getFloat();
            orCreateSemanticsNode.L = byteBuffer.getFloat();
            orCreateSemanticsNode.M = byteBuffer.getFloat();
            orCreateSemanticsNode.N = byteBuffer.getFloat();
            if (orCreateSemanticsNode.O == null) {
                orCreateSemanticsNode.O = new float[16];
            }
            for (int i11 = 0; i11 < 16; i11++) {
                orCreateSemanticsNode.O[i11] = byteBuffer.getFloat();
            }
            orCreateSemanticsNode.V = true;
            orCreateSemanticsNode.X = true;
            int i12 = byteBuffer.getInt();
            arrayList3.clear();
            arrayList2.clear();
            for (int i13 = 0; i13 < i12; i13++) {
                b orCreateSemanticsNode2 = accessibilityBridge.getOrCreateSemanticsNode(byteBuffer.getInt());
                orCreateSemanticsNode2.P = orCreateSemanticsNode;
                arrayList3.add(orCreateSemanticsNode2);
            }
            for (int i14 = 0; i14 < i12; i14++) {
                b orCreateSemanticsNode3 = accessibilityBridge.getOrCreateSemanticsNode(byteBuffer.getInt());
                orCreateSemanticsNode3.P = orCreateSemanticsNode;
                arrayList2.add(orCreateSemanticsNode3);
            }
            int i15 = byteBuffer.getInt();
            if (i15 == 0) {
                orCreateSemanticsNode.S = null;
            } else {
                ArrayList arrayList4 = orCreateSemanticsNode.S;
                if (arrayList4 == null) {
                    orCreateSemanticsNode.S = new ArrayList(i15);
                } else {
                    arrayList4.clear();
                }
                for (int i16 = 0; i16 < i15; i16++) {
                    cg orCreateAccessibilityAction = accessibilityBridge.getOrCreateAccessibilityAction(byteBuffer.getInt());
                    int i17 = orCreateAccessibilityAction.c;
                    if (i17 == Action.TAP.value) {
                        orCreateSemanticsNode.T = orCreateAccessibilityAction;
                    } else if (i17 == Action.LONG_PRESS.value) {
                        orCreateSemanticsNode.U = orCreateAccessibilityAction;
                    } else {
                        orCreateSemanticsNode.S.add(orCreateAccessibilityAction);
                    }
                    orCreateSemanticsNode.S.add(orCreateAccessibilityAction);
                }
            }
            if (!orCreateSemanticsNode.h(Flag.IS_HIDDEN)) {
                if (orCreateSemanticsNode.h(Flag.IS_FOCUSED)) {
                    this.inputFocusedSemanticsNode = orCreateSemanticsNode;
                }
                if (orCreateSemanticsNode.C) {
                    arrayList.add(orCreateSemanticsNode);
                }
                int i18 = orCreateSemanticsNode.i;
                if (i18 != -1 && !this.platformViewsAccessibilityDelegate.g(i18) && (d = this.platformViewsAccessibilityDelegate.d(orCreateSemanticsNode.i)) != null) {
                    d.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        b rootSemanticsNode = getRootSemanticsNode();
        ArrayList arrayList5 = new ArrayList();
        if (rootSemanticsNode != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            rootSemanticsNode.l(fArr, hashSet, false);
            rootSemanticsNode.c(arrayList5);
        }
        Iterator it = arrayList5.iterator();
        b bVar3 = null;
        while (it.hasNext()) {
            b bVar4 = (b) it.next();
            if (!this.flutterNavigationStack.contains(Integer.valueOf(bVar4.b))) {
                bVar3 = bVar4;
            }
        }
        if (bVar3 == null && arrayList5.size() > 0) {
            bVar3 = (b) unr0.k(1, arrayList5);
        }
        if (bVar3 != null && (bVar3.b != this.previousRouteId || arrayList5.size() != this.flutterNavigationStack.size())) {
            this.previousRouteId = bVar3.b;
            onWindowNameChange(bVar3);
        }
        this.flutterNavigationStack.clear();
        Iterator it2 = arrayList5.iterator();
        while (it2.hasNext()) {
            this.flutterNavigationStack.add(Integer.valueOf(((b) it2.next()).b));
        }
        Iterator<Map.Entry<Integer, b>> it3 = this.flutterSemanticsTree.entrySet().iterator();
        while (it3.hasNext()) {
            b value = it3.next().getValue();
            if (!hashSet.contains(value)) {
                willRemoveSemanticsNode(value);
                it3.remove();
            }
        }
        sendWindowContentChangeEvent(0);
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            b bVar5 = (b) it4.next();
            if (!Float.isNaN(bVar5.l) && !Float.isNaN(bVar5.H) && bVar5.H != bVar5.l) {
                AccessibilityEvent obtainAccessibilityEvent = obtainAccessibilityEvent(bVar5.b, 4096);
                float f3 = bVar5.l;
                float f4 = bVar5.m;
                if (Float.isInfinite(f4)) {
                    if (f3 > SCROLL_POSITION_CAP_FOR_INFINITY) {
                        f3 = 70000.0f;
                    }
                    f4 = 100000.0f;
                }
                if (Float.isInfinite(bVar5.n)) {
                    f = f4 + SCROLL_EXTENT_FOR_INFINITY;
                    if (f3 < -70000.0f) {
                        f3 = -70000.0f;
                    }
                    f2 = f3 + SCROLL_EXTENT_FOR_INFINITY;
                } else {
                    float f5 = bVar5.n;
                    f = f4 - f5;
                    f2 = f3 - f5;
                }
                Action action = Action.SCROLL_UP;
                int i19 = bVar5.E;
                if ((action.value & i19) != 0 || (Action.SCROLL_DOWN.value & i19) != 0) {
                    obtainAccessibilityEvent.setScrollY((int) f2);
                    obtainAccessibilityEvent.setMaxScrollY((int) f);
                } else if ((Action.SCROLL_LEFT.value & i19) != 0 || (Action.SCROLL_RIGHT.value & i19) != 0) {
                    obtainAccessibilityEvent.setScrollX((int) f2);
                    obtainAccessibilityEvent.setMaxScrollX((int) f);
                }
                int i20 = bVar5.j;
                if (i20 > 0) {
                    obtainAccessibilityEvent.setItemCount(i20);
                    obtainAccessibilityEvent.setFromIndex(bVar5.k);
                    Iterator it5 = bVar5.R.iterator();
                    int i21 = 0;
                    while (it5.hasNext()) {
                        if (!((b) it5.next()).h(Flag.IS_HIDDEN)) {
                            i21++;
                        }
                    }
                    obtainAccessibilityEvent.setToIndex((bVar5.k + i21) - 1);
                }
                sendAccessibilityEvent(obtainAccessibilityEvent);
            }
            if (bVar5.h(Flag.IS_LIVE_REGION) && (((str = bVar5.p) != null || bVar5.J != null) && (str == null || (str2 = bVar5.J) == null || !str.equals(str2)))) {
                sendWindowContentChangeEvent(bVar5.b);
            }
            b bVar6 = this.accessibilityFocusedSemanticsNode;
            if (bVar6 != null && bVar6.b == bVar5.b) {
                Flag flag = Flag.IS_SELECTED;
                if ((bVar5.D & flag.value) == 0 && bVar5.h(flag)) {
                    AccessibilityEvent obtainAccessibilityEvent2 = obtainAccessibilityEvent(bVar5.b, 4);
                    obtainAccessibilityEvent2.getText().add(bVar5.p);
                    sendAccessibilityEvent(obtainAccessibilityEvent2);
                }
            }
            b bVar7 = this.inputFocusedSemanticsNode;
            if (bVar7 != null && (i = bVar7.b) == (i2 = bVar5.b) && ((bVar2 = this.lastInputFocusedSemanticsNode) == null || bVar2.b != i)) {
                this.lastInputFocusedSemanticsNode = bVar7;
                sendAccessibilityEvent(obtainAccessibilityEvent(i2, 8));
            } else if (bVar7 == null) {
                this.lastInputFocusedSemanticsNode = null;
            }
            b bVar8 = this.inputFocusedSemanticsNode;
            if (bVar8 != null && bVar8.b == bVar5.b) {
                Flag flag2 = Flag.IS_TEXT_FIELD;
                if ((bVar5.D & flag2.value) != 0 && bVar5.h(flag2) && ((bVar = this.accessibilityFocusedSemanticsNode) == null || bVar.b == this.inputFocusedSemanticsNode.b)) {
                    String str3 = bVar5.I;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = bVar5.r;
                    String str5 = str4 != null ? str4 : "";
                    AccessibilityEvent createTextChangedEvent = createTextChangedEvent(bVar5.b, str3, str5);
                    if (createTextChangedEvent != null) {
                        sendAccessibilityEvent(createTextChangedEvent);
                    }
                    if (bVar5.F != bVar5.g || bVar5.G != bVar5.h) {
                        AccessibilityEvent obtainAccessibilityEvent3 = obtainAccessibilityEvent(bVar5.b, 8192);
                        obtainAccessibilityEvent3.getText().add(str5);
                        obtainAccessibilityEvent3.setFromIndex(bVar5.g);
                        obtainAccessibilityEvent3.setToIndex(bVar5.h);
                        obtainAccessibilityEvent3.setItemCount(str5.length());
                        sendAccessibilityEvent(obtainAccessibilityEvent3);
                    }
                }
            }
        }
    }

    public AccessibilityNodeInfo obtainAccessibilityNodeInfo(View view, int i) {
        return AccessibilityNodeInfo.obtain(view, i);
    }

    public void sendAccessibilityEvent(int i, int i2) {
        if (this.accessibilityManager.isEnabled()) {
            sendAccessibilityEvent(obtainAccessibilityEvent(i, i2));
        }
    }

    public AccessibilityEvent obtainAccessibilityEvent(int i) {
        return AccessibilityEvent.obtain(i);
    }

    public boolean onAccessibilityHoverEvent(MotionEvent motionEvent) {
        return onAccessibilityHoverEvent(motionEvent, false);
    }

    public AccessibilityBridge(View view, pg pgVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, xwc0 xwc0Var) {
        this(view, pgVar, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, 65536), xwc0Var);
    }
}
