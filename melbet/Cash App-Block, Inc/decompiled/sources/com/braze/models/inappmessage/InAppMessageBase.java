package com.braze.models.inappmessage;

import android.graphics.Color;
import android.net.Uri;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.a9;
import bo.app.aa;
import bo.app.ba;
import bo.app.ca;
import bo.app.da;
import bo.app.jg$$ExternalSyntheticLambda1;
import bo.app.ma;
import bo.app.ne;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.enums.inappmessage.CropType;
import com.braze.enums.inappmessage.DismissType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.Orientation;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.models.Banner$$ExternalSyntheticLambda0;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.i;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.JobKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0015\b'\u0018\u0000 \u009d\u00012\u00020\u00012\u00020\u0002:\u0002\u009e\u0001B-\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\u00020\u000f2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\u00020\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010&\u001a\u0004\u0018\u00010\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010,\u001a\u0004\u0018\u00010\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R(\u0010/\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b/\u00100\u0012\u0004\b4\u0010\u0011\u001a\u0004\b1\u0010\r\"\u0004\b2\u00103R.\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u00178\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010\u001aR(\u0010:\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b:\u00100\u0012\u0004\b=\u0010\u0011\u001a\u0004\b;\u0010\r\"\u0004\b<\u00103R(\u0010>\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b>\u00100\u0012\u0004\bA\u0010\u0011\u001a\u0004\b?\u0010\r\"\u0004\b@\u00103R\"\u0010C\u001a\u00020B8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR*\u0010K\u001a\u00020I2\u0006\u0010J\u001a\u00020I8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010R\u001a\u00020Q8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010Y\u001a\u00020X8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010`\u001a\u00020_8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR$\u0010f\u001a\u0004\u0018\u00010\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bf\u0010'\u001a\u0004\bg\u0010)\"\u0004\bh\u0010+R\"\u0010j\u001a\u00020i8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010p\u001a\u00020I8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\bp\u0010L\u001a\u0004\bq\u0010N\"\u0004\br\u0010PR\"\u0010s\u001a\u00020I8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\bs\u0010L\u001a\u0004\bt\u0010N\"\u0004\bu\u0010PR\"\u0010v\u001a\u00020I8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\bv\u0010L\u001a\u0004\bw\u0010N\"\u0004\bx\u0010PR\"\u0010y\u001a\u00020I8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\by\u0010L\u001a\u0004\bz\u0010N\"\u0004\b{\u0010PR\"\u0010|\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b|\u00100\u001a\u0004\b|\u0010\r\"\u0004\b}\u00103R\u0014\u0010\b\u001a\u00020~8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u007fR\u0014\u0010\t\u001a\u00020~8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u007fR*\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0005\b\u0082\u0001\u0010\u001c\"\u0006\b\u0083\u0001\u0010\u0084\u0001R)\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0006\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R,\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R(\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010'\u001a\u0005\b\u0092\u0001\u0010)\"\u0005\b\u0093\u0001\u0010+R\u0017\u0010\u0096\u0001\u001a\u00020 8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0019\u0010\u0099\u0001\u001a\u0004\u0018\u00010#8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0016\u0010\u009a\u0001\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010\rR\u0015\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010)¨\u0006\u009f\u0001"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageBase;", "Lcom/braze/models/inappmessage/IInAppMessage;", "Lcom/braze/models/inappmessage/IInAppMessageThemeable;", "Lorg/json/JSONObject;", "json", "Lbo/app/a9;", "brazeManager", "", "impressionLogged", "clickLogged", "<init>", "(Lorg/json/JSONObject;Lbo/app/a9;ZZ)V", "logImpression", "()Z", "logClick", "", "onAfterClosed", "()V", "enableDarkTheme", "", "", "getRemoteAssetPathsForPrefetch", "()Ljava/util/List;", "", "remotePathToLocalAssetMap", "setLocalPrefetchedAssetPaths", "(Ljava/util/Map;)V", "forJsonPut", "()Lorg/json/JSONObject;", "buttonId", "handleLogClick", "(Ljava/lang/String;)Z", "Lcom/braze/enums/inappmessage/ClickAction;", "internalClickAction", "Lcom/braze/enums/inappmessage/ClickAction;", "Landroid/net/Uri;", "internalUri", "Landroid/net/Uri;", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "icon", "getIcon", "setIcon", "openUriInWebView", "Z", "getOpenUriInWebView", "setOpenUriInWebView", "(Z)V", "getOpenUriInWebView$annotations", "extras", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "setExtras", "animateIn", "getAnimateIn", "setAnimateIn", "getAnimateIn$annotations", "animateOut", "getAnimateOut", "setAnimateOut", "getAnimateOut$annotations", "Lcom/braze/enums/inappmessage/DismissType;", "dismissType", "Lcom/braze/enums/inappmessage/DismissType;", "getDismissType", "()Lcom/braze/enums/inappmessage/DismissType;", "setDismissType", "(Lcom/braze/enums/inappmessage/DismissType;)V", "", "value", "durationInMilliseconds", "I", "getDurationInMilliseconds", "()I", "setDurationInMilliseconds", "(I)V", "Lcom/braze/enums/inappmessage/Orientation;", "orientation", "Lcom/braze/enums/inappmessage/Orientation;", "getOrientation", "()Lcom/braze/enums/inappmessage/Orientation;", "setOrientation", "(Lcom/braze/enums/inappmessage/Orientation;)V", "Lcom/braze/enums/inappmessage/CropType;", "cropType", "Lcom/braze/enums/inappmessage/CropType;", "getCropType", "()Lcom/braze/enums/inappmessage/CropType;", "setCropType", "(Lcom/braze/enums/inappmessage/CropType;)V", "Lcom/braze/enums/inappmessage/TextAlign;", "messageTextAlign", "Lcom/braze/enums/inappmessage/TextAlign;", "getMessageTextAlign", "()Lcom/braze/enums/inappmessage/TextAlign;", "setMessageTextAlign", "(Lcom/braze/enums/inappmessage/TextAlign;)V", "altImageText", "getAltImageText", "setAltImageText", "", "expirationTimestamp", "J", "getExpirationTimestamp", "()J", "setExpirationTimestamp", "(J)V", "iconBackgroundColor", "getIconBackgroundColor", "setIconBackgroundColor", "messageTextColor", "getMessageTextColor", "setMessageTextColor", "backgroundColor", "getBackgroundColor", "setBackgroundColor", "iconColor", "getIconColor", "setIconColor", "isTestSend", "setTestSend", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "jsonObject", "Lorg/json/JSONObject;", "getJsonObject", "setJsonObject", "(Lorg/json/JSONObject;)V", "Lbo/app/a9;", "getBrazeManager", "()Lbo/app/a9;", "setBrazeManager", "(Lbo/app/a9;)V", "Lbo/app/ma;", "inAppMessageDarkThemeWrapper", "Lbo/app/ma;", "getInAppMessageDarkThemeWrapper", "()Lbo/app/ma;", "setInAppMessageDarkThemeWrapper", "(Lbo/app/ma;)V", "messageExtras", "getMessageExtras", "setMessageExtras", "getClickAction", "()Lcom/braze/enums/inappmessage/ClickAction;", "clickAction", "getUri", "()Landroid/net/Uri;", "uri", "isControl", "getTriggerId", "triggerId", "Companion", "bo/app/aa", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class InAppMessageBase implements IInAppMessage, IInAppMessageThemeable {
    public static final aa Companion = new aa();
    private String altImageText;
    private boolean animateIn;
    private boolean animateOut;
    private int backgroundColor;
    private a9 brazeManager;
    private final AtomicBoolean clickLogged;
    private CropType cropType;
    private DismissType dismissType;
    private int durationInMilliseconds;
    private long expirationTimestamp;
    private Map<String, String> extras;
    private String icon;
    private int iconBackgroundColor;
    private int iconColor;
    private final AtomicBoolean impressionLogged;
    private ma inAppMessageDarkThemeWrapper;
    private ClickAction internalClickAction;
    private Uri internalUri;
    private boolean isTestSend;
    private JSONObject jsonObject;
    private String message;
    private String messageExtras;
    private TextAlign messageTextAlign;
    private int messageTextColor;
    private boolean openUriInWebView;
    private Orientation orientation;

    public InAppMessageBase(JSONObject jSONObject, a9 a9Var, boolean z, boolean z2) {
        String upperCase;
        String upperCase2;
        int i;
        String upperCase3;
        int i2;
        jSONObject.getClass();
        a9Var.getClass();
        this.internalClickAction = ClickAction.NONE;
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        this.extras = emptyMap;
        this.animateIn = true;
        this.animateOut = true;
        this.dismissType = DismissType.AUTO_DISMISS;
        this.durationInMilliseconds = 5000;
        Orientation orientation = Orientation.ANY;
        this.orientation = orientation;
        this.cropType = CropType.FIT_CENTER;
        this.messageTextAlign = TextAlign.CENTER;
        this.expirationTimestamp = -1L;
        this.iconBackgroundColor = Color.parseColor("#ff0073d5");
        this.messageTextColor = Color.parseColor("#555555");
        this.backgroundColor = -1;
        this.iconColor = -1;
        this.impressionLogged = new AtomicBoolean(false);
        this.clickLogged = new AtomicBoolean(false);
        this.jsonObject = jSONObject;
        this.brazeManager = a9Var;
        setMessage(jSONObject.optString("message"));
        setAnimateIn(jSONObject.optBoolean("animate_in", true));
        setAnimateOut(jSONObject.optBoolean("animate_out", true));
        setDurationInMilliseconds(jSONObject.optInt("duration"));
        setIcon(jSONObject.optString("icon"));
        try {
            String string2 = jSONObject.getString("orientation");
            string2.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            upperCase3 = string2.toUpperCase(locale);
            upperCase3.getClass();
        } catch (Exception unused) {
        }
        for (Orientation orientation2 : Orientation.values()) {
            if (Intrinsics.areEqual(orientation2.name(), upperCase3)) {
                orientation = orientation2;
                setOrientation(orientation);
                setOpenUriInWebView(jSONObject.optBoolean("use_webview", false));
                setIconBackgroundColor(jSONObject.optInt("icon_bg_color"));
                setMessageTextColor(jSONObject.optInt("text_color"));
                setBackgroundColor(jSONObject.optInt("bg_color"));
                setIconColor(jSONObject.optInt("icon_color"));
                this.impressionLogged.set(z);
                this.clickLogged.set(z2);
                setExtras(JsonUtils.convertJSONObjectToMap(jSONObject.optJSONObject("extras")));
                if (jSONObject.has("message_extras")) {
                    setMessageExtras(jSONObject.optString("message_extras"));
                }
                String optString = jSONObject.optString("uri");
                ClickAction clickAction = ClickAction.NONE;
                try {
                    String string3 = jSONObject.getString("click_action");
                    string3.getClass();
                    Locale locale2 = Locale.US;
                    locale2.getClass();
                    upperCase2 = string3.toUpperCase(locale2);
                    upperCase2.getClass();
                } catch (Exception unused2) {
                }
                for (ClickAction clickAction2 : ClickAction.values()) {
                    if (Intrinsics.areEqual(clickAction2.name(), upperCase2)) {
                        clickAction = clickAction2;
                        if (clickAction == ClickAction.URI && optString != null && !StringsKt.isBlank(optString)) {
                            this.internalUri = Uri.parse(optString);
                        }
                        this.internalClickAction = clickAction;
                        DismissType dismissType = DismissType.AUTO_DISMISS;
                        try {
                            String string4 = jSONObject.getString("message_close");
                            string4.getClass();
                            Locale locale3 = Locale.US;
                            locale3.getClass();
                            upperCase = string4.toUpperCase(locale3);
                            upperCase.getClass();
                        } catch (Exception unused3) {
                        }
                        for (DismissType dismissType2 : DismissType.values()) {
                            if (Intrinsics.areEqual(dismissType2.name(), upperCase)) {
                                dismissType = dismissType2;
                                setDismissType(dismissType == DismissType.SWIPE ? DismissType.MANUAL : dismissType);
                                setAltImageText(jSONObject.optString("image_alt"));
                                String str = i.a;
                                JSONObject optJSONObject = jSONObject.optJSONObject("themes");
                                JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject("dark") : null;
                                this.inAppMessageDarkThemeWrapper = optJSONObject2 != null ? new ma(optJSONObject2) : null;
                                jSONObject.put("is_test_send", getIsTestSend());
                                return;
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_durationInMilliseconds_$lambda$0(int i) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Requested in-app message duration ", " is lower than the minimum of 999. Defaulting to 5000 milliseconds.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_durationInMilliseconds_$lambda$1(int i) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Set in-app message duration to ", " milliseconds.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String enableDarkTheme$lambda$0() {
        return "Cannot apply dark theme with a null themes wrapper";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String forJsonPut$lambda$1() {
        return "Failed to construct json for in-app message";
    }

    private final boolean handleLogClick(String buttonId) {
        String triggerId = getTriggerId();
        if (triggerId == null || StringsKt.isBlank(triggerId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Banner$$ExternalSyntheticLambda0(27), 7, (Object) null);
            return false;
        }
        a9 a9Var = this.brazeManager;
        if (a9Var == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Banner$$ExternalSyntheticLambda0(25), 6, (Object) null);
            return false;
        }
        if (getMessageType() != MessageType.HTML && this.clickLogged.get()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Banner$$ExternalSyntheticLambda0(26), 6, (Object) null);
            return false;
        }
        this.clickLogged.set(true);
        JobKt.launch$default(ne.a, null, null, new ba(buttonId, triggerId, a9Var, null), 3);
        return true;
    }

    public static /* synthetic */ boolean handleLogClick$default(InAppMessageBase inAppMessageBase, String str, int i, Object obj) {
        if (obj != null) {
            a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: handleLogClick");
            return false;
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return inAppMessageBase.handleLogClick(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleLogClick$lambda$0() {
        return "Trigger id not found (this is expected for test sends). Not logging in-app message click.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleLogClick$lambda$1() {
        return "Cannot log an in-app message click because the BrazeManager is null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleLogClick$lambda$2() {
        return "Click already logged for this in-app message. Ignoring.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$0() {
        return "Trigger id not found (this is expected for test sends). Not logging in-app message impression.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$1() {
        return "Cannot log an in-app message impression because the BrazeManager is null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$2() {
        return "Impression already logged for this in-app message. Ignoring.";
    }

    @Override // com.braze.models.inappmessage.IInAppMessageThemeable
    public void enableDarkTheme() {
        ma maVar = this.inAppMessageDarkThemeWrapper;
        if (maVar == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Banner$$ExternalSyntheticLambda0(24), 7, (Object) null);
            return;
        }
        Integer num = maVar.a;
        if (num != null) {
            setBackgroundColor(num.intValue());
        }
        Integer num2 = maVar.d;
        if (num2 != null) {
            setIconColor(num2.intValue());
        }
        Integer num3 = maVar.e;
        if (num3 != null) {
            setIconBackgroundColor(num3.intValue());
        }
        Integer num4 = maVar.b;
        if (num4 != null) {
            setMessageTextColor(num4.intValue());
        }
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method */
    public JSONObject getJsonObject() {
        JSONObject jSONObject = this.jsonObject;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.putOpt("message", getMessage());
            jSONObject2.put("duration", getDurationInMilliseconds());
            jSONObject2.putOpt("trigger_id", getTriggerId());
            jSONObject2.putOpt("click_action", getInternalClickAction().toString());
            jSONObject2.putOpt("message_close", getDismissType().toString());
            if (getInternalUri() != null) {
                jSONObject2.put("uri", String.valueOf(getInternalUri()));
            }
            jSONObject2.put("use_webview", getOpenUriInWebView());
            jSONObject2.put("animate_in", getAnimateIn());
            jSONObject2.put("animate_out", getAnimateOut());
            jSONObject2.put("bg_color", getBackgroundColor());
            jSONObject2.put("text_color", getMessageTextColor());
            jSONObject2.put("icon_color", getIconColor());
            jSONObject2.put("icon_bg_color", getIconBackgroundColor());
            jSONObject2.putOpt("icon", getIcon());
            jSONObject2.putOpt("crop_type", getCropType().toString());
            jSONObject2.putOpt("orientation", getOrientation().toString());
            jSONObject2.putOpt("text_align_message", getMessageTextAlign().toString());
            jSONObject2.putOpt("image_alt", getAltImageText());
            jSONObject2.putOpt("is_control", Boolean.valueOf(isControl()));
            jSONObject2.put("is_test_send", getIsTestSend());
            if (!getExtras().isEmpty()) {
                jSONObject2.put("extras", getExtras());
            }
            return jSONObject2;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new Banner$$ExternalSyntheticLambda0(20), 4, (Object) null);
            return jSONObject2;
        }
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public String getAltImageText() {
        return this.altImageText;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean getAnimateIn() {
        return this.animateIn;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean getAnimateOut() {
        return this.animateOut;
    }

    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final a9 getBrazeManager() {
        return this.brazeManager;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    /* renamed from: getClickAction, reason: from getter */
    public ClickAction getInternalClickAction() {
        return this.internalClickAction;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public CropType getCropType() {
        return this.cropType;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public DismissType getDismissType() {
        return this.dismissType;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public int getDurationInMilliseconds() {
        return this.durationInMilliseconds;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public long getExpirationTimestamp() {
        return this.expirationTimestamp;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public Map<String, String> getExtras() {
        return this.extras;
    }

    public String getIcon() {
        return this.icon;
    }

    public int getIconBackgroundColor() {
        return this.iconBackgroundColor;
    }

    public int getIconColor() {
        return this.iconColor;
    }

    public final ma getInAppMessageDarkThemeWrapper() {
        return this.inAppMessageDarkThemeWrapper;
    }

    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    public String getMessage() {
        return this.message;
    }

    public String getMessageExtras() {
        return this.messageExtras;
    }

    public TextAlign getMessageTextAlign() {
        return this.messageTextAlign;
    }

    public int getMessageTextColor() {
        return this.messageTextColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean getOpenUriInWebView() {
        return this.openUriInWebView;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public Orientation getOrientation() {
        return this.orientation;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public List<String> getRemoteAssetPathsForPrefetch() {
        return EmptyList.INSTANCE;
    }

    public final String getTriggerId() {
        JSONObject jSONObject = this.jsonObject;
        if (jSONObject != null) {
            return jSONObject.optString("trigger_id");
        }
        return null;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    /* renamed from: getUri, reason: from getter */
    public Uri getInternalUri() {
        return this.internalUri;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean isControl() {
        JSONObject jSONObject = this.jsonObject;
        return jSONObject != null && jSONObject.optBoolean("is_control");
    }

    /* renamed from: isTestSend, reason: from getter */
    public boolean getIsTestSend() {
        return this.isTestSend;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean logClick() {
        return handleLogClick$default(this, null, 1, null);
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean logImpression() {
        String triggerId = getTriggerId();
        if (triggerId == null || StringsKt.isBlank(triggerId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.D, (Throwable) null, false, (Function0) new Banner$$ExternalSyntheticLambda0(23), 6, (Object) null);
            return false;
        }
        a9 a9Var = this.brazeManager;
        if (a9Var == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Banner$$ExternalSyntheticLambda0(21), 6, (Object) null);
            return false;
        }
        if (this.impressionLogged.get()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Banner$$ExternalSyntheticLambda0(22), 6, (Object) null);
            return false;
        }
        this.impressionLogged.set(true);
        JobKt.launch$default(ne.a, null, null, new ca(triggerId, this, a9Var, null), 3);
        return true;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void onAfterClosed() {
        String triggerId = getTriggerId();
        if (triggerId == null || triggerId.length() == 0) {
            return;
        }
        JobKt.launch$default(ne.a, null, null, new da(this, null), 3);
    }

    public void setAltImageText(String str) {
        this.altImageText = str;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setAnimateIn(boolean z) {
        this.animateIn = z;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setAnimateOut(boolean z) {
        this.animateOut = z;
    }

    public void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public void setCropType(CropType cropType) {
        cropType.getClass();
        this.cropType = cropType;
    }

    public void setDismissType(DismissType dismissType) {
        dismissType.getClass();
        this.dismissType = dismissType;
    }

    public void setDurationInMilliseconds(int i) {
        if (i < 999) {
            this.durationInMilliseconds = 5000;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new jg$$ExternalSyntheticLambda1(i, 7), 7, (Object) null);
        } else {
            this.durationInMilliseconds = i;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new jg$$ExternalSyntheticLambda1(i, 8), 7, (Object) null);
        }
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setExpirationTimestamp(long j) {
        this.expirationTimestamp = j;
    }

    public void setExtras(Map<String, String> map) {
        map.getClass();
        this.extras = map;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setIconBackgroundColor(int i) {
        this.iconBackgroundColor = i;
    }

    public void setIconColor(int i) {
        this.iconColor = i;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setLocalPrefetchedAssetPaths(Map<String, String> remotePathToLocalAssetMap) {
        remotePathToLocalAssetMap.getClass();
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setMessageExtras(String str) {
        this.messageExtras = str;
    }

    public void setMessageTextAlign(TextAlign textAlign) {
        textAlign.getClass();
        this.messageTextAlign = textAlign;
    }

    public void setMessageTextColor(int i) {
        this.messageTextColor = i;
    }

    public void setOpenUriInWebView(boolean z) {
        this.openUriInWebView = z;
    }

    public void setOrientation(Orientation orientation) {
        orientation.getClass();
        this.orientation = orientation;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setTestSend(boolean z) {
        this.isTestSend = z;
    }

    public /* synthetic */ InAppMessageBase(JSONObject jSONObject, a9 a9Var, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject, a9Var, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }
}
