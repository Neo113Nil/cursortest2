package io.flutter.view;

import F.C0038n;
import P0.t;
import android.R;
import android.content.ContentResolver;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class h extends AccessibilityNodeProvider {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f7974x = 0;

    /* renamed from: a, reason: collision with root package name */
    public final t f7975a;

    /* renamed from: b, reason: collision with root package name */
    public final I0.b f7976b;

    /* renamed from: c, reason: collision with root package name */
    public final AccessibilityManager f7977c;

    /* renamed from: d, reason: collision with root package name */
    public final AccessibilityViewEmbedder f7978d;

    /* renamed from: e, reason: collision with root package name */
    public final io.flutter.plugin.platform.h f7979e;

    /* renamed from: f, reason: collision with root package name */
    public final ContentResolver f7980f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f7981g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f7982h;

    /* renamed from: i, reason: collision with root package name */
    public g f7983i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f7984j;

    /* renamed from: k, reason: collision with root package name */
    public int f7985k;

    /* renamed from: l, reason: collision with root package name */
    public String f7986l;

    /* renamed from: m, reason: collision with root package name */
    public g f7987m;

    /* renamed from: n, reason: collision with root package name */
    public g f7988n;

    /* renamed from: o, reason: collision with root package name */
    public g f7989o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f7990p;

    /* renamed from: q, reason: collision with root package name */
    public int f7991q;

    /* renamed from: r, reason: collision with root package name */
    public C.j f7992r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7993s;
    public boolean t;

    /* renamed from: u, reason: collision with root package name */
    public final c f7994u;

    /* renamed from: v, reason: collision with root package name */
    public final d f7995v;

    /* renamed from: w, reason: collision with root package name */
    public final D.a f7996w;

    public h(t tVar, I0.b bVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.h hVar) {
        int i2;
        AccessibilityViewEmbedder accessibilityViewEmbedder = new AccessibilityViewEmbedder(tVar, 65536);
        this.f7981g = new HashMap();
        this.f7982h = new HashMap();
        this.f7985k = 0;
        this.f7990p = new ArrayList();
        this.f7991q = 0;
        this.f7993s = false;
        this.t = false;
        b bVar2 = new b(this);
        c cVar = new c(this);
        this.f7994u = cVar;
        D.a aVar = new D.a(this, new Handler(), 2);
        this.f7996w = aVar;
        this.f7975a = tVar;
        this.f7976b = bVar;
        this.f7977c = accessibilityManager;
        this.f7980f = contentResolver;
        this.f7978d = accessibilityViewEmbedder;
        this.f7979e = hVar;
        bVar.f723d = bVar2;
        ((FlutterJNI) bVar.f722c).setAccessibilityDelegate(bVar2);
        cVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(cVar);
        d dVar = new d(this, accessibilityManager);
        this.f7995v = dVar;
        dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        this.f7985k |= 128;
        aVar.onChange(false, null);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, aVar);
        if (Build.VERSION.SDK_INT >= 31 && tVar != null && tVar.getResources() != null) {
            i2 = tVar.getResources().getConfiguration().fontWeightAdjustment;
            if (i2 == Integer.MAX_VALUE || i2 < 300) {
                this.f7985k &= -9;
            } else {
                this.f7985k |= 8;
            }
            ((FlutterJNI) bVar.f722c).setAccessibilityFeatures(this.f7985k);
        }
        hVar.c(this);
    }

    public static String c(ByteBuffer byteBuffer, String[] strArr) {
        int i2 = byteBuffer.getInt();
        if (i2 == -1) {
            return null;
        }
        return strArr[i2];
    }

    public final f a(int i2) {
        HashMap hashMap = this.f7982h;
        f fVar = (f) hashMap.get(Integer.valueOf(i2));
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f();
        fVar2.f7918c = -1;
        fVar2.f7917b = i2;
        fVar2.f7916a = 267386881 + i2;
        hashMap.put(Integer.valueOf(i2), fVar2);
        return fVar2;
    }

    public final g b(int i2) {
        HashMap hashMap = this.f7981g;
        g gVar = (g) hashMap.get(Integer.valueOf(i2));
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this);
        gVar2.f7947b = i2;
        hashMap.put(Integer.valueOf(i2), gVar2);
        return gVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x02dd  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        int i3;
        String str;
        boolean K2;
        boolean I2;
        boolean I3;
        int i4;
        g gVar;
        int i5;
        g gVar2;
        boolean I4;
        boolean z2;
        boolean I5;
        e eVar;
        boolean k2;
        e eVar2;
        boolean I6;
        g gVar3;
        e eVar3;
        boolean k3;
        e eVar4;
        boolean I7;
        boolean I8;
        boolean I9;
        String str2;
        String str3;
        int i6;
        boolean I10;
        boolean I11;
        int i7;
        int i8;
        boolean I12;
        boolean I13;
        boolean I14;
        g gVar4;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        boolean I15;
        int i9;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList3;
        int i13;
        String str4;
        int i14;
        int i15;
        boolean I16;
        boolean I17;
        boolean I18;
        boolean I19;
        boolean I20;
        boolean I21;
        int i16;
        String str5;
        String str6;
        String str7;
        g gVar5;
        ArrayList arrayList4;
        Object[] objArr;
        boolean I22;
        boolean I23;
        boolean I24;
        boolean I25;
        int i17;
        int i18;
        int i19;
        int i20;
        f fVar;
        f fVar2;
        String str8;
        f fVar3;
        f fVar4;
        String str9;
        boolean I26;
        g gVar6;
        int i21;
        g gVar7;
        int i22;
        String str10;
        String str11;
        String str12;
        float parseFloat;
        String str13;
        String str14;
        float parseFloat2;
        String str15;
        boolean I27;
        boolean I28;
        boolean I29;
        int i23;
        int i24;
        int i25;
        String str16;
        String str17;
        int length;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        String str18;
        int i34;
        int i35;
        i(true);
        if (i2 >= 65536) {
            return this.f7978d.createAccessibilityNodeInfo(i2);
        }
        HashMap hashMap = this.f7981g;
        View view = this.f7975a;
        if (i2 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(obtain);
            if (hashMap.containsKey(0)) {
                obtain.addChild(view, 0);
            }
            obtain.setImportantForAccessibility(false);
            return obtain;
        }
        g gVar8 = (g) hashMap.get(Integer.valueOf(i2));
        if (gVar8 == null) {
            return null;
        }
        i3 = gVar8.f7957i;
        io.flutter.plugin.platform.h hVar = this.f7979e;
        if (i3 != -1) {
            i34 = gVar8.f7957i;
            if (hVar.d(i34)) {
                i35 = gVar8.f7957i;
                hVar.g(i35);
                return null;
            }
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(view, i2);
        obtain2.setImportantForAccessibility((gVar8.I(12) || (g.y(gVar8) == null && gVar8.f7951d == 0)) ? false : true);
        obtain2.setViewIdResourceName("");
        str = gVar8.f7963o;
        if (str != null) {
            str18 = gVar8.f7963o;
            obtain2.setViewIdResourceName(str18);
        }
        obtain2.setPackageName(view.getContext().getPackageName());
        obtain2.setClassName("android.view.View");
        obtain2.setSource(view, i2);
        K2 = gVar8.K();
        obtain2.setFocusable(K2);
        g gVar9 = this.f7987m;
        if (gVar9 != null) {
            i33 = gVar9.f7947b;
            obtain2.setFocused(i33 == i2);
        }
        g gVar10 = this.f7983i;
        if (gVar10 != null) {
            i32 = gVar10.f7947b;
            obtain2.setAccessibilityFocused(i32 == i2);
        }
        I2 = gVar8.I(5);
        if (I2) {
            I27 = gVar8.I(11);
            obtain2.setPassword(I27);
            I28 = gVar8.I(21);
            if (!I28) {
                obtain2.setClassName("android.widget.EditText");
            }
            I29 = gVar8.I(21);
            obtain2.setEditable(!I29);
            i23 = gVar8.f7955g;
            if (i23 != -1) {
                i29 = gVar8.f7956h;
                if (i29 != -1) {
                    i30 = gVar8.f7955g;
                    i31 = gVar8.f7956h;
                    obtain2.setTextSelection(i30, i31);
                }
            }
            g gVar11 = this.f7983i;
            if (gVar11 != null) {
                i28 = gVar11.f7947b;
                if (i28 == i2) {
                    obtain2.setLiveRegion(1);
                }
            }
            if (g.k(gVar8, e.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                obtain2.addAction(256);
                i24 = 1;
            } else {
                i24 = 0;
            }
            if (g.k(gVar8, e.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                obtain2.addAction(512);
                i24 = 1;
            }
            if (g.k(gVar8, e.MOVE_CURSOR_FORWARD_BY_WORD)) {
                obtain2.addAction(256);
                i24 |= 2;
            }
            if (g.k(gVar8, e.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                obtain2.addAction(512);
                i24 |= 2;
            }
            obtain2.setMovementGranularities(i24);
            i25 = gVar8.f7953e;
            if (i25 >= 0) {
                str16 = gVar8.f7966r;
                if (str16 == null) {
                    length = 0;
                } else {
                    str17 = gVar8.f7966r;
                    length = str17.length();
                }
                i26 = gVar8.f7954f;
                int i36 = length - i26;
                i27 = gVar8.f7953e;
                obtain2.setMaxTextLength(i27 + i36);
            }
        }
        if (g.k(gVar8, e.SET_SELECTION)) {
            obtain2.addAction(131072);
        }
        if (g.k(gVar8, e.COPY)) {
            obtain2.addAction(16384);
        }
        if (g.k(gVar8, e.CUT)) {
            obtain2.addAction(65536);
        }
        if (g.k(gVar8, e.PASTE)) {
            obtain2.addAction(32768);
        }
        if (g.k(gVar8, e.SET_TEXT)) {
            obtain2.addAction(2097152);
        }
        if (g.o(gVar8)) {
            obtain2.setClassName("android.widget.Button");
        }
        I3 = gVar8.I(15);
        if (I3) {
            obtain2.setClassName("android.widget.ImageView");
        }
        int[] _values = C1.a._values();
        i4 = gVar8.f7925E;
        if (H.j.b(_values[i4]) == 23) {
            obtain2.setClassName("android.widget.ProgressBar");
            str10 = gVar8.f7966r;
            if (str10 != null) {
                str11 = gVar8.f7923C;
                try {
                    if (str11 != null) {
                        try {
                            str12 = gVar8.f7923C;
                            parseFloat = Float.parseFloat(str12);
                        } catch (NumberFormatException unused) {
                        }
                        str13 = gVar8.f7924D;
                        if (str13 != null) {
                            try {
                                str14 = gVar8.f7924D;
                                parseFloat2 = Float.parseFloat(str14);
                            } catch (NumberFormatException unused2) {
                            }
                            str15 = gVar8.f7966r;
                            obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, parseFloat, parseFloat2, Float.parseFloat(str15)));
                        }
                        parseFloat2 = Float.POSITIVE_INFINITY;
                        str15 = gVar8.f7966r;
                        obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, parseFloat, parseFloat2, Float.parseFloat(str15)));
                    }
                    str15 = gVar8.f7966r;
                    obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, parseFloat, parseFloat2, Float.parseFloat(str15)));
                } catch (NumberFormatException unused3) {
                    if (Build.VERSION.SDK_INT >= 36) {
                        obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(3, 0.0f, 0.0f, 0.0f));
                    } else {
                        obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, 0.0f, 0.0f));
                    }
                }
                parseFloat = Float.NEGATIVE_INFINITY;
                str13 = gVar8.f7924D;
                if (str13 != null) {
                }
                parseFloat2 = Float.POSITIVE_INFINITY;
            }
        }
        if (g.k(gVar8, e.DISMISS)) {
            obtain2.setDismissable(true);
            obtain2.addAction(1048576);
        }
        gVar = gVar8.f7941V;
        if (gVar != null) {
            gVar7 = gVar8.f7941V;
            i22 = gVar7.f7947b;
            obtain2.setParent(view, i22);
        } else {
            obtain2.setParent(view);
        }
        i5 = gVar8.G;
        if (i5 != -1) {
            i21 = gVar8.G;
            obtain2.setTraversalAfter(view, i21);
        }
        Rect f2 = g.f(gVar8);
        gVar2 = gVar8.f7941V;
        if (gVar2 != null) {
            gVar6 = gVar8.f7941V;
            Rect f3 = g.f(gVar6);
            Rect rect = new Rect(f2);
            rect.offset(-f3.left, -f3.top);
            obtain2.setBoundsInParent(rect);
        } else {
            obtain2.setBoundsInParent(f2);
        }
        Rect rect2 = new Rect(f2);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        obtain2.setBoundsInScreen(rect2);
        obtain2.setVisibleToUser(true);
        I4 = gVar8.I(7);
        if (I4) {
            I26 = gVar8.I(8);
            if (!I26) {
                z2 = false;
                obtain2.setEnabled(z2);
                if (g.k(gVar8, e.TAP)) {
                    I5 = gVar8.I(24);
                    if (I5) {
                        obtain2.addAction(16);
                        obtain2.setClickable(true);
                    }
                } else {
                    fVar3 = gVar8.f7944Z;
                    if (fVar3 != null) {
                        fVar4 = gVar8.f7944Z;
                        str9 = fVar4.f7920e;
                        obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, str9));
                        obtain2.setClickable(true);
                    } else {
                        obtain2.addAction(16);
                        obtain2.setClickable(true);
                    }
                }
                if (g.k(gVar8, e.LONG_PRESS)) {
                    fVar = gVar8.f7946a0;
                    if (fVar != null) {
                        fVar2 = gVar8.f7946a0;
                        str8 = fVar2.f7920e;
                        obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, str8));
                        obtain2.setLongClickable(true);
                    } else {
                        obtain2.addAction(32);
                        obtain2.setLongClickable(true);
                    }
                }
                eVar = e.SCROLL_LEFT;
                k2 = g.k(gVar8, eVar);
                eVar2 = e.SCROLL_RIGHT;
                e eVar5 = e.SCROLL_DOWN;
                e eVar6 = e.SCROLL_UP;
                if (!k2 || g.k(gVar8, eVar6) || g.k(gVar8, eVar2) || g.k(gVar8, eVar5)) {
                    obtain2.setScrollable(true);
                    I6 = gVar8.I(19);
                    if (I6) {
                        if (g.k(gVar8, eVar) || g.k(gVar8, eVar2)) {
                            obtain2.setClassName("android.widget.HorizontalScrollView");
                        } else {
                            obtain2.setClassName("android.widget.ScrollView");
                        }
                    }
                }
                if (j(gVar8)) {
                    if (g.k(gVar8, eVar) || g.k(gVar8, eVar2)) {
                        if (Build.VERSION.SDK_INT < 33) {
                            i18 = gVar8.f7958j;
                            obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, i18, false));
                        } else {
                            C1.a.l();
                            i17 = gVar8.f7958j;
                            obtain2.setCollectionInfo(P0.o.v(i17));
                        }
                    } else if (Build.VERSION.SDK_INT < 33) {
                        i20 = gVar8.f7958j;
                        obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i20, 1, false));
                    } else {
                        C1.a.l();
                        i19 = gVar8.f7958j;
                        obtain2.setCollectionInfo(P0.o.l(i19));
                    }
                }
                gVar3 = gVar8.f7941V;
                if (gVar3 != null && j(gVar3) && gVar8.f7941V.I(19)) {
                    gVar5 = gVar8.f7941V;
                    arrayList4 = gVar5.f7942W;
                    objArr = g.k(gVar5, eVar) && !g.k(gVar5, eVar2);
                    int indexOf = arrayList4.indexOf(gVar8);
                    if (objArr == true) {
                        if (Build.VERSION.SDK_INT < 33) {
                            I23 = gVar8.I(10);
                            obtain2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, indexOf, 1, I23));
                        } else {
                            C1.a.o();
                            I22 = gVar8.I(10);
                            obtain2.setCollectionItemInfo(P0.o.w(indexOf, I22));
                        }
                    } else if (Build.VERSION.SDK_INT < 33) {
                        I25 = gVar8.I(10);
                        obtain2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(indexOf, 1, 0, 1, I25));
                    } else {
                        C1.a.o();
                        I24 = gVar8.I(10);
                        obtain2.setCollectionItemInfo(P0.o.m(indexOf, I24));
                    }
                }
                if (!g.k(gVar8, eVar) || g.k(gVar8, eVar6)) {
                    obtain2.addAction(Base64Utils.IO_BUFFER_SIZE);
                }
                if (!g.k(gVar8, eVar2) || g.k(gVar8, eVar5)) {
                    obtain2.addAction(8192);
                }
                eVar3 = e.INCREASE;
                k3 = g.k(gVar8, eVar3);
                eVar4 = e.DECREASE;
                if (!k3 || g.k(gVar8, eVar4)) {
                    obtain2.setClassName("android.widget.SeekBar");
                    if (g.k(gVar8, eVar3)) {
                        obtain2.addAction(Base64Utils.IO_BUFFER_SIZE);
                    }
                    if (g.k(gVar8, eVar4)) {
                        obtain2.addAction(8192);
                    }
                }
                I7 = gVar8.I(16);
                if (I7) {
                    obtain2.setLiveRegion(1);
                }
                I8 = gVar8.I(5);
                if (I8) {
                    I9 = gVar8.I(12);
                    if (!I9) {
                        CharSequence y2 = g.y(gVar8);
                        if (Build.VERSION.SDK_INT < 28) {
                            str2 = gVar8.f7973z;
                            if (str2 != null) {
                                CharSequence charSequence = y2 != null ? y2 : "";
                                StringBuilder sb = new StringBuilder();
                                sb.append((Object) charSequence);
                                sb.append("\n");
                                str3 = gVar8.f7973z;
                                sb.append(str3);
                                y2 = sb.toString();
                            }
                        }
                        if (y2 != null) {
                            obtain2.setContentDescription(y2);
                        }
                    }
                } else {
                    obtain2.setText(g.w(gVar8));
                    if (Build.VERSION.SDK_INT >= 28) {
                        obtain2.setHintText(g.x(gVar8));
                    }
                }
                i6 = Build.VERSION.SDK_INT;
                if (i6 >= 28) {
                    str5 = gVar8.f7973z;
                    if (str5 != null) {
                        str6 = gVar8.f7973z;
                        obtain2.setTooltipText(str6);
                        if (g.y(gVar8) == null) {
                            str7 = gVar8.f7973z;
                            obtain2.setContentDescription(str7);
                        }
                    }
                }
                I10 = gVar8.I(1);
                I11 = gVar8.I(17);
                obtain2.setCheckable(!I10 || I11);
                if (I10) {
                    if (I11) {
                        obtain2.setClassName("android.widget.Switch");
                        i7 = 36;
                        if (i6 >= 36) {
                            I13 = gVar8.I(18);
                            obtain2.setChecked(I13 ? 1 : 0);
                        } else {
                            I12 = gVar8.I(18);
                            obtain2.setChecked(I12);
                        }
                    } else {
                        i7 = 36;
                    }
                    i8 = 3;
                } else {
                    I18 = gVar8.I(9);
                    if (I18) {
                        obtain2.setClassName("android.widget.RadioButton");
                    } else {
                        obtain2.setClassName("android.widget.CheckBox");
                    }
                    if (i6 >= 36) {
                        I20 = gVar8.I(26);
                        if (I20) {
                            i16 = 2;
                        } else {
                            I21 = gVar8.I(2);
                            i16 = I21 ? 1 : 0;
                        }
                        obtain2.setChecked(i16);
                    } else {
                        I19 = gVar8.I(2);
                        obtain2.setChecked(I19);
                    }
                    i8 = 3;
                    i7 = 36;
                }
                I14 = gVar8.I(i8);
                obtain2.setSelected(I14);
                if (i6 >= i7) {
                    I16 = gVar8.I(27);
                    if (I16) {
                        I17 = gVar8.I(28);
                        if (!I17) {
                            i8 = 1;
                        }
                        obtain2.setExpandedState(i8);
                        if (g.k(gVar8, e.EXPAND)) {
                            obtain2.addAction(262144);
                        }
                        if (g.k(gVar8, e.COLLAPSE)) {
                            obtain2.addAction(524288);
                        }
                    }
                }
                if (i6 >= 28) {
                    i15 = gVar8.f7926F;
                    obtain2.setHeading(i15 > 0);
                }
                gVar4 = this.f7983i;
                if (gVar4 != null) {
                    i14 = gVar4.f7947b;
                    if (i14 == i2) {
                        obtain2.addAction(128);
                        arrayList = gVar8.Y;
                        if (arrayList != null) {
                            arrayList3 = gVar8.Y;
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                f fVar5 = (f) it2.next();
                                i13 = fVar5.f7916a;
                                str4 = fVar5.f7919d;
                                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(i13, str4));
                            }
                        }
                        arrayList2 = gVar8.f7942W;
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            g gVar12 = (g) it.next();
                            I15 = gVar12.I(14);
                            if (!I15) {
                                i9 = gVar12.f7957i;
                                if (i9 != -1) {
                                    i11 = gVar12.f7957i;
                                    hVar.g(i11);
                                    i12 = gVar12.f7957i;
                                    hVar.d(i12);
                                }
                                i10 = gVar12.f7947b;
                                obtain2.addChild(view, i10);
                            }
                        }
                        return obtain2;
                    }
                }
                obtain2.addAction(64);
                arrayList = gVar8.Y;
                if (arrayList != null) {
                }
                arrayList2 = gVar8.f7942W;
                it = arrayList2.iterator();
                while (it.hasNext()) {
                }
                return obtain2;
            }
        }
        z2 = true;
        obtain2.setEnabled(z2);
        if (g.k(gVar8, e.TAP)) {
        }
        if (g.k(gVar8, e.LONG_PRESS)) {
        }
        eVar = e.SCROLL_LEFT;
        k2 = g.k(gVar8, eVar);
        eVar2 = e.SCROLL_RIGHT;
        e eVar52 = e.SCROLL_DOWN;
        e eVar62 = e.SCROLL_UP;
        if (!k2) {
        }
        obtain2.setScrollable(true);
        I6 = gVar8.I(19);
        if (I6) {
        }
        if (j(gVar8)) {
        }
        gVar3 = gVar8.f7941V;
        if (gVar3 != null) {
            gVar5 = gVar8.f7941V;
            arrayList4 = gVar5.f7942W;
            if (g.k(gVar5, eVar)) {
            }
            int indexOf2 = arrayList4.indexOf(gVar8);
            if (objArr == true) {
            }
        }
        if (!g.k(gVar8, eVar)) {
        }
        obtain2.addAction(Base64Utils.IO_BUFFER_SIZE);
        if (!g.k(gVar8, eVar2)) {
        }
        obtain2.addAction(8192);
        eVar3 = e.INCREASE;
        k3 = g.k(gVar8, eVar3);
        eVar4 = e.DECREASE;
        if (!k3) {
        }
        obtain2.setClassName("android.widget.SeekBar");
        if (g.k(gVar8, eVar3)) {
        }
        if (g.k(gVar8, eVar4)) {
        }
        I7 = gVar8.I(16);
        if (I7) {
        }
        I8 = gVar8.I(5);
        if (I8) {
        }
        i6 = Build.VERSION.SDK_INT;
        if (i6 >= 28) {
        }
        I10 = gVar8.I(1);
        I11 = gVar8.I(17);
        obtain2.setCheckable(!I10 || I11);
        if (I10) {
        }
        I14 = gVar8.I(i8);
        obtain2.setSelected(I14);
        if (i6 >= i7) {
        }
        if (i6 >= 28) {
        }
        gVar4 = this.f7983i;
        if (gVar4 != null) {
        }
        obtain2.addAction(64);
        arrayList = gVar8.Y;
        if (arrayList != null) {
        }
        arrayList2 = gVar8.f7942W;
        it = arrayList2.iterator();
        while (it.hasNext()) {
        }
        return obtain2;
    }

    public final AccessibilityEvent d(int i2, int i3) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
        t tVar = this.f7975a;
        obtain.setPackageName(tVar.getContext().getPackageName());
        obtain.setSource(tVar, i2);
        return obtain;
    }

    public final boolean e(MotionEvent motionEvent, boolean z2) {
        g J2;
        if (!this.f7977c.isTouchExplorationEnabled()) {
            return false;
        }
        HashMap hashMap = this.f7981g;
        if (hashMap.isEmpty()) {
            return false;
        }
        g J3 = ((g) hashMap.get(0)).J(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z2);
        if (J3 != null && J3.f7957i != -1) {
            if (z2) {
                return false;
            }
            return this.f7978d.onAccessibilityHoverEvent(J3.f7947b, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (!hashMap.isEmpty() && (J2 = ((g) hashMap.get(0)).J(new float[]{x2, y2, 0.0f, 1.0f}, z2)) != this.f7989o) {
                if (J2 != null) {
                    g(J2.f7947b, 128);
                }
                g gVar = this.f7989o;
                if (gVar != null) {
                    g(gVar.f7947b, 256);
                }
                this.f7989o = J2;
            }
        } else {
            if (motionEvent.getAction() != 10) {
                motionEvent.toString();
                return false;
            }
            g gVar2 = this.f7989o;
            if (gVar2 != null) {
                g(gVar2.f7947b, 256);
                this.f7989o = null;
            }
        }
        return true;
    }

    public final boolean f(g gVar, int i2, Bundle bundle, boolean z2) {
        int i3;
        int i4 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z3 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i5 = gVar.f7955g;
        int i6 = gVar.f7956h;
        if (i6 >= 0 && i5 >= 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 4) {
                        if (i4 == 8 || i4 == 16) {
                            if (z2) {
                                gVar.f7956h = gVar.f7966r.length();
                            } else {
                                gVar.f7956h = 0;
                            }
                        }
                    } else if (z2 && i6 < gVar.f7966r.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(gVar.f7966r.substring(gVar.f7956h));
                        if (matcher.find()) {
                            gVar.f7956h += matcher.start(1);
                        } else {
                            gVar.f7956h = gVar.f7966r.length();
                        }
                    } else if (!z2 && gVar.f7956h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(gVar.f7966r.substring(0, gVar.f7956h));
                        if (matcher2.find()) {
                            gVar.f7956h = matcher2.start(1);
                        } else {
                            gVar.f7956h = 0;
                        }
                    }
                } else if (z2 && i6 < gVar.f7966r.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(gVar.f7966r.substring(gVar.f7956h));
                    matcher3.find();
                    if (matcher3.find()) {
                        gVar.f7956h += matcher3.start(1);
                    } else {
                        gVar.f7956h = gVar.f7966r.length();
                    }
                } else if (!z2 && gVar.f7956h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(gVar.f7966r.substring(0, gVar.f7956h));
                    if (matcher4.find()) {
                        gVar.f7956h = matcher4.start(1);
                    }
                }
            } else if (z2 && i6 < gVar.f7966r.length()) {
                gVar.f7956h++;
            } else if (!z2 && (i3 = gVar.f7956h) > 0) {
                gVar.f7956h = i3 - 1;
            }
            if (!z3) {
                gVar.f7955g = gVar.f7956h;
            }
        }
        if (i5 != gVar.f7955g || i6 != gVar.f7956h) {
            String str = gVar.f7966r;
            if (str == null) {
                str = "";
            }
            AccessibilityEvent d2 = d(gVar.f7947b, 8192);
            d2.getText().add(str);
            d2.setFromIndex(gVar.f7955g);
            d2.setToIndex(gVar.f7956h);
            d2.setItemCount(str.length());
            h(d2);
        }
        I0.b bVar = this.f7976b;
        if (i4 == 1) {
            if (z2) {
                e eVar = e.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (g.k(gVar, eVar)) {
                    bVar.x(i2, eVar, Boolean.valueOf(z3));
                    return true;
                }
            }
            if (!z2) {
                e eVar2 = e.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
                if (g.k(gVar, eVar2)) {
                    bVar.x(i2, eVar2, Boolean.valueOf(z3));
                    return true;
                }
            }
        } else if (i4 == 2) {
            if (z2) {
                e eVar3 = e.MOVE_CURSOR_FORWARD_BY_WORD;
                if (g.k(gVar, eVar3)) {
                    bVar.x(i2, eVar3, Boolean.valueOf(z3));
                    return true;
                }
            }
            if (!z2) {
                e eVar4 = e.MOVE_CURSOR_BACKWARD_BY_WORD;
                if (g.k(gVar, eVar4)) {
                    bVar.x(i2, eVar4, Boolean.valueOf(z3));
                    return true;
                }
            }
        } else if (i4 == 4 || i4 == 8 || i4 == 16) {
            return true;
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i2) {
        if (i2 == 1) {
            g gVar = this.f7987m;
            if (gVar != null) {
                return createAccessibilityNodeInfo(gVar.f7947b);
            }
        } else if (i2 != 2) {
            return null;
        }
        g gVar2 = this.f7983i;
        if (gVar2 != null) {
            return createAccessibilityNodeInfo(gVar2.f7947b);
        }
        Integer num = this.f7984j;
        if (num != null) {
            return createAccessibilityNodeInfo(num.intValue());
        }
        return null;
    }

    public final void g(int i2, int i3) {
        if (this.f7977c.isEnabled()) {
            h(d(i2, i3));
        }
    }

    public final void h(AccessibilityEvent accessibilityEvent) {
        if (this.f7977c.isEnabled()) {
            View view = this.f7975a;
            view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final void i(boolean z2) {
        if (this.f7993s == z2) {
            return;
        }
        this.f7993s = z2;
        if (z2) {
            this.f7985k |= 1;
        } else {
            this.f7985k &= -2;
        }
        ((FlutterJNI) this.f7976b.f722c).setAccessibilityFeatures(this.f7985k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        if (r0 != null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(g gVar) {
        if (gVar.f7958j <= 1) {
            return false;
        }
        g gVar2 = this.f7983i;
        g gVar3 = null;
        if (gVar2 != null) {
            g gVar4 = gVar2.f7941V;
            while (true) {
                if (gVar4 == null) {
                    gVar4 = null;
                    break;
                }
                if (gVar4 == gVar) {
                    break;
                }
                gVar4 = gVar4.f7941V;
            }
        }
        g gVar5 = this.f7983i;
        a aVar = new a();
        if (gVar5 != null) {
            g gVar6 = gVar5.f7941V;
            while (true) {
                if (gVar6 == null) {
                    break;
                }
                if (aVar.test(gVar6)) {
                    gVar3 = gVar6;
                    break;
                }
                gVar6 = gVar6.f7941V;
            }
            if (gVar3 != null) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i2, int i3, Bundle bundle) {
        if (i2 >= 65536) {
            boolean performAction = this.f7978d.performAction(i2, i3, bundle);
            if (performAction && i3 == 128) {
                this.f7984j = null;
            }
            return performAction;
        }
        HashMap hashMap = this.f7981g;
        g gVar = (g) hashMap.get(Integer.valueOf(i2));
        if (gVar == null) {
            return false;
        }
        e eVar = e.INCREASE;
        e eVar2 = e.DECREASE;
        I0.b bVar = this.f7976b;
        switch (i3) {
            case 16:
                bVar.w(i2, e.TAP);
                return true;
            case 32:
                bVar.w(i2, e.LONG_PRESS);
                return true;
            case 64:
                if (this.f7983i == null) {
                    this.f7975a.invalidate();
                }
                this.f7983i = gVar;
                bVar.w(i2, e.DID_GAIN_ACCESSIBILITY_FOCUS);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("type", "didGainFocus");
                hashMap2.put("nodeId", Integer.valueOf(gVar.f7947b));
                ((C0038n) bVar.f721b).g(hashMap2, null);
                g(i2, 32768);
                if (g.k(gVar, eVar) || g.k(gVar, eVar2)) {
                    g(i2, 4);
                }
                return true;
            case 128:
                g gVar2 = this.f7983i;
                if (gVar2 != null && gVar2.f7947b == i2) {
                    this.f7983i = null;
                }
                Integer num = this.f7984j;
                if (num != null && num.intValue() == i2) {
                    this.f7984j = null;
                }
                bVar.w(i2, e.DID_LOSE_ACCESSIBILITY_FOCUS);
                g(i2, 65536);
                return true;
            case 256:
                return f(gVar, i2, bundle, true);
            case 512:
                return f(gVar, i2, bundle, false);
            case Base64Utils.IO_BUFFER_SIZE /* 4096 */:
                e eVar3 = e.SCROLL_UP;
                if (g.k(gVar, eVar3)) {
                    bVar.w(i2, eVar3);
                } else {
                    e eVar4 = e.SCROLL_LEFT;
                    if (g.k(gVar, eVar4)) {
                        bVar.w(i2, eVar4);
                    } else {
                        if (!g.k(gVar, eVar)) {
                            return false;
                        }
                        gVar.f7966r = gVar.t;
                        gVar.f7967s = gVar.f7968u;
                        g(i2, 4);
                        bVar.w(i2, eVar);
                    }
                }
                return true;
            case 8192:
                e eVar5 = e.SCROLL_DOWN;
                if (g.k(gVar, eVar5)) {
                    bVar.w(i2, eVar5);
                } else {
                    e eVar6 = e.SCROLL_RIGHT;
                    if (g.k(gVar, eVar6)) {
                        bVar.w(i2, eVar6);
                    } else {
                        if (!g.k(gVar, eVar2)) {
                            return false;
                        }
                        gVar.f7966r = gVar.f7969v;
                        gVar.f7967s = gVar.f7970w;
                        g(i2, 4);
                        bVar.w(i2, eVar2);
                    }
                }
                return true;
            case 16384:
                bVar.w(i2, e.COPY);
                return true;
            case 32768:
                bVar.w(i2, e.PASTE);
                return true;
            case 65536:
                bVar.w(i2, e.CUT);
                return true;
            case 131072:
                HashMap hashMap3 = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    hashMap3.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    hashMap3.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                } else {
                    hashMap3.put("base", Integer.valueOf(gVar.f7956h));
                    hashMap3.put("extent", Integer.valueOf(gVar.f7956h));
                }
                bVar.x(i2, e.SET_SELECTION, hashMap3);
                g gVar3 = (g) hashMap.get(Integer.valueOf(i2));
                gVar3.f7955g = ((Integer) hashMap3.get("base")).intValue();
                gVar3.f7956h = ((Integer) hashMap3.get("extent")).intValue();
                return true;
            case 262144:
                bVar.w(i2, e.EXPAND);
                return true;
            case 524288:
                bVar.w(i2, e.COLLAPSE);
                return true;
            case 1048576:
                bVar.w(i2, e.DISMISS);
                return true;
            case 2097152:
                String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                bVar.x(i2, e.SET_TEXT, string);
                gVar.f7966r = string;
                gVar.f7967s = null;
                return true;
            case R.id.accessibilityActionShowOnScreen:
                bVar.w(i2, e.SHOW_ON_SCREEN);
                return true;
            default:
                f fVar = (f) this.f7982h.get(Integer.valueOf(i3 - 267386881));
                if (fVar == null) {
                    return false;
                }
                bVar.x(i2, e.CUSTOM_ACTION, Integer.valueOf(fVar.f7917b));
                return true;
        }
    }
}
