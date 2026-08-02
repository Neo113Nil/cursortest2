package defpackage;

import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.core.view.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class ue0 extends jzi {
    public final /* synthetic */ int d;
    public final /* synthetic */ a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ue0(a aVar, int i) {
        super(4);
        this.d = i;
        this.e = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:253:0x05b6, code lost:
    
        if ((r10 == 1) != false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0771, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r5, java.lang.Boolean.TRUE) == false) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x07ba, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x07b8, code lost:
    
        if (r5 == false) goto L407;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:241:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0797 A[LOOP:8: B:370:0x077a->B:379:0x0797, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x079e A[EDGE_INSN: B:380:0x079e->B:381:0x079e BREAK  A[LOOP:8: B:370:0x077a->B:379:0x0797], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x07ce  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x090a  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x09c4  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x09d2  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x09e9  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x09ed  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0a05  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0a1a  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0a24  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0a8c  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0aa2  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0aab  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x0ad1  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0ae9  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0c75  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x0cb6  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x0c92  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x08a1  */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v7, types: [c5b] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v9, types: [c5b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final vb M(int i) {
        int i2;
        ye0 ye0Var;
        vb vbVar;
        AccessibilityNodeInfo accessibilityNodeInfo;
        ye0 ye0Var2;
        AndroidComposeView androidComposeView;
        roi roiVar;
        qfp qfpVar;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        Resources resources;
        jfp jfpVar;
        jfp jfpVar2;
        tpi tpiVar;
        meo meoVar;
        SpannableString spannableString;
        AccessibilityNodeInfo accessibilityNodeInfo3;
        meo meoVar2;
        int i3;
        int i4;
        boolean z;
        Object g;
        tdg tdgVar;
        Object g2;
        sa saVar;
        Object g3;
        sa saVar2;
        Object g4;
        sa saVar3;
        String t;
        int i5;
        Object g5;
        oum oumVar;
        jfp jfpVar3;
        Object g6;
        my4 my4Var;
        qfp j;
        Object g7;
        cwo cwoVar;
        Object g8;
        cwo cwoVar2;
        boolean z2;
        int d;
        Bundle bundle;
        AndroidComposeView androidComposeView2;
        int d2;
        oj0 q0;
        int i6;
        boolean z3;
        Object g9;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        Collection collection;
        Collection collection2;
        int i7;
        nyf lifecycle;
        ye0 ye0Var3 = (ye0) this.e;
        AndroidComposeView androidComposeView3 = ye0Var3.d;
        ie0 viewTreeOwners = androidComposeView3.getViewTreeOwners();
        if (((viewTreeOwners == null || (lifecycle = viewTreeOwners.a.getLifecycle()) == null) ? null : lifecycle.b()) != lyf.a) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
            vb vbVar2 = new vb(obtain);
            sfp sfpVar = (sfp) ye0Var3.s().b(i);
            if (sfpVar != null) {
                qfp qfpVar2 = sfpVar.a;
                if (i == -1) {
                    Object parentForAccessibility = androidComposeView3.getParentForAccessibility();
                    View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
                    vbVar2.b = -1;
                    obtain.setParent(view);
                } else {
                    qfp j2 = qfpVar2.j();
                    Integer valueOf = j2 != null ? Integer.valueOf(j2.g) : null;
                    if (valueOf == null) {
                        sme.c("semanticsNode " + i + " has null parent");
                        rj7.f();
                        return null;
                    }
                    int intValue = valueOf.intValue();
                    if (intValue == androidComposeView3.getSemanticsOwner().a().g) {
                        intValue = -1;
                    }
                    vbVar2.b = intValue;
                    obtain.setParent(androidComposeView3, intValue);
                }
                vbVar2.c = i;
                obtain.setSource(androidComposeView3, i);
                obtain.setBoundsInScreen(ye0Var3.k(sfpVar));
                roi roiVar2 = ye0.P;
                q4r q4rVar = ye0Var3.v;
                Resources resources2 = androidComposeView3.getContext().getResources();
                vbVar2.n("android.view.View");
                jfp jfpVar4 = qfpVar2.d;
                jfp jfpVar5 = qfpVar2.d;
                tpi tpiVar2 = jfpVar4.a;
                if (tpiVar2.c(ufp.D)) {
                    vbVar2.n("android.widget.EditText");
                }
                if (tpiVar2.c(ufp.z)) {
                    vbVar2.n("android.widget.TextView");
                }
                Object g10 = tpiVar2.g(ufp.w);
                if (g10 == null) {
                    g10 = null;
                }
                meo meoVar3 = (meo) g10;
                if (meoVar3 != null) {
                    int i8 = meoVar3.a;
                    if (qfpVar2.e || qfp.h(4, qfpVar2).isEmpty()) {
                        if (i8 == 4) {
                            obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(R.string.tab));
                        } else if (i8 == 2) {
                            obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(R.string.switch_role));
                        } else {
                            String s0 = bkp.s0(i8);
                            if (i8 != 5 || qfpVar2.m() || jfpVar4.c) {
                                vbVar2.n(s0);
                            }
                        }
                    }
                }
                obtain.setPackageName(androidComposeView3.getContext().getPackageName());
                obtain.setImportantForAccessibility(bkp.l0(qfpVar2));
                List h = qfp.h(4, qfpVar2);
                int size = h.size();
                int i9 = 0;
                while (true) {
                    accessibilityNodeInfo = vbVar2.a;
                    if (i9 >= size) {
                        break;
                    }
                    int i10 = size;
                    qfp qfpVar3 = (qfp) h.get(i9);
                    List list = h;
                    int i11 = i9;
                    if (ye0Var3.s().a(qfpVar3.g)) {
                        oj0 oj0Var = androidComposeView3.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(qfpVar3.c);
                        int i12 = qfpVar3.g;
                        if (i12 != -1) {
                            if (oj0Var != null) {
                                obtain.addChild(oj0Var);
                            } else {
                                accessibilityNodeInfo.addChild(androidComposeView3, i12);
                            }
                        }
                    }
                    i9 = i11 + 1;
                    h = list;
                    size = i10;
                }
                if (i == ye0Var3.n) {
                    accessibilityNodeInfo.setAccessibilityFocused(true);
                    vbVar2.b(qb.h);
                } else {
                    accessibilityNodeInfo.setAccessibilityFocused(false);
                    vbVar2.b(qb.g);
                }
                mn0 e = bf0.e(qfpVar2);
                if (e != null) {
                    androidComposeView3.getFontFamilyResolver();
                    jx7 density = androidComposeView3.getDensity();
                    yks yksVar = ye0Var3.I;
                    androidComposeView = androidComposeView3;
                    String str = e.b;
                    roiVar = roiVar2;
                    List list2 = e.a;
                    SpannableString spannableString2 = new SpannableString(str);
                    ArrayList arrayList = e.c;
                    jfpVar2 = jfpVar5;
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        int i13 = 0;
                        while (i13 < size2) {
                            int i14 = i13;
                            ln0 ln0Var = (ln0) arrayList.get(i13);
                            ArrayList arrayList2 = arrayList;
                            c4r c4rVar = (c4r) ln0Var.a;
                            int i15 = size2;
                            int i16 = ln0Var.b;
                            int i17 = ln0Var.c;
                            ye0 ye0Var4 = ye0Var3;
                            Resources resources3 = resources2;
                            jfp jfpVar6 = jfpVar4;
                            long a = c4rVar.a.a();
                            tpi tpiVar3 = tpiVar2;
                            meo meoVar4 = meoVar3;
                            long j3 = c4rVar.b;
                            tqc tqcVar = c4rVar.c;
                            oqc oqcVar = c4rVar.d;
                            ccs ccsVar = c4rVar.j;
                            bqg bqgVar = c4rVar.k;
                            qfp qfpVar4 = qfpVar2;
                            yks yksVar2 = yksVar;
                            long j4 = c4rVar.l;
                            aas aasVar = c4rVar.m;
                            bcs bcsVar = c4rVar.a;
                            AccessibilityNodeInfo accessibilityNodeInfo4 = accessibilityNodeInfo;
                            if (!d85.c(a, bcsVar.a())) {
                                bcsVar = a != 16 ? new y95(a) : zbs.a;
                            }
                            y1g.Z(spannableString2, bcsVar.a(), i16, i17);
                            SpannableString spannableString3 = spannableString2;
                            y1g.b0(spannableString3, j3, density, i16, i17);
                            if (tqcVar == null && oqcVar == null) {
                                i7 = 33;
                            } else {
                                StyleSpan styleSpan = new StyleSpan(vwb.N(tqcVar == null ? tqc.m : tqcVar, oqcVar != null ? oqcVar.a : 0));
                                i7 = 33;
                                spannableString3.setSpan(styleSpan, i16, i17, 33);
                            }
                            if (aasVar != null) {
                                int i18 = aasVar.a;
                                if ((i18 | 1) == i18) {
                                    spannableString3.setSpan(new UnderlineSpan(), i16, i17, i7);
                                }
                                if ((i18 | 2) == i18) {
                                    spannableString3.setSpan(new StrikethroughSpan(), i16, i17, i7);
                                }
                            }
                            if (ccsVar != null) {
                                spannableString3.setSpan(new ScaleXSpan(ccsVar.a), i16, i17, i7);
                            }
                            y1g.c0(spannableString3, bqgVar, i16, i17);
                            if (j4 != 16) {
                                spannableString3.setSpan(new BackgroundColorSpan(c3x.U(j4)), i16, i17, i7);
                            }
                            spannableString2 = spannableString3;
                            i13 = i14 + 1;
                            arrayList = arrayList2;
                            size2 = i15;
                            ye0Var3 = ye0Var4;
                            resources2 = resources3;
                            jfpVar4 = jfpVar6;
                            meoVar3 = meoVar4;
                            tpiVar2 = tpiVar3;
                            qfpVar2 = qfpVar4;
                            yksVar = yksVar2;
                            accessibilityNodeInfo = accessibilityNodeInfo4;
                        }
                    }
                    ye0Var2 = ye0Var3;
                    SpannableString spannableString4 = spannableString2;
                    qfpVar = qfpVar2;
                    yks yksVar3 = yksVar;
                    accessibilityNodeInfo2 = accessibilityNodeInfo;
                    resources = resources2;
                    jfpVar = jfpVar4;
                    tpiVar = tpiVar2;
                    meoVar = meoVar3;
                    int length = str.length();
                    if (list2 != null) {
                        collection = new ArrayList(list2.size());
                        int size3 = list2.size();
                        for (int i19 = 0; i19 < size3; i19++) {
                            Object obj = list2.get(i19);
                            ln0 ln0Var2 = (ln0) obj;
                            if ((ln0Var2.a instanceof e0u) && nn0.c(0, length, ln0Var2.b, ln0Var2.c)) {
                                collection.add(obj);
                            }
                        }
                    } else {
                        collection = c5b.a;
                    }
                    collection.getClass();
                    int size4 = collection.size();
                    for (int i20 = 0; i20 < size4; i20++) {
                        ln0 ln0Var3 = (ln0) collection.get(i20);
                        e0u e0uVar = (e0u) ln0Var3.a;
                        int i21 = ln0Var3.b;
                        int i22 = ln0Var3.c;
                        if (!(e0uVar instanceof e0u)) {
                            b6e.s();
                            return null;
                        }
                        spannableString4.setSpan(new TtsSpan.VerbatimBuilder(e0uVar.a).build(), i21, i22, 33);
                    }
                    int length2 = str.length();
                    if (list2 != null) {
                        collection2 = new ArrayList(list2.size());
                        int size5 = list2.size();
                        for (int i23 = 0; i23 < size5; i23++) {
                            Object obj2 = list2.get(i23);
                            ln0 ln0Var4 = (ln0) obj2;
                            if ((ln0Var4.a instanceof ppt) && nn0.c(0, length2, ln0Var4.b, ln0Var4.c)) {
                                collection2.add(obj2);
                            }
                        }
                    } else {
                        collection2 = c5b.a;
                    }
                    collection2.getClass();
                    int size6 = collection2.size();
                    int i24 = 0;
                    while (i24 < size6) {
                        ln0 ln0Var5 = (ln0) collection2.get(i24);
                        ppt pptVar = (ppt) ln0Var5.a;
                        int i25 = ln0Var5.b;
                        int i26 = ln0Var5.c;
                        yks yksVar4 = yksVar3;
                        WeakHashMap weakHashMap = (WeakHashMap) yksVar4.b;
                        Object obj3 = weakHashMap.get(pptVar);
                        if (obj3 == null) {
                            obj3 = new URLSpan(pptVar.a);
                            weakHashMap.put(pptVar, obj3);
                        }
                        spannableString4.setSpan((URLSpan) obj3, i25, i26, 33);
                        i24++;
                        yksVar3 = yksVar4;
                    }
                    yks yksVar5 = yksVar3;
                    List a2 = e.a(str.length());
                    int size7 = a2.size();
                    for (int i27 = 0; i27 < size7; i27++) {
                        ln0 ln0Var6 = (ln0) a2.get(i27);
                        int i28 = ln0Var6.b;
                        Object obj4 = ln0Var6.a;
                        int i29 = ln0Var6.c;
                        if (i28 != i29) {
                            p7g p7gVar = (p7g) obj4;
                            if (p7gVar instanceof o7g) {
                                obj4.getClass();
                                o7g o7gVar = (o7g) obj4;
                                ln0 ln0Var7 = new ln0(o7gVar, i28, i29);
                                WeakHashMap weakHashMap2 = (WeakHashMap) yksVar5.c;
                                Object obj5 = weakHashMap2.get(ln0Var7);
                                if (obj5 == null) {
                                    obj5 = new URLSpan(o7gVar.a);
                                    weakHashMap2.put(ln0Var7, obj5);
                                }
                                spannableString4.setSpan((URLSpan) obj5, i28, i29, 33);
                            } else {
                                WeakHashMap weakHashMap3 = (WeakHashMap) yksVar5.d;
                                Object obj6 = weakHashMap3.get(ln0Var6);
                                if (obj6 == null) {
                                    obj6 = new ip5(p7gVar);
                                    weakHashMap3.put(ln0Var6, obj6);
                                }
                                spannableString4.setSpan((ClickableSpan) obj6, i28, i29, 33);
                            }
                        }
                    }
                    spannableString = (SpannableString) ye0.K(spannableString4);
                } else {
                    ye0Var2 = ye0Var3;
                    androidComposeView = androidComposeView3;
                    roiVar = roiVar2;
                    qfpVar = qfpVar2;
                    accessibilityNodeInfo2 = accessibilityNodeInfo;
                    resources = resources2;
                    jfpVar = jfpVar4;
                    jfpVar2 = jfpVar5;
                    tpiVar = tpiVar2;
                    meoVar = meoVar3;
                    spannableString = null;
                }
                vbVar2.y(spannableString);
                xfp xfpVar = ufp.J;
                tpi tpiVar4 = tpiVar;
                if (tpiVar4.c(xfpVar)) {
                    obtain.setContentInvalid(true);
                    Object g11 = tpiVar4.g(xfpVar);
                    if (g11 == null) {
                        g11 = null;
                    }
                    accessibilityNodeInfo3 = accessibilityNodeInfo2;
                    accessibilityNodeInfo3.setError((CharSequence) g11);
                } else {
                    accessibilityNodeInfo3 = accessibilityNodeInfo2;
                }
                Resources resources4 = resources;
                qfp qfpVar5 = qfpVar;
                String d3 = bf0.d(qfpVar5, resources4);
                if (Build.VERSION.SDK_INT >= 30) {
                    qdq.P(accessibilityNodeInfo3, d3);
                } else {
                    accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", d3);
                }
                vbVar2.l(bf0.c(qfpVar5));
                Object g12 = tpiVar4.g(ufp.H);
                if (g12 == null) {
                    g12 = null;
                }
                sls slsVar = (sls) g12;
                if (slsVar != null) {
                    if (slsVar == sls.a) {
                        vbVar2.m(true);
                    } else if (slsVar == sls.b) {
                        vbVar2.m(false);
                    }
                }
                Object g13 = tpiVar4.g(ufp.G);
                if (g13 == null) {
                    g13 = null;
                }
                Boolean bool = (Boolean) g13;
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    if (meoVar == null) {
                        meoVar2 = meoVar;
                        i3 = 4;
                    } else {
                        meoVar2 = meoVar;
                        i3 = 4;
                        if (meoVar2.a == 4) {
                            accessibilityNodeInfo3.setSelected(booleanValue);
                        }
                    }
                    vbVar2.m(booleanValue);
                } else {
                    meoVar2 = meoVar;
                    i3 = 4;
                }
                jfp jfpVar7 = jfpVar;
                if (!jfpVar7.c || qfp.h(i3, qfpVar5).isEmpty()) {
                    Object g14 = tpiVar4.g(ufp.a);
                    if (g14 == null) {
                        g14 = null;
                    }
                    List list3 = (List) g14;
                    vbVar2.r(list3 != null ? (String) CollectionsKt.firstOrNull(list3) : null);
                }
                Object g15 = tpiVar4.g(ufp.x);
                if (g15 == null) {
                    g15 = null;
                }
                String str2 = (String) g15;
                if (str2 != null) {
                    qfp qfpVar6 = qfpVar5;
                    while (true) {
                        if (qfpVar6 == null) {
                            z8 = false;
                            break;
                        }
                        jfp jfpVar8 = qfpVar6.d;
                        xfp xfpVar2 = vfp.a;
                        if (jfpVar8.a.c(xfpVar2)) {
                            z8 = ((Boolean) jfpVar8.g(xfpVar2)).booleanValue();
                            break;
                        }
                        qfpVar6 = qfpVar6.j();
                    }
                    if (z8) {
                        obtain.setViewIdResourceName(str2);
                    }
                }
                Object g16 = tpiVar4.g(ufp.h);
                if (g16 == null) {
                    g16 = null;
                }
                if (((Unit) g16) != null) {
                    vbVar2.s(true);
                }
                obtain.setPassword(tpiVar4.c(ufp.I));
                obtain.setEditable(tpiVar4.c(ufp.L));
                Object g17 = tpiVar4.g(ufp.M);
                if (g17 == null) {
                    g17 = null;
                }
                Integer num = (Integer) g17;
                accessibilityNodeInfo3.setMaxTextLength(num != null ? num.intValue() : -1);
                accessibilityNodeInfo3.setEnabled(bf0.a(qfpVar5));
                xfp xfpVar3 = ufp.k;
                accessibilityNodeInfo3.setFocusable(tpiVar4.c(xfpVar3));
                if (obtain.isFocusable()) {
                    accessibilityNodeInfo3.setFocused(((Boolean) jfpVar7.g(xfpVar3)).booleanValue());
                    if (!obtain.isFocused()) {
                        i2 = i;
                        ye0Var = ye0Var2;
                        i4 = 2;
                        z = true;
                        vbVar2.a(1);
                        accessibilityNodeInfo3.setVisibleToUser(bkp.k0(qfpVar5) ^ z);
                        g = tpiVar4.g(ufp.j);
                        if (g == null) {
                            g = null;
                        }
                        tdgVar = (tdg) g;
                        if (tdgVar != null) {
                            int i30 = tdgVar.a;
                            if (!(i30 == 0)) {
                            }
                            i4 = 1;
                            obtain.setLiveRegion(i4);
                        }
                        vbVar2.o(false);
                        xfp xfpVar4 = hfp.a;
                        g2 = tpiVar4.g(hfp.b);
                        if (g2 == null) {
                            g2 = null;
                        }
                        saVar = (sa) g2;
                        if (saVar != null) {
                            Object g18 = tpiVar4.g(ufp.G);
                            if (g18 == null) {
                                g18 = null;
                            }
                            boolean d4 = Intrinsics.d(g18, Boolean.TRUE);
                            if (!(meoVar2 != null && meoVar2.a == 4)) {
                                if (!(meoVar2 != null && meoVar2.a == 3)) {
                                    z7 = false;
                                    vbVar2.o(z7 || (z7 && !d4));
                                    if (bf0.a(qfpVar5) && obtain.isClickable()) {
                                        vbVar2.b(new qb(16, saVar.a));
                                    }
                                }
                            }
                            z7 = true;
                            vbVar2.o(z7 || (z7 && !d4));
                            if (bf0.a(qfpVar5)) {
                                vbVar2.b(new qb(16, saVar.a));
                            }
                        }
                        accessibilityNodeInfo3.setLongClickable(false);
                        g3 = tpiVar4.g(hfp.c);
                        if (g3 == null) {
                            g3 = null;
                        }
                        saVar2 = (sa) g3;
                        if (saVar2 != null) {
                            accessibilityNodeInfo3.setLongClickable(true);
                            if (bf0.a(qfpVar5)) {
                                vbVar2.b(new qb(32, saVar2.a));
                            }
                        }
                        g4 = tpiVar4.g(hfp.p);
                        if (g4 == null) {
                            g4 = null;
                        }
                        saVar3 = (sa) g4;
                        if (saVar3 != null) {
                            vbVar2.b(new qb(16384, saVar3.a));
                        }
                        if (bf0.a(qfpVar5)) {
                            Object g19 = tpiVar4.g(hfp.j);
                            if (g19 == null) {
                                g19 = null;
                            }
                            sa saVar4 = (sa) g19;
                            if (saVar4 != null) {
                                vbVar2.b(new qb(2097152, saVar4.a));
                            }
                            Object g20 = tpiVar4.g(hfp.o);
                            if (g20 == null) {
                                g20 = null;
                            }
                            sa saVar5 = (sa) g20;
                            if (saVar5 != null) {
                                vbVar2.b(new qb(android.R.id.accessibilityActionImeEnter, saVar5.a));
                            }
                            Object g21 = tpiVar4.g(hfp.q);
                            if (g21 == null) {
                                g21 = null;
                            }
                            sa saVar6 = (sa) g21;
                            if (saVar6 != null) {
                                vbVar2.b(new qb(SQLiteDatabase.OPEN_FULLMUTEX, saVar6.a));
                            }
                            Object g22 = tpiVar4.g(hfp.r);
                            if (g22 == null) {
                                g22 = null;
                            }
                            sa saVar7 = (sa) g22;
                            if (saVar7 != null && obtain.isFocused()) {
                                ClipDescription primaryClipDescription = androidComposeView.getClipboardManager().a.getPrimaryClipDescription();
                                if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                    vbVar2.b(new qb(SQLiteDatabase.OPEN_NOMUTEX, saVar7.a));
                                }
                            }
                        }
                        t = ye0.t(qfpVar5);
                        if (!(t != null || t.length() == 0)) {
                            obtain.setTextSelection(ye0Var.r(qfpVar5), ye0Var.q(qfpVar5));
                            Object g23 = tpiVar4.g(hfp.i);
                            if (g23 == null) {
                                g23 = null;
                            }
                            sa saVar8 = (sa) g23;
                            vbVar2.b(new qb(SQLiteDatabase.OPEN_SHAREDCACHE, saVar8 != null ? saVar8.a : null));
                            vbVar2.a(256);
                            vbVar2.a(RemoteCameraConfig.Mic.BUFFER_SIZE);
                            accessibilityNodeInfo3.setMovementGranularities(11);
                            Object g24 = tpiVar4.g(ufp.a);
                            if (g24 == null) {
                                g24 = null;
                            }
                            List list4 = (List) g24;
                            if ((list4 == null || list4.isEmpty()) && tpiVar4.c(hfp.a)) {
                                if (tpiVar4.c(ufp.D)) {
                                    Object g25 = tpiVar4.g(xfpVar3);
                                    if (g25 == null) {
                                        g25 = null;
                                    }
                                }
                                mpf u = qfpVar5.c.u();
                                while (true) {
                                    if (u == null) {
                                        u = null;
                                        break;
                                    }
                                    jfp w = u.w();
                                    if (w != null && w.c) {
                                        if (w.a.c(ufp.D)) {
                                            z6 = true;
                                            if (!z6) {
                                                break;
                                            }
                                            u = u.u();
                                        }
                                    }
                                    z6 = false;
                                    if (!z6) {
                                    }
                                }
                                if (u != null) {
                                    jfp w2 = u.w();
                                    if (w2 != null) {
                                        Object g26 = w2.a.g(xfpVar3);
                                        if (g26 == null) {
                                            g26 = null;
                                        }
                                        z5 = Intrinsics.d(g26, Boolean.TRUE);
                                    } else {
                                        z5 = false;
                                    }
                                }
                                boolean z9 = false;
                                if (!z9) {
                                    accessibilityNodeInfo3.setMovementGranularities(obtain.getMovementGranularities() | 20);
                                }
                            }
                        }
                        i5 = Build.VERSION.SDK_INT;
                        if (i5 >= 26) {
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add("androidx.compose.ui.semantics.id");
                            CharSequence g27 = vbVar2.g();
                            if (!(g27 == null || g27.length() == 0) && tpiVar4.c(hfp.a)) {
                                arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                            }
                            if (tpiVar4.c(ufp.x)) {
                                arrayList3.add("androidx.compose.ui.semantics.testTag");
                            }
                            vbVar2.i(arrayList3);
                        }
                        g5 = tpiVar4.g(ufp.c);
                        if (g5 == null) {
                            g5 = null;
                        }
                        oumVar = (oum) g5;
                        if (oumVar == null) {
                            float f = oumVar.a;
                            gq4 gq4Var = oumVar.b;
                            xfp xfpVar5 = hfp.h;
                            if (tpiVar4.c(xfpVar5)) {
                                vbVar2.n("android.widget.SeekBar");
                            } else {
                                vbVar2.n("android.widget.ProgressBar");
                            }
                            if (oumVar != oum.d) {
                                accessibilityNodeInfo3.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, ((Number) gq4Var.g()).floatValue(), ((Number) gq4Var.m()).floatValue(), f));
                            }
                            jfpVar3 = jfpVar2;
                            if (jfpVar3.a.c(xfpVar5) && bf0.a(qfpVar5)) {
                                float floatValue = ((Number) gq4Var.m()).floatValue();
                                float floatValue2 = ((Number) gq4Var.g()).floatValue();
                                if (floatValue < floatValue2) {
                                    floatValue = floatValue2;
                                }
                                if (f < floatValue) {
                                    vbVar2.b(qb.i);
                                }
                                float floatValue3 = ((Number) gq4Var.g()).floatValue();
                                float floatValue4 = ((Number) gq4Var.m()).floatValue();
                                if (floatValue3 > floatValue4) {
                                    floatValue3 = floatValue4;
                                }
                                if (f > floatValue3) {
                                    vbVar2.b(qb.j);
                                }
                            }
                        } else {
                            jfpVar3 = jfpVar2;
                        }
                        if (bf0.a(qfpVar5)) {
                            Object g28 = jfpVar3.a.g(hfp.h);
                            if (g28 == null) {
                                g28 = null;
                            }
                            sa saVar9 = (sa) g28;
                            if (saVar9 != null) {
                                vbVar2.b(new qb(android.R.id.accessibilityActionSetProgress, saVar9.a));
                            }
                        }
                        vnj.P(vbVar2, qfpVar5);
                        g6 = qfpVar5.i().a.g(ufp.g);
                        if (g6 == null) {
                            g6 = null;
                        }
                        my4Var = (my4) g6;
                        if (my4Var != null) {
                            int i31 = my4Var.a;
                            int i32 = my4Var.b;
                            int i33 = my4Var.c;
                            int i34 = my4Var.d;
                            Object g29 = qfpVar5.i().a.g(ufp.G);
                            if (g29 == null) {
                                g29 = Boolean.FALSE;
                            }
                            vbVar2.q(ub.d(((Boolean) g29).booleanValue(), i31, i32, i33, i34));
                        }
                        j = qfpVar5.j();
                        if (j != null) {
                            Object g30 = j.i().a.g(ufp.e);
                            if (g30 == null) {
                                g30 = null;
                            }
                            if (g30 != null) {
                                Object g31 = j.i().a.g(ufp.f);
                                if (g31 == null) {
                                    g31 = null;
                                }
                                ky4 ky4Var = (ky4) g31;
                                if (ky4Var == null || (ky4Var.a >= 0 && ky4Var.b >= 0)) {
                                    if (qfpVar5.i().a.c(ufp.G)) {
                                        ArrayList arrayList4 = new ArrayList();
                                        List h2 = qfp.h(4, j);
                                        int size8 = h2.size();
                                        int i35 = 0;
                                        for (int i36 = 0; i36 < size8; i36++) {
                                            qfp qfpVar7 = (qfp) h2.get(i36);
                                            if (qfpVar7.i().a.c(ufp.G)) {
                                                arrayList4.add(qfpVar7);
                                                if (qfpVar7.c.v() < qfpVar5.c.v()) {
                                                    i35++;
                                                }
                                            }
                                        }
                                        if (!arrayList4.isEmpty()) {
                                            boolean m = vnj.m(arrayList4);
                                            int i37 = m ? 0 : i35;
                                            if (!m) {
                                                i35 = 0;
                                            }
                                            Object g32 = qfpVar5.i().a.g(ufp.G);
                                            if (g32 == null) {
                                                g32 = Boolean.FALSE;
                                            }
                                            vbVar2.q(ub.d(((Boolean) g32).booleanValue(), i37, 1, i35, 1));
                                        }
                                    }
                                }
                            }
                        }
                        g7 = jfpVar3.a.g(ufp.s);
                        if (g7 == null) {
                            g7 = null;
                        }
                        cwoVar = (cwo) g7;
                        g8 = jfpVar3.a.g(hfp.d);
                        if (g8 == null) {
                            g8 = null;
                        }
                        sa saVar10 = (sa) g8;
                        if (cwoVar != null && saVar10 != null) {
                            g9 = qfpVar5.i().a.g(ufp.f);
                            if (g9 == null) {
                                g9 = null;
                            }
                            if (g9 == null) {
                                Object g33 = qfpVar5.i().a.g(ufp.e);
                                if (g33 == null) {
                                    g33 = null;
                                }
                                if (g33 == null) {
                                    z4 = false;
                                    if (!z4) {
                                        vbVar2.n("android.widget.HorizontalScrollView");
                                    }
                                    if (((Number) cwoVar.b.invoke()).floatValue() > 0.0f) {
                                        vbVar2.w(true);
                                    }
                                    if (bf0.a(qfpVar5)) {
                                        if (ye0.y(cwoVar)) {
                                            vbVar2.b(qb.i);
                                            vbVar2.b(!bf0.f(qfpVar5) ? qb.r : qb.p);
                                        }
                                        if (ye0.x(cwoVar)) {
                                            vbVar2.b(qb.j);
                                            vbVar2.b(!bf0.f(qfpVar5) ? qb.p : qb.r);
                                        }
                                    }
                                }
                            }
                            z4 = true;
                            if (!z4) {
                            }
                            if (((Number) cwoVar.b.invoke()).floatValue() > 0.0f) {
                            }
                            if (bf0.a(qfpVar5)) {
                            }
                        }
                        cwoVar2 = (cwo) wdg.O(jfpVar3, ufp.t);
                        if (cwoVar2 != null || saVar10 == null) {
                            z2 = true;
                        } else {
                            Object g34 = qfpVar5.i().a.g(ufp.f);
                            if (g34 == null) {
                                g34 = null;
                            }
                            if (g34 == null) {
                                Object g35 = qfpVar5.i().a.g(ufp.e);
                                if (g35 == null) {
                                    g35 = null;
                                }
                                if (g35 == null) {
                                    z3 = false;
                                    if (!z3) {
                                        vbVar2.n("android.widget.ScrollView");
                                    }
                                    z2 = true;
                                    if (((Number) cwoVar2.b.invoke()).floatValue() > 0.0f) {
                                        vbVar2.w(true);
                                    }
                                    if (bf0.a(qfpVar5)) {
                                        if (ye0.y(cwoVar2)) {
                                            vbVar2.b(qb.i);
                                            vbVar2.b(qb.q);
                                        }
                                        if (ye0.x(cwoVar2)) {
                                            vbVar2.b(qb.j);
                                            vbVar2.b(qb.o);
                                        }
                                    }
                                }
                            }
                            z3 = true;
                            if (!z3) {
                            }
                            z2 = true;
                            if (((Number) cwoVar2.b.invoke()).floatValue() > 0.0f) {
                            }
                            if (bf0.a(qfpVar5)) {
                            }
                        }
                        if (i5 >= 29) {
                            x97.m(vbVar2, qfpVar5);
                        }
                        vbVar2.u((CharSequence) wdg.O(qfpVar5.k(), ufp.d));
                        if (bf0.a(qfpVar5)) {
                            sa saVar11 = (sa) wdg.O(qfpVar5.k(), hfp.s);
                            if (saVar11 != null) {
                                vbVar2.b(new qb(SQLiteDatabase.OPEN_PRIVATECACHE, saVar11.a));
                            }
                            sa saVar12 = (sa) wdg.O(qfpVar5.k(), hfp.t);
                            if (saVar12 != null) {
                                vbVar2.b(new qb(524288, saVar12.a));
                            }
                            sa saVar13 = (sa) wdg.O(qfpVar5.k(), hfp.u);
                            if (saVar13 != null) {
                                vbVar2.b(new qb(1048576, saVar13.a));
                            }
                            jfp k = qfpVar5.k();
                            xfp xfpVar6 = hfp.w;
                            if (k.a.c(xfpVar6)) {
                                List list5 = (List) qfpVar5.k().g(xfpVar6);
                                roi roiVar3 = roiVar;
                                if (list5.size() >= roiVar3.b) {
                                    xq0.q(f1d.i(new StringBuilder("Can't have more than "), roiVar3.b, " custom actions for one widget"));
                                    return null;
                                }
                                q4r q4rVar2 = new q4r(0);
                                cpi a3 = uhj.a();
                                if (u2x.x(q4rVar.c, i2, q4rVar.a) >= 0 ? z2 : false) {
                                    cpi cpiVar = (cpi) q4rVar.c(i2);
                                    roi roiVar4 = new roi();
                                    int[] iArr = roiVar3.a;
                                    int i38 = roiVar3.b;
                                    for (int i39 = 0; i39 < i38; i39++) {
                                        roiVar4.a(iArr[i39]);
                                    }
                                    ArrayList arrayList5 = new ArrayList();
                                    int size9 = list5.size();
                                    int i40 = 0;
                                    while (i40 < size9) {
                                        nw6 nw6Var = (nw6) list5.get(i40);
                                        cpiVar.getClass();
                                        int i41 = size9;
                                        if (cpiVar.d(nw6Var.a()) >= 0) {
                                            int e2 = cpiVar.e(nw6Var.a());
                                            i6 = i40;
                                            q4rVar2.e(e2, nw6Var.a());
                                            a3.i(e2, nw6Var.a());
                                            roiVar4.e(e2);
                                            vbVar2.b(new qb(e2, nw6Var.a()));
                                        } else {
                                            i6 = i40;
                                            arrayList5.add(nw6Var);
                                        }
                                        i40 = i6 + 1;
                                        size9 = i41;
                                    }
                                    int size10 = arrayList5.size();
                                    for (int i42 = 0; i42 < size10; i42++) {
                                        nw6 nw6Var2 = (nw6) arrayList5.get(i42);
                                        int c = roiVar4.c(i42);
                                        q4rVar2.e(c, nw6Var2.a());
                                        a3.i(c, nw6Var2.a());
                                        vbVar2.b(new qb(c, nw6Var2.a()));
                                    }
                                } else {
                                    int size11 = list5.size();
                                    for (int i43 = 0; i43 < size11; i43++) {
                                        nw6 nw6Var3 = (nw6) list5.get(i43);
                                        int c2 = roiVar3.c(i43);
                                        q4rVar2.e(c2, nw6Var3.a());
                                        a3.i(c2, nw6Var3.a());
                                        vbVar2.b(new qb(c2, nw6Var3.a()));
                                    }
                                }
                                ye0Var.u.e(i2, q4rVar2);
                                q4rVar.e(i2, a3);
                            }
                        }
                        vbVar2.v(bf0.g(qfpVar5, resources4));
                        d = ye0Var.E.d(i2);
                        if (d == -1) {
                            oj0 q02 = bkp.q0(androidComposeView.getAndroidViewsHandler$ui_release(), d);
                            if (q02 != null) {
                                accessibilityNodeInfo3.setTraversalBefore(q02);
                                androidComposeView2 = androidComposeView;
                            } else {
                                androidComposeView2 = androidComposeView;
                                accessibilityNodeInfo3.setTraversalBefore(androidComposeView2, d);
                            }
                            bundle = null;
                            ye0Var.j(i2, vbVar2, ye0Var.G, null);
                        } else {
                            bundle = null;
                            androidComposeView2 = androidComposeView;
                        }
                        d2 = ye0Var.F.d(i2);
                        if (d2 != -1 && (q0 = bkp.q0(androidComposeView2.getAndroidViewsHandler$ui_release(), d2)) != null) {
                            accessibilityNodeInfo3.setTraversalAfter(q0);
                            ye0Var.j(i2, vbVar2, ye0Var.H, bundle);
                        }
                        vbVar = vbVar2;
                        if (ye0Var.r) {
                            if (i2 == ye0Var.n) {
                                ye0Var.p = vbVar;
                            }
                            if (i2 == ye0Var.o) {
                                ye0Var.q = vbVar;
                            }
                        }
                        return vbVar;
                    }
                    i4 = 2;
                    vbVar2.a(2);
                    i2 = i;
                    ye0Var = ye0Var2;
                    ye0Var.o = i2;
                } else {
                    i2 = i;
                    ye0Var = ye0Var2;
                    i4 = 2;
                }
                z = true;
                accessibilityNodeInfo3.setVisibleToUser(bkp.k0(qfpVar5) ^ z);
                g = tpiVar4.g(ufp.j);
                if (g == null) {
                }
                tdgVar = (tdg) g;
                if (tdgVar != null) {
                }
                vbVar2.o(false);
                xfp xfpVar42 = hfp.a;
                g2 = tpiVar4.g(hfp.b);
                if (g2 == null) {
                }
                saVar = (sa) g2;
                if (saVar != null) {
                }
                accessibilityNodeInfo3.setLongClickable(false);
                g3 = tpiVar4.g(hfp.c);
                if (g3 == null) {
                }
                saVar2 = (sa) g3;
                if (saVar2 != null) {
                }
                g4 = tpiVar4.g(hfp.p);
                if (g4 == null) {
                }
                saVar3 = (sa) g4;
                if (saVar3 != null) {
                }
                if (bf0.a(qfpVar5)) {
                }
                t = ye0.t(qfpVar5);
                if (!(t != null || t.length() == 0)) {
                }
                i5 = Build.VERSION.SDK_INT;
                if (i5 >= 26) {
                }
                g5 = tpiVar4.g(ufp.c);
                if (g5 == null) {
                }
                oumVar = (oum) g5;
                if (oumVar == null) {
                }
                if (bf0.a(qfpVar5)) {
                }
                vnj.P(vbVar2, qfpVar5);
                g6 = qfpVar5.i().a.g(ufp.g);
                if (g6 == null) {
                }
                my4Var = (my4) g6;
                if (my4Var != null) {
                }
                j = qfpVar5.j();
                if (j != null) {
                }
                g7 = jfpVar3.a.g(ufp.s);
                if (g7 == null) {
                }
                cwoVar = (cwo) g7;
                g8 = jfpVar3.a.g(hfp.d);
                if (g8 == null) {
                }
                sa saVar102 = (sa) g8;
                if (cwoVar != null) {
                    g9 = qfpVar5.i().a.g(ufp.f);
                    if (g9 == null) {
                    }
                    if (g9 == null) {
                    }
                    z4 = true;
                    if (!z4) {
                    }
                    if (((Number) cwoVar.b.invoke()).floatValue() > 0.0f) {
                    }
                    if (bf0.a(qfpVar5)) {
                    }
                }
                cwoVar2 = (cwo) wdg.O(jfpVar3, ufp.t);
                if (cwoVar2 != null) {
                }
                z2 = true;
                if (i5 >= 29) {
                }
                vbVar2.u((CharSequence) wdg.O(qfpVar5.k(), ufp.d));
                if (bf0.a(qfpVar5)) {
                }
                vbVar2.v(bf0.g(qfpVar5, resources4));
                d = ye0Var.E.d(i2);
                if (d == -1) {
                }
                d2 = ye0Var.F.d(i2);
                if (d2 != -1) {
                    accessibilityNodeInfo3.setTraversalAfter(q0);
                    ye0Var.j(i2, vbVar2, ye0Var.H, bundle);
                }
                vbVar = vbVar2;
                if (ye0Var.r) {
                }
                return vbVar;
            }
        }
        i2 = i;
        ye0Var = ye0Var3;
        vbVar = null;
        if (ye0Var.r) {
        }
        return vbVar;
    }

    @Override // defpackage.jzi
    public void a(int i, vb vbVar, String str, Bundle bundle) {
        switch (this.d) {
            case 0:
                ((ye0) this.e).j(i, vbVar, str, bundle);
                break;
        }
    }

    @Override // defpackage.jzi
    public final vb h(int i) {
        switch (this.d) {
            case 0:
                return M(i);
            default:
                return new vb(AccessibilityNodeInfo.obtain(((kzb) this.e).s(i).a));
        }
    }

    @Override // defpackage.jzi
    public final vb q(int i) {
        switch (this.d) {
            case 0:
                ye0 ye0Var = (ye0) this.e;
                if (i == 1) {
                    int i2 = ye0Var.o;
                    if (i2 != Integer.MIN_VALUE) {
                        return h(i2);
                    }
                } else {
                    if (i == 2) {
                        return h(ye0Var.n);
                    }
                    xq0.x(k5r.i(i, "Unknown focus type: "));
                }
                return null;
            default:
                kzb kzbVar = (kzb) this.e;
                int i3 = i == 2 ? kzbVar.k : kzbVar.l;
                if (i3 == Integer.MIN_VALUE) {
                    return null;
                }
                return h(i3);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x01ff, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x073f, code lost:
    
        if (r1 != 16) goto L517;
     */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x07f5  */
    @Override // defpackage.jzi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean y(int i, int i2, Bundle bundle) {
        boolean z;
        qfp qfpVar;
        int i3;
        int i4;
        Integer num;
        b6 b6Var;
        int i5;
        int i6;
        b6 b6Var2;
        cds i0;
        Function0 function0;
        int i7;
        int i8;
        Function0 function02;
        Function0 function03;
        Function0 function04;
        float f;
        float f2;
        Float f3;
        sa saVar;
        Function0 function05;
        Float f4;
        float intBitsToFloat;
        sa saVar2;
        Function0 function06;
        Function1 function1;
        Function0 function07;
        Function0 function08;
        Function0 function09;
        Function0 function010;
        Function0 function011;
        Function1 function12;
        sa saVar3;
        long j;
        Object g;
        cwo cwoVar;
        cwo cwoVar2;
        float f5;
        float f6;
        float f7;
        Function2 function2;
        Function1 function13;
        Function0 function012;
        Function0 function013;
        Function0 function014;
        Function0 function015;
        Function0 function016;
        CharSequence charSequence;
        int i9;
        int i10 = this.d;
        a aVar = this.e;
        switch (i10) {
            case 0:
                ye0 ye0Var = (ye0) aVar;
                AndroidComposeView androidComposeView = ye0Var.d;
                Float valueOf = Float.valueOf(0.0f);
                sfp sfpVar = (sfp) ye0Var.s().b(i);
                if (sfpVar != null && (qfpVar = sfpVar.a) != null) {
                    int i11 = qfpVar.g;
                    jfp jfpVar = qfpVar.d;
                    tpi tpiVar = jfpVar.a;
                    if (i2 == 64) {
                        z = false;
                        AccessibilityManager accessibilityManager = ye0Var.g;
                        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i3 = ye0Var.n) != i) {
                            if (i3 != Integer.MIN_VALUE) {
                                i4 = 12;
                                num = null;
                                ye0.D(ye0Var, i3, SQLiteDatabase.OPEN_FULLMUTEX, null, 12);
                            } else {
                                i4 = 12;
                                num = null;
                            }
                            ye0Var.n = i;
                            androidComposeView.invalidate();
                            ye0.D(ye0Var, i, SQLiteDatabase.OPEN_NOMUTEX, num, i4);
                            return true;
                        }
                    } else if (i2 == 128) {
                        z = false;
                        if (ye0Var.n == i) {
                            ye0Var.n = Integer.MIN_VALUE;
                            ye0Var.p = null;
                            androidComposeView.invalidate();
                            ye0.D(ye0Var, i, SQLiteDatabase.OPEN_FULLMUTEX, null, 12);
                            return true;
                        }
                    } else if (i2 == 256 || i2 == 512) {
                        if (bundle != null) {
                            int i12 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                            boolean z2 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                            boolean z3 = i2 == 256;
                            Integer num2 = ye0Var.x;
                            if (num2 == null || i11 != num2.intValue()) {
                                ye0Var.w = -1;
                                ye0Var.x = Integer.valueOf(i11);
                            }
                            String t = ye0.t(qfpVar);
                            if (t != null && t.length() != 0) {
                                String t2 = ye0.t(qfpVar);
                                if (t2 != null && t2.length() != 0) {
                                    if (i12 == 1) {
                                        Locale locale = androidComposeView.getContext().getResources().getConfiguration().locale;
                                        if (xa.f == null) {
                                            xa xaVar = new xa(0);
                                            xaVar.e = BreakIterator.getCharacterInstance(locale);
                                            xa.f = xaVar;
                                        }
                                        xa xaVar2 = xa.f;
                                        xaVar2.getClass();
                                        xaVar2.O(t2);
                                        b6Var2 = xaVar2;
                                    } else if (i12 != 2) {
                                        if (i12 != 4) {
                                            if (i12 != 8) {
                                                break;
                                            } else {
                                                if (ab.d == null) {
                                                    ab.d = new ab(1, (byte) 0);
                                                }
                                                ab abVar = ab.d;
                                                abVar.getClass();
                                                abVar.b = t2;
                                                b6Var2 = abVar;
                                            }
                                        }
                                        if (tpiVar.c(hfp.a) && (i0 = bkp.i0(jfpVar)) != null) {
                                            if (i12 == 4) {
                                                if (ya.e == null) {
                                                    ya.e = new ya(1, (byte) 0);
                                                }
                                                ya yaVar = ya.e;
                                                yaVar.getClass();
                                                yaVar.b = t2;
                                                yaVar.d = i0;
                                                b6Var2 = yaVar;
                                            } else {
                                                if (za.f == null) {
                                                    za zaVar = new za(1, (byte) 0);
                                                    new Rect();
                                                    za.f = zaVar;
                                                }
                                                za zaVar2 = za.f;
                                                zaVar2.getClass();
                                                zaVar2.b = t2;
                                                zaVar2.d = i0;
                                                zaVar2.e = qfpVar;
                                                b6Var2 = zaVar2;
                                            }
                                        }
                                    } else {
                                        Locale locale2 = androidComposeView.getContext().getResources().getConfiguration().locale;
                                        if (xa.g == null) {
                                            xa xaVar3 = new xa(1);
                                            xaVar3.e = BreakIterator.getWordInstance(locale2);
                                            xa.g = xaVar3;
                                        }
                                        xa xaVar4 = xa.g;
                                        xaVar4.getClass();
                                        xaVar4.O(t2);
                                        b6Var2 = xaVar4;
                                    }
                                    b6Var = b6Var2;
                                    if (b6Var != null) {
                                        int q = ye0Var.q(qfpVar);
                                        if (q == -1) {
                                            q = z3 ? 0 : t.length();
                                        }
                                        int[] o = z3 ? b6Var.o(q) : b6Var.G(q);
                                        if (o != null) {
                                            int i13 = o[0];
                                            int i14 = o[1];
                                            if (z2 && !tpiVar.c(ufp.a) && tpiVar.c(ufp.D)) {
                                                i5 = ye0Var.r(qfpVar);
                                                if (i5 == -1) {
                                                    i5 = z3 ? i13 : i14;
                                                }
                                                i6 = z3 ? i14 : i13;
                                            } else {
                                                i5 = z3 ? i14 : i13;
                                                i6 = i5;
                                            }
                                            ye0Var.B = new ve0(qfpVar, z3 ? 256 : 512, i12, i13, i14, SystemClock.uptimeMillis());
                                            ye0Var.J(qfpVar, i5, i6, true);
                                            return true;
                                        }
                                    }
                                }
                                b6Var = null;
                                if (b6Var != null) {
                                }
                            }
                        }
                    } else if (i2 == 16384) {
                        Object g2 = tpiVar.g(hfp.p);
                        sa saVar4 = (sa) (g2 == null ? null : g2);
                        if (saVar4 != null && (function0 = (Function0) saVar4.b) != null) {
                            return ((Boolean) function0.invoke()).booleanValue();
                        }
                    } else {
                        if (i2 == 131072) {
                            if (bundle != null) {
                                i7 = -1;
                                i8 = bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1);
                            } else {
                                i7 = -1;
                                i8 = -1;
                            }
                            boolean J = ye0Var.J(qfpVar, i8, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", i7) : -1, false);
                            if (!J) {
                                return J;
                            }
                            ye0.D(ye0Var, ye0Var.z(i11), 0, null, 12);
                            return J;
                        }
                        if (bf0.a(qfpVar)) {
                            if (i2 == 1) {
                                Object g3 = tpiVar.g(hfp.v);
                                sa saVar5 = (sa) (g3 == null ? null : g3);
                                if (saVar5 != null && (function02 = (Function0) saVar5.b) != null) {
                                    return ((Boolean) function02.invoke()).booleanValue();
                                }
                            } else if (i2 != 2) {
                                switch (i2) {
                                    case 16:
                                        Object g4 = tpiVar.g(hfp.b);
                                        if (g4 == null) {
                                            g4 = null;
                                        }
                                        sa saVar6 = (sa) g4;
                                        Boolean bool = (saVar6 == null || (function03 = (Function0) saVar6.b) == null) ? null : (Boolean) function03.invoke();
                                        ye0.D(ye0Var, i, 1, null, 12);
                                        if (bool != null) {
                                            return bool.booleanValue();
                                        }
                                        break;
                                    case 32:
                                        Object g5 = tpiVar.g(hfp.c);
                                        sa saVar7 = (sa) (g5 == null ? null : g5);
                                        if (saVar7 != null && (function04 = (Function0) saVar7.b) != null) {
                                            return ((Boolean) function04.invoke()).booleanValue();
                                        }
                                        break;
                                    case 4096:
                                    case RemoteCameraConfig.Notification.ID /* 8192 */:
                                        boolean z4 = i2 == 4096;
                                        boolean z5 = i2 == 8192;
                                        boolean z6 = i2 == 16908345;
                                        boolean z7 = i2 == 16908347;
                                        boolean z8 = i2 == 16908344;
                                        boolean z9 = i2 == 16908346;
                                        boolean z10 = z6 || z7 || z4 || z5;
                                        boolean z11 = z8 || z9 || z4 || z5;
                                        if (z4 || z5) {
                                            Object g6 = tpiVar.g(ufp.c);
                                            if (g6 == null) {
                                                g6 = null;
                                            }
                                            oum oumVar = (oum) g6;
                                            Object g7 = tpiVar.g(hfp.h);
                                            if (g7 == null) {
                                                g7 = null;
                                            }
                                            sa saVar8 = (sa) g7;
                                            if (oumVar != null) {
                                                gq4 gq4Var = oumVar.b;
                                                if (saVar8 != null) {
                                                    float floatValue = ((Number) gq4Var.m()).floatValue();
                                                    float floatValue2 = ((Number) gq4Var.g()).floatValue();
                                                    if (floatValue < floatValue2) {
                                                        floatValue = floatValue2;
                                                    }
                                                    float floatValue3 = ((Number) gq4Var.g()).floatValue();
                                                    float floatValue4 = ((Number) gq4Var.m()).floatValue();
                                                    if (floatValue3 > floatValue4) {
                                                        floatValue3 = floatValue4;
                                                    }
                                                    int i15 = oumVar.c;
                                                    if (i15 > 0) {
                                                        f = floatValue - floatValue3;
                                                        f2 = i15 + 1;
                                                    } else {
                                                        f = floatValue - floatValue3;
                                                        f2 = 20;
                                                    }
                                                    float f8 = f / f2;
                                                    if (z5) {
                                                        f8 = -f8;
                                                    }
                                                    Function1 function14 = (Function1) saVar8.b;
                                                    if (function14 != null) {
                                                        return ((Boolean) function14.invoke(Float.valueOf(oumVar.a + f8))).booleanValue();
                                                    }
                                                }
                                            }
                                        }
                                        long e = ltg.v((ane) qfpVar.c.F.c).e();
                                        ArrayList arrayList = new ArrayList();
                                        Object g8 = tpiVar.g(hfp.B);
                                        if (g8 == null) {
                                            g8 = null;
                                        }
                                        sa saVar9 = (sa) g8;
                                        Float f9 = (saVar9 == null || (function1 = (Function1) saVar9.b) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) ? null : (Float) arrayList.get(0);
                                        Object g9 = tpiVar.g(hfp.d);
                                        if (g9 == null) {
                                            g9 = null;
                                        }
                                        sa saVar10 = (sa) g9;
                                        if (saVar10 != null) {
                                            syc sycVar = saVar10.b;
                                            Object g10 = tpiVar.g(ufp.s);
                                            if (g10 == null) {
                                                g10 = null;
                                            }
                                            cwo cwoVar3 = (cwo) g10;
                                            if (cwoVar3 == null || !z10) {
                                                f3 = valueOf;
                                            } else {
                                                if (f9 != null) {
                                                    intBitsToFloat = f9.floatValue();
                                                    f4 = valueOf;
                                                } else {
                                                    f4 = valueOf;
                                                    intBitsToFloat = Float.intBitsToFloat((int) (e >> 32));
                                                }
                                                if (z6 || z5) {
                                                    intBitsToFloat = -intBitsToFloat;
                                                }
                                                if (cwoVar3.c) {
                                                    intBitsToFloat = -intBitsToFloat;
                                                }
                                                if (bf0.f(qfpVar) && (z6 || z7)) {
                                                    intBitsToFloat = -intBitsToFloat;
                                                }
                                                if (ye0.w(cwoVar3, intBitsToFloat)) {
                                                    xfp xfpVar = hfp.y;
                                                    if (tpiVar.c(xfpVar) || tpiVar.c(hfp.A)) {
                                                        if (intBitsToFloat > 0.0f) {
                                                            Object g11 = tpiVar.g(hfp.A);
                                                            saVar2 = (sa) (g11 == null ? null : g11);
                                                        } else {
                                                            Object g12 = tpiVar.g(xfpVar);
                                                            saVar2 = (sa) (g12 == null ? null : g12);
                                                        }
                                                        if (saVar2 != null && (function06 = (Function0) saVar2.b) != null) {
                                                            return ((Boolean) function06.invoke()).booleanValue();
                                                        }
                                                    } else {
                                                        Function2 function22 = (Function2) sycVar;
                                                        if (function22 != null) {
                                                            return ((Boolean) function22.invoke(Float.valueOf(intBitsToFloat), f4)).booleanValue();
                                                        }
                                                    }
                                                } else {
                                                    f3 = f4;
                                                }
                                            }
                                            Object g13 = tpiVar.g(ufp.t);
                                            if (g13 == null) {
                                                g13 = null;
                                            }
                                            cwo cwoVar4 = (cwo) g13;
                                            if (cwoVar4 != null && z11) {
                                                float floatValue5 = f9 != null ? f9.floatValue() : Float.intBitsToFloat((int) (4294967295L & e));
                                                if (z8 || z5) {
                                                    floatValue5 = -floatValue5;
                                                }
                                                if (cwoVar4.c) {
                                                    floatValue5 = -floatValue5;
                                                }
                                                if (ye0.w(cwoVar4, floatValue5)) {
                                                    xfp xfpVar2 = hfp.x;
                                                    if (tpiVar.c(xfpVar2) || tpiVar.c(hfp.z)) {
                                                        if (floatValue5 > 0.0f) {
                                                            Object g14 = tpiVar.g(hfp.z);
                                                            saVar = (sa) (g14 == null ? null : g14);
                                                        } else {
                                                            Object g15 = tpiVar.g(xfpVar2);
                                                            saVar = (sa) (g15 == null ? null : g15);
                                                        }
                                                        if (saVar != null && (function05 = (Function0) saVar.b) != null) {
                                                            return ((Boolean) function05.invoke()).booleanValue();
                                                        }
                                                    } else {
                                                        Function2 function23 = (Function2) sycVar;
                                                        if (function23 != null) {
                                                            return ((Boolean) function23.invoke(f3, Float.valueOf(floatValue5))).booleanValue();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                    case SQLiteDatabase.OPEN_NOMUTEX /* 32768 */:
                                        Object g16 = tpiVar.g(hfp.r);
                                        sa saVar11 = (sa) (g16 == null ? null : g16);
                                        if (saVar11 != null && (function07 = (Function0) saVar11.b) != null) {
                                            return ((Boolean) function07.invoke()).booleanValue();
                                        }
                                        break;
                                    case SQLiteDatabase.OPEN_FULLMUTEX /* 65536 */:
                                        Object g17 = tpiVar.g(hfp.q);
                                        sa saVar12 = (sa) (g17 == null ? null : g17);
                                        if (saVar12 != null && (function08 = (Function0) saVar12.b) != null) {
                                            return ((Boolean) function08.invoke()).booleanValue();
                                        }
                                        break;
                                    case SQLiteDatabase.OPEN_PRIVATECACHE /* 262144 */:
                                        Object g18 = tpiVar.g(hfp.s);
                                        sa saVar13 = (sa) (g18 == null ? null : g18);
                                        if (saVar13 != null && (function09 = (Function0) saVar13.b) != null) {
                                            return ((Boolean) function09.invoke()).booleanValue();
                                        }
                                        break;
                                    case 524288:
                                        Object g19 = tpiVar.g(hfp.t);
                                        sa saVar14 = (sa) (g19 == null ? null : g19);
                                        if (saVar14 != null && (function010 = (Function0) saVar14.b) != null) {
                                            return ((Boolean) function010.invoke()).booleanValue();
                                        }
                                        break;
                                    case 1048576:
                                        Object g20 = tpiVar.g(hfp.u);
                                        sa saVar15 = (sa) (g20 == null ? null : g20);
                                        if (saVar15 != null && (function011 = (Function0) saVar15.b) != null) {
                                            return ((Boolean) function011.invoke()).booleanValue();
                                        }
                                        break;
                                    case 2097152:
                                        String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                                        Object g21 = tpiVar.g(hfp.j);
                                        sa saVar16 = (sa) (g21 == null ? null : g21);
                                        if (saVar16 != null && (function12 = (Function1) saVar16.b) != null) {
                                            if (string == null) {
                                                string = "";
                                            }
                                            return ((Boolean) function12.invoke(new mn0(string))).booleanValue();
                                        }
                                        break;
                                    case android.R.id.accessibilityActionShowOnScreen:
                                        qfp j2 = qfpVar.j();
                                        if (j2 != null) {
                                            Object g22 = j2.d.a.g(hfp.d);
                                            if (g22 == null) {
                                                g22 = null;
                                            }
                                            saVar3 = (sa) g22;
                                            while (j2 != null && saVar3 == null) {
                                                j2 = j2.j();
                                                if (j2 != null) {
                                                    Object g23 = j2.d.a.g(hfp.d);
                                                    if (g23 == null) {
                                                        g23 = null;
                                                    }
                                                    saVar3 = (sa) g23;
                                                }
                                            }
                                            if (j2 != null) {
                                                tpi tpiVar2 = j2.d.a;
                                                mpf mpfVar = j2.c;
                                                ynn v = ltg.v((ane) mpfVar.F.c);
                                                wof Q = ((ane) mpfVar.F.c).Q();
                                                ynn l = v.l(Q != null ? ((f8j) Q).S(0L) : 0L);
                                                f8j c = qfpVar.c();
                                                if (c != null) {
                                                    if (!c.b1().n) {
                                                        c = null;
                                                    }
                                                    if (c != null) {
                                                        j = c.S(0L);
                                                        f8j c2 = qfpVar.c();
                                                        ynn d = ywf.d(j, nt0.Q(c2 != null ? c2.c : 0L));
                                                        g = tpiVar2.g(ufp.s);
                                                        if (g == null) {
                                                            g = null;
                                                        }
                                                        cwoVar = (cwo) g;
                                                        Object g24 = tpiVar2.g(ufp.t);
                                                        cwoVar2 = (cwo) (g24 != null ? null : g24);
                                                        f5 = d.a - l.a;
                                                        f6 = d.c - l.c;
                                                        if (Math.signum(f5) == Math.signum(f6)) {
                                                            f5 = 0.0f;
                                                        } else if (Math.abs(f5) >= Math.abs(f6)) {
                                                            f5 = f6;
                                                        }
                                                        if (cwoVar != null && cwoVar.c) {
                                                            f5 = -f5;
                                                        }
                                                        if (bf0.f(qfpVar)) {
                                                            f5 = -f5;
                                                        }
                                                        float f10 = d.b - l.b;
                                                        float f11 = d.d - l.d;
                                                        f7 = Math.signum(f10) != Math.signum(f11) ? Math.abs(f10) < Math.abs(f11) ? f10 : f11 : 0.0f;
                                                        if (cwoVar2 != null && cwoVar2.c) {
                                                            f7 = -f7;
                                                        }
                                                        if (saVar3 != null && (function2 = (Function2) saVar3.b) != null) {
                                                            return ((Boolean) function2.invoke(Float.valueOf(f5), Float.valueOf(f7))).booleanValue();
                                                        }
                                                    }
                                                }
                                                j = 0;
                                                f8j c22 = qfpVar.c();
                                                ynn d2 = ywf.d(j, nt0.Q(c22 != null ? c22.c : 0L));
                                                g = tpiVar2.g(ufp.s);
                                                if (g == null) {
                                                }
                                                cwoVar = (cwo) g;
                                                Object g242 = tpiVar2.g(ufp.t);
                                                cwoVar2 = (cwo) (g242 != null ? null : g242);
                                                f5 = d2.a - l.a;
                                                f6 = d2.c - l.c;
                                                if (Math.signum(f5) == Math.signum(f6)) {
                                                }
                                                if (cwoVar != null) {
                                                    f5 = -f5;
                                                }
                                                if (bf0.f(qfpVar)) {
                                                }
                                                float f102 = d2.b - l.b;
                                                float f112 = d2.d - l.d;
                                                if (Math.signum(f102) != Math.signum(f112)) {
                                                }
                                                if (cwoVar2 != null) {
                                                    f7 = -f7;
                                                }
                                                if (saVar3 != null) {
                                                    return ((Boolean) function2.invoke(Float.valueOf(f5), Float.valueOf(f7))).booleanValue();
                                                }
                                            }
                                        }
                                        saVar3 = null;
                                        break;
                                    case android.R.id.accessibilityActionSetProgress:
                                        if (bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                                            Object g25 = tpiVar.g(hfp.h);
                                            sa saVar17 = (sa) (g25 == null ? null : g25);
                                            if (saVar17 != null && (function13 = (Function1) saVar17.b) != null) {
                                                return ((Boolean) function13.invoke(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                                            }
                                        }
                                        break;
                                    case android.R.id.accessibilityActionImeEnter:
                                        Object g26 = tpiVar.g(hfp.o);
                                        sa saVar18 = (sa) (g26 == null ? null : g26);
                                        if (saVar18 != null && (function012 = (Function0) saVar18.b) != null) {
                                            return ((Boolean) function012.invoke()).booleanValue();
                                        }
                                        break;
                                    default:
                                        switch (i2) {
                                            case android.R.id.accessibilityActionScrollUp:
                                            case android.R.id.accessibilityActionScrollLeft:
                                            case android.R.id.accessibilityActionScrollDown:
                                            case android.R.id.accessibilityActionScrollRight:
                                                break;
                                            default:
                                                switch (i2) {
                                                    case android.R.id.accessibilityActionPageUp:
                                                        Object g27 = tpiVar.g(hfp.x);
                                                        sa saVar19 = (sa) (g27 == null ? null : g27);
                                                        if (saVar19 != null && (function013 = (Function0) saVar19.b) != null) {
                                                            return ((Boolean) function013.invoke()).booleanValue();
                                                        }
                                                        break;
                                                    case android.R.id.accessibilityActionPageDown:
                                                        Object g28 = tpiVar.g(hfp.z);
                                                        sa saVar20 = (sa) (g28 == null ? null : g28);
                                                        if (saVar20 != null && (function014 = (Function0) saVar20.b) != null) {
                                                            return ((Boolean) function014.invoke()).booleanValue();
                                                        }
                                                        break;
                                                    case android.R.id.accessibilityActionPageLeft:
                                                        Object g29 = tpiVar.g(hfp.y);
                                                        sa saVar21 = (sa) (g29 == null ? null : g29);
                                                        if (saVar21 != null && (function015 = (Function0) saVar21.b) != null) {
                                                            return ((Boolean) function015.invoke()).booleanValue();
                                                        }
                                                        break;
                                                    case android.R.id.accessibilityActionPageRight:
                                                        Object g30 = tpiVar.g(hfp.A);
                                                        sa saVar22 = (sa) (g30 == null ? null : g30);
                                                        if (saVar22 != null && (function016 = (Function0) saVar22.b) != null) {
                                                            return ((Boolean) function016.invoke()).booleanValue();
                                                        }
                                                        break;
                                                    default:
                                                        q4r q4rVar = (q4r) ye0Var.u.c(i);
                                                        if (q4rVar != null && (charSequence = (CharSequence) q4rVar.c(i2)) != null) {
                                                            Object g31 = tpiVar.g(hfp.w);
                                                            List list = (List) (g31 == null ? null : g31);
                                                            if (list != null) {
                                                                int size = list.size();
                                                                for (int i16 = 0; i16 < size; i16++) {
                                                                    nw6 nw6Var = (nw6) list.get(i16);
                                                                    if (Intrinsics.d(nw6Var.a, charSequence)) {
                                                                        return ((Boolean) nw6Var.b.invoke()).booleanValue();
                                                                    }
                                                                }
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                }
                                        }
                                }
                            } else {
                                Object g32 = tpiVar.g(ufp.k);
                                if (Intrinsics.d(g32 == null ? null : g32, Boolean.TRUE)) {
                                    ((uoc) androidComposeView.getFocusOwner()).b(8, false, true);
                                    return true;
                                }
                            }
                        }
                    }
                    return z;
                }
                z = false;
                return z;
            default:
                kzb kzbVar = (kzb) aVar;
                View view = kzbVar.i;
                if (i == -1) {
                    WeakHashMap weakHashMap = wdu.a;
                    return view.performAccessibilityAction(i2, bundle);
                }
                if (i2 == 1) {
                    return kzbVar.y(i);
                }
                if (i2 == 2) {
                    return kzbVar.j(i);
                }
                if (i2 == 64) {
                    AccessibilityManager accessibilityManager2 = kzbVar.h;
                    if (accessibilityManager2.isEnabled() && accessibilityManager2.isTouchExplorationEnabled() && (i9 = kzbVar.k) != i) {
                        if (i9 != Integer.MIN_VALUE) {
                            kzbVar.k = Integer.MIN_VALUE;
                            view.invalidate();
                            kzbVar.z(i9, SQLiteDatabase.OPEN_FULLMUTEX);
                        }
                        kzbVar.k = i;
                        view.invalidate();
                        kzbVar.z(i, SQLiteDatabase.OPEN_NOMUTEX);
                        return true;
                    }
                } else {
                    if (i2 != 128) {
                        return kzbVar.u(i, i2, bundle);
                    }
                    if (kzbVar.k == i) {
                        kzbVar.k = Integer.MIN_VALUE;
                        view.invalidate();
                        kzbVar.z(i, SQLiteDatabase.OPEN_FULLMUTEX);
                        return true;
                    }
                }
                return false;
        }
    }
}
