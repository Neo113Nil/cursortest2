package ru.yandex.taxi.altpins.models;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StyleSpan;
import com.yandex.go.address.models.Address;
import com.yandex.go.preorder.source.altpins.Alternatives;
import com.yandex.go.summary.branding_pin.i;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.a0c0;
import defpackage.avj0;
import defpackage.bz1;
import defpackage.c0c0;
import defpackage.cz1;
import defpackage.evu0;
import defpackage.f0c0;
import defpackage.f1h0;
import defpackage.f4e;
import defpackage.fef;
import defpackage.i1c0;
import defpackage.jgv;
import defpackage.jst;
import defpackage.kdc;
import defpackage.kvc;
import defpackage.lub0;
import defpackage.mrg0;
import defpackage.my6;
import defpackage.ny61;
import defpackage.oj4;
import defpackage.pdc;
import defpackage.pex0;
import defpackage.q47;
import defpackage.qy1;
import defpackage.rf00;
import defpackage.s8o;
import defpackage.scc;
import defpackage.svc;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tt2;
import defpackage.ufu;
import defpackage.uyj;
import defpackage.vy1;
import defpackage.w511;
import defpackage.xdf;
import defpackage.zuj0;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.altpins.models.b;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.ui.ButtonOrientation;
import ru.yandex.taxi.common_models.ui.TextStyle;
import ru.yandex.taxi.design.span.RoundedBackgroundSpan;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes5.dex */
public final class a {
    public final Context a;
    public final xdf b;
    public final pdc c;
    public final zuj0 d;
    public final tt2 e;
    public final jgv f;
    public final c g;
    public final e h;
    public final i i;

    public a(Context context, xdf xdfVar, pdc pdcVar, zuj0 zuj0Var, tt2 tt2Var, jgv jgvVar, c cVar, e eVar, i iVar) {
        this.a = context;
        this.b = xdfVar;
        this.c = pdcVar;
        this.d = zuj0Var;
        this.e = tt2Var;
        this.f = jgvVar;
        this.g = cVar;
        this.h = eVar;
        this.i = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [zy6] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.lang.Object, ru.yandex.taxi.altpins.models.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, f4e f4eVar, OptionType optionType, ContinuationImpl continuationImpl) {
        AltpinDestinationMapper$mapModal$1 altpinDestinationMapper$mapModal$1;
        int i;
        ButtonOrientation buttonOrientation;
        String str;
        q47 q47Var;
        bz1 bz1Var;
        ?? r21;
        aVar.getClass();
        if (continuationImpl instanceof AltpinDestinationMapper$mapModal$1) {
            altpinDestinationMapper$mapModal$1 = (AltpinDestinationMapper$mapModal$1) continuationImpl;
            int i2 = altpinDestinationMapper$mapModal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                altpinDestinationMapper$mapModal$1.label = i2 - Integer.MIN_VALUE;
                Object obj = altpinDestinationMapper$mapModal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = altpinDestinationMapper$mapModal$1.label;
                Throwable th = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Alternatives.ConfirmationScreen.Modal modal = f4eVar.a.d;
                    Alternatives.ConfirmationScreen.Buttons buttons = modal.a;
                    pdc pdcVar = aVar.c;
                    List list = buttons.b;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    int i3 = 0;
                    for (Object obj2 : list) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            Throwable th2 = th;
                            scc.m();
                            throw th2;
                        }
                        Alternatives.ConfirmationScreen.Button button = (Alternatives.ConfirmationScreen.Button) obj2;
                        Throwable th3 = th;
                        ufu ufuVar = (ufu) pdcVar;
                        kdc i5 = ufuVar.i(button.c);
                        kdc b = ufuVar.b(button.b);
                        TextStyle textStyle = i3 == scc.f(buttons.b) ? TextStyle.ACCENT : TextStyle.DEFAULT;
                        int i6 = cz1.a[button.d.a.ordinal()];
                        if (i6 == 1) {
                            bz1Var = bz1.b;
                        } else if (i6 == 2) {
                            bz1Var = bz1.a;
                        } else {
                            if (i6 != 3) {
                                w511.b();
                                return th3;
                            }
                            jst.e.c("Unknown action for button");
                            r21 = th3;
                            arrayList.add(new my6(button.a, i5, b, textStyle, r21, null, null, false, false, 16292));
                            th = th3;
                            i3 = i4;
                        }
                        r21 = bz1Var;
                        arrayList.add(new my6(button.a, i5, b, textStyle, r21, null, null, false, false, 16292));
                        th = th3;
                        i3 = i4;
                    }
                    Throwable th4 = th;
                    int i7 = cz1.b[buttons.a.ordinal()];
                    if (i7 == 1) {
                        buttonOrientation = ButtonOrientation.HORIZONTAL;
                    } else {
                        if (i7 != 2) {
                            w511.b();
                            return th4;
                        }
                        buttonOrientation = ButtonOrientation.VERTICAL;
                    }
                    q47 q47Var2 = new q47(buttonOrientation, arrayList);
                    String str2 = modal.b.a;
                    altpinDestinationMapper$mapModal$1.L$0 = th4;
                    altpinDestinationMapper$mapModal$1.L$1 = th4;
                    altpinDestinationMapper$mapModal$1.L$2 = th4;
                    altpinDestinationMapper$mapModal$1.L$3 = q47Var2;
                    altpinDestinationMapper$mapModal$1.L$4 = str2;
                    altpinDestinationMapper$mapModal$1.label = 1;
                    Object f = aVar.f(f4eVar, optionType, altpinDestinationMapper$mapModal$1);
                    if (f == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = f;
                    str = str2;
                    q47Var = q47Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) altpinDestinationMapper$mapModal$1.L$4;
                    q47Var = (q47) altpinDestinationMapper$mapModal$1.L$3;
                    kotlin.b.b(obj);
                }
                return new b.a(q47Var, str, (svc) obj);
            }
        }
        altpinDestinationMapper$mapModal$1 = new AltpinDestinationMapper$mapModal$1(aVar, continuationImpl);
        Object obj3 = altpinDestinationMapper$mapModal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = altpinDestinationMapper$mapModal$1.label;
        Throwable th5 = null;
        if (i != 0) {
        }
        return new b.a(q47Var, str, (svc) obj3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, Address address, int i, boolean z, ContinuationImpl continuationImpl) {
        AltpinDestinationMapper$mapSourceBubble$1 altpinDestinationMapper$mapSourceBubble$1;
        int i2;
        lub0 e;
        f0c0 a0c0Var;
        Object d;
        aVar.getClass();
        if (continuationImpl instanceof AltpinDestinationMapper$mapSourceBubble$1) {
            altpinDestinationMapper$mapSourceBubble$1 = (AltpinDestinationMapper$mapSourceBubble$1) continuationImpl;
            int i3 = altpinDestinationMapper$mapSourceBubble$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                altpinDestinationMapper$mapSourceBubble$1.label = i3 - Integer.MIN_VALUE;
                Object obj = altpinDestinationMapper$mapSourceBubble$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = altpinDestinationMapper$mapSourceBubble$1.label;
                i1c0 i1c0Var = null;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    pex0 m = ((k) aVar.i.a).m();
                    e = m != null ? i.e(m) : null;
                    String str = e != null ? e.a : null;
                    if (str == null || evu0.J(str)) {
                        if (z) {
                            a0c0Var = new c0c0(tje.y(f1h0.ic_source_pin_24, aVar.a));
                        } else {
                            Integer num = new Integer(i);
                            a0c0Var = num.intValue() <= 0 ? a0c0.c : new a0c0(String.valueOf(num.intValue()), num);
                        }
                        zzs B = address.B();
                        String D1 = address.D1();
                        e eVar = aVar.h;
                        if (e != null) {
                            Integer c = eVar.c(e.b);
                            Integer p = eVar.p(e.c);
                            if (c != null && p != null) {
                                i1c0Var = new i1c0(p.intValue(), c.intValue());
                            }
                        }
                        return new vy1(B, D1, a0c0Var, i1c0Var);
                    }
                    String str2 = e != null ? e.a : null;
                    altpinDestinationMapper$mapSourceBubble$1.L$0 = address;
                    altpinDestinationMapper$mapSourceBubble$1.L$1 = e;
                    altpinDestinationMapper$mapSourceBubble$1.I$0 = i;
                    altpinDestinationMapper$mapSourceBubble$1.Z$0 = z;
                    altpinDestinationMapper$mapSourceBubble$1.label = 1;
                    d = aVar.d(str2, altpinDestinationMapper$mapSourceBubble$1);
                    if (d == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    lub0 lub0Var = (lub0) altpinDestinationMapper$mapSourceBubble$1.L$1;
                    Address address2 = (Address) altpinDestinationMapper$mapSourceBubble$1.L$0;
                    kotlin.b.b(obj);
                    e = lub0Var;
                    address = address2;
                    d = obj;
                }
                a0c0Var = (f0c0) d;
                zzs B2 = address.B();
                String D12 = address.D1();
                e eVar2 = aVar.h;
                if (e != null) {
                }
                return new vy1(B2, D12, a0c0Var, i1c0Var);
            }
        }
        altpinDestinationMapper$mapSourceBubble$1 = new AltpinDestinationMapper$mapSourceBubble$1(aVar, continuationImpl);
        Object obj3 = altpinDestinationMapper$mapSourceBubble$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = altpinDestinationMapper$mapSourceBubble$1.label;
        i1c0 i1c0Var2 = null;
        if (i2 != 0) {
        }
        a0c0Var = (f0c0) d;
        zzs B22 = address.B();
        String D122 = address.D1();
        e eVar22 = aVar.h;
        if (e != null) {
        }
        return new vy1(B22, D122, a0c0Var, i1c0Var2);
    }

    public final CharSequence c(String str, oj4 oj4Var, fef fefVar) {
        if (oj4Var == null) {
            return str;
        }
        String a = this.b.a(fefVar, oj4Var.a, false, true);
        SpannableString spannableString = new SpannableString(a);
        String str2 = oj4Var.b;
        ufu ufuVar = (ufu) this.c;
        kdc i = ufuVar.i(str2);
        kdc b = ufuVar.b(oj4Var.c);
        if (b != null && i != null) {
            Context context = this.a;
            int m = s8o.m(b, context);
            int m2 = s8o.m(i, context);
            int i2 = mrg0.button_component_default_rounded_corners_radius;
            avj0 avj0Var = (avj0) this.d;
            float f = 0.0f;
            RoundedBackgroundSpan roundedBackgroundSpan = new RoundedBackgroundSpan(m, m2, tje.w(4, avj0Var.a), f, avj0Var.b(i2), false, 0.0f, 0.0f, 224, null);
            spannableString.setSpan(new AbsoluteSizeSpan(avj0Var.c(mrg0.component_text_size_bubble)), 0, a.length(), 18);
            spannableString.setSpan(roundedBackgroundSpan, 0, a.length(), 18);
            spannableString.setSpan(new StyleSpan(1), 0, a.length(), 18);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (r9 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
    
        if (r9 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        AltpinDestinationMapper$getPinStateIcon$1 altpinDestinationMapper$getPinStateIcon$1;
        int i;
        BitmapDrawable bitmapDrawable;
        if (continuationImpl instanceof AltpinDestinationMapper$getPinStateIcon$1) {
            altpinDestinationMapper$getPinStateIcon$1 = (AltpinDestinationMapper$getPinStateIcon$1) continuationImpl;
            int i2 = altpinDestinationMapper$getPinStateIcon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                altpinDestinationMapper$getPinStateIcon$1.label = i2 - Integer.MIN_VALUE;
                Object obj = altpinDestinationMapper$getPinStateIcon$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = altpinDestinationMapper$getPinStateIcon$1.label;
                e eVar = this.h;
                if (i != 0) {
                    kotlin.b.b(obj);
                    altpinDestinationMapper$getPinStateIcon$1.L$0 = str;
                    altpinDestinationMapper$getPinStateIcon$1.label = 1;
                    obj = e.i(eVar, str, null, altpinDestinationMapper$getPinStateIcon$1, 14);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        bitmapDrawable = (BitmapDrawable) obj;
                        if (bitmapDrawable != null) {
                            return new c0c0(bitmapDrawable);
                        }
                        return new c0c0(tje.y(f1h0.ic_source_pin_24, this.a));
                    }
                    str = (String) altpinDestinationMapper$getPinStateIcon$1.L$0;
                    kotlin.b.b(obj);
                }
                bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable == null) {
                    altpinDestinationMapper$getPinStateIcon$1.L$0 = null;
                    altpinDestinationMapper$getPinStateIcon$1.label = 2;
                    obj = e.f(eVar, str, null, altpinDestinationMapper$getPinStateIcon$1, 6);
                }
                if (bitmapDrawable != null) {
                }
            }
        }
        altpinDestinationMapper$getPinStateIcon$1 = new AltpinDestinationMapper$getPinStateIcon$1(this, continuationImpl);
        Object obj2 = altpinDestinationMapper$getPinStateIcon$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = altpinDestinationMapper$getPinStateIcon$1.label;
        e eVar2 = this.h;
        if (i != 0) {
        }
        bitmapDrawable = (BitmapDrawable) obj2;
        if (bitmapDrawable == null) {
        }
        if (bitmapDrawable != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        if (r2 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(rf00 rf00Var, Address address, fef fefVar, boolean z, ContinuationImpl continuationImpl) {
        AltpinDestinationMapper$mapBubble$1 altpinDestinationMapper$mapBubble$1;
        int i;
        String a;
        Object o;
        BitmapDrawable bitmapDrawable;
        boolean z2;
        rf00 rf00Var2;
        boolean z3;
        Address address2;
        fef fefVar2;
        if (continuationImpl instanceof AltpinDestinationMapper$mapBubble$1) {
            altpinDestinationMapper$mapBubble$1 = (AltpinDestinationMapper$mapBubble$1) continuationImpl;
            int i2 = altpinDestinationMapper$mapBubble$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                altpinDestinationMapper$mapBubble$1.label = i2 - Integer.MIN_VALUE;
                Object obj = altpinDestinationMapper$mapBubble$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = altpinDestinationMapper$mapBubble$1.label;
                e eVar = this.h;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a = this.f.a(rf00Var.a);
                    if (a == null) {
                        a = "";
                    }
                    altpinDestinationMapper$mapBubble$1.L$0 = rf00Var;
                    altpinDestinationMapper$mapBubble$1.L$1 = address;
                    altpinDestinationMapper$mapBubble$1.L$2 = fefVar;
                    altpinDestinationMapper$mapBubble$1.L$3 = a;
                    altpinDestinationMapper$mapBubble$1.Z$0 = z;
                    altpinDestinationMapper$mapBubble$1.label = 1;
                    o = e.o(eVar, a, null, altpinDestinationMapper$mapBubble$1, 14);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z3 = altpinDestinationMapper$mapBubble$1.Z$0;
                        fefVar2 = (fef) altpinDestinationMapper$mapBubble$1.L$2;
                        address2 = (Address) altpinDestinationMapper$mapBubble$1.L$1;
                        rf00Var2 = (rf00) altpinDestinationMapper$mapBubble$1.L$0;
                        kotlin.b.b(obj);
                        bitmapDrawable = (BitmapDrawable) obj;
                        Address address3 = address2;
                        fefVar = fefVar2;
                        address = address3;
                        z2 = z3;
                        rf00Var = rf00Var2;
                        BitmapDrawable bitmapDrawable2 = bitmapDrawable;
                        zzs B = address.B();
                        String str = rf00Var.b;
                        oj4 oj4Var = rf00Var.d;
                        return new qy1(B, c(str, oj4Var, fefVar), c(rf00Var.c, oj4Var, fefVar), bitmapDrawable2, z2);
                    }
                    z = altpinDestinationMapper$mapBubble$1.Z$0;
                    String str2 = (String) altpinDestinationMapper$mapBubble$1.L$3;
                    fefVar = (fef) altpinDestinationMapper$mapBubble$1.L$2;
                    address = (Address) altpinDestinationMapper$mapBubble$1.L$1;
                    rf00 rf00Var3 = (rf00) altpinDestinationMapper$mapBubble$1.L$0;
                    kotlin.b.b(obj);
                    a = str2;
                    rf00Var = rf00Var3;
                    o = obj;
                }
                bitmapDrawable = (BitmapDrawable) o;
                if (bitmapDrawable == null) {
                    z2 = z;
                    BitmapDrawable bitmapDrawable22 = bitmapDrawable;
                    zzs B2 = address.B();
                    String str3 = rf00Var.b;
                    oj4 oj4Var2 = rf00Var.d;
                    return new qy1(B2, c(str3, oj4Var2, fefVar), c(rf00Var.c, oj4Var2, fefVar), bitmapDrawable22, z2);
                }
                altpinDestinationMapper$mapBubble$1.L$0 = rf00Var;
                altpinDestinationMapper$mapBubble$1.L$1 = address;
                altpinDestinationMapper$mapBubble$1.L$2 = fefVar;
                altpinDestinationMapper$mapBubble$1.L$3 = null;
                altpinDestinationMapper$mapBubble$1.Z$0 = z;
                altpinDestinationMapper$mapBubble$1.label = 2;
                obj = e.k(eVar, a, null, altpinDestinationMapper$mapBubble$1, 14);
                if (obj != coroutineSingletons) {
                    boolean z4 = z;
                    rf00Var2 = rf00Var;
                    z3 = z4;
                    fef fefVar3 = fefVar;
                    address2 = address;
                    fefVar2 = fefVar3;
                    bitmapDrawable = (BitmapDrawable) obj;
                    Address address32 = address2;
                    fefVar = fefVar2;
                    address = address32;
                    z2 = z3;
                    rf00Var = rf00Var2;
                    BitmapDrawable bitmapDrawable222 = bitmapDrawable;
                    zzs B22 = address.B();
                    String str32 = rf00Var.b;
                    oj4 oj4Var22 = rf00Var.d;
                    return new qy1(B22, c(str32, oj4Var22, fefVar), c(rf00Var.c, oj4Var22, fefVar), bitmapDrawable222, z2);
                }
                return coroutineSingletons;
            }
        }
        altpinDestinationMapper$mapBubble$1 = new AltpinDestinationMapper$mapBubble$1(this, continuationImpl);
        Object obj2 = altpinDestinationMapper$mapBubble$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = altpinDestinationMapper$mapBubble$1.label;
        e eVar2 = this.h;
        if (i != 0) {
        }
        bitmapDrawable = (BitmapDrawable) o;
        if (bitmapDrawable == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(f4e f4eVar, OptionType optionType, ContinuationImpl continuationImpl) {
        AltpinDestinationMapper$mapComparisonBlock$1 altpinDestinationMapper$mapComparisonBlock$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        int i2;
        Alternatives.ConfirmationScreen.ComparisonBlock comparisonBlock;
        f4e f4eVar2;
        int i3;
        Alternatives.ConfirmationScreen.ComparisonBlock comparisonBlock2;
        kvc kvcVar;
        f4e f4eVar3 = f4eVar;
        if (continuationImpl instanceof AltpinDestinationMapper$mapComparisonBlock$1) {
            altpinDestinationMapper$mapComparisonBlock$1 = (AltpinDestinationMapper$mapComparisonBlock$1) continuationImpl;
            int i4 = altpinDestinationMapper$mapComparisonBlock$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                altpinDestinationMapper$mapComparisonBlock$1.label = i4 - Integer.MIN_VALUE;
                obj = altpinDestinationMapper$mapComparisonBlock$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = altpinDestinationMapper$mapComparisonBlock$1.label;
                c cVar = this.g;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Alternatives.ConfirmationScreen.ComparisonBlock comparisonBlock3 = f4eVar3.a.d.b;
                    i2 = optionType == OptionType.ALTPIN ? 1 : 0;
                    FormattedText formattedText = comparisonBlock3.c;
                    altpinDestinationMapper$mapComparisonBlock$1.L$0 = f4eVar3;
                    altpinDestinationMapper$mapComparisonBlock$1.L$1 = null;
                    altpinDestinationMapper$mapComparisonBlock$1.L$2 = comparisonBlock3;
                    altpinDestinationMapper$mapComparisonBlock$1.I$0 = i2;
                    altpinDestinationMapper$mapComparisonBlock$1.label = 1;
                    Object i5 = c.i(cVar, formattedText, null, altpinDestinationMapper$mapComparisonBlock$1, 30);
                    if (i5 != coroutineSingletons) {
                        comparisonBlock = comparisonBlock3;
                        obj = i5;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = altpinDestinationMapper$mapComparisonBlock$1.I$0;
                    kvcVar = (kvc) altpinDestinationMapper$mapComparisonBlock$1.L$5;
                    comparisonBlock2 = (Alternatives.ConfirmationScreen.ComparisonBlock) altpinDestinationMapper$mapComparisonBlock$1.L$2;
                    f4eVar2 = (f4e) altpinDestinationMapper$mapComparisonBlock$1.L$0;
                    kotlin.b.b(obj);
                    CharSequence charSequence = (CharSequence) obj;
                    String str = comparisonBlock2.f.b;
                    return new svc(kvcVar, new kvc(comparisonBlock2.d, f4eVar2.c.D1(), f4eVar2.k, charSequence, i3 != 0, ru.yandex.taxi.altpins.confirmation_screen.modal.comparison_block.OptionType.ORIGINAL, (str != null || str.length() == 0) ? charSequence : str));
                }
                int i6 = altpinDestinationMapper$mapComparisonBlock$1.I$0;
                Alternatives.ConfirmationScreen.ComparisonBlock comparisonBlock4 = (Alternatives.ConfirmationScreen.ComparisonBlock) altpinDestinationMapper$mapComparisonBlock$1.L$2;
                f4e f4eVar4 = (f4e) altpinDestinationMapper$mapComparisonBlock$1.L$0;
                kotlin.b.b(obj);
                i2 = i6;
                f4eVar3 = f4eVar4;
                comparisonBlock = comparisonBlock4;
                CharSequence charSequence2 = (CharSequence) obj;
                String str2 = comparisonBlock.f.a;
                kvc kvcVar2 = new kvc(comparisonBlock.b, f4eVar3.b.D1(), f4eVar3.j, charSequence2, i2 == 0, ru.yandex.taxi.altpins.confirmation_screen.modal.comparison_block.OptionType.ALTPIN_B, (str2 != null || str2.length() == 0) ? charSequence2 : str2);
                FormattedText formattedText2 = comparisonBlock.e;
                altpinDestinationMapper$mapComparisonBlock$1.L$0 = f4eVar3;
                altpinDestinationMapper$mapComparisonBlock$1.L$1 = null;
                altpinDestinationMapper$mapComparisonBlock$1.L$2 = comparisonBlock;
                altpinDestinationMapper$mapComparisonBlock$1.L$3 = null;
                altpinDestinationMapper$mapComparisonBlock$1.L$4 = null;
                altpinDestinationMapper$mapComparisonBlock$1.L$5 = kvcVar2;
                altpinDestinationMapper$mapComparisonBlock$1.I$0 = i2;
                altpinDestinationMapper$mapComparisonBlock$1.label = 2;
                obj = c.i(cVar, formattedText2, null, altpinDestinationMapper$mapComparisonBlock$1, 30);
                if (obj != coroutineSingletons) {
                    f4eVar2 = f4eVar3;
                    i3 = i2;
                    comparisonBlock2 = comparisonBlock;
                    kvcVar = kvcVar2;
                    CharSequence charSequence3 = (CharSequence) obj;
                    String str3 = comparisonBlock2.f.b;
                    return new svc(kvcVar, new kvc(comparisonBlock2.d, f4eVar2.c.D1(), f4eVar2.k, charSequence3, i3 != 0, ru.yandex.taxi.altpins.confirmation_screen.modal.comparison_block.OptionType.ORIGINAL, (str3 != null || str3.length() == 0) ? charSequence3 : str3));
                }
                return coroutineSingletons;
            }
        }
        altpinDestinationMapper$mapComparisonBlock$1 = new AltpinDestinationMapper$mapComparisonBlock$1(this, continuationImpl);
        obj = altpinDestinationMapper$mapComparisonBlock$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = altpinDestinationMapper$mapComparisonBlock$1.label;
        c cVar2 = this.g;
        if (i != 0) {
        }
        CharSequence charSequence22 = (CharSequence) obj;
        String str22 = comparisonBlock.f.a;
        kvc kvcVar22 = new kvc(comparisonBlock.b, f4eVar3.b.D1(), f4eVar3.j, charSequence22, i2 == 0, ru.yandex.taxi.altpins.confirmation_screen.modal.comparison_block.OptionType.ALTPIN_B, (str22 != null || str22.length() == 0) ? charSequence22 : str22);
        FormattedText formattedText22 = comparisonBlock.e;
        altpinDestinationMapper$mapComparisonBlock$1.L$0 = f4eVar3;
        altpinDestinationMapper$mapComparisonBlock$1.L$1 = null;
        altpinDestinationMapper$mapComparisonBlock$1.L$2 = comparisonBlock;
        altpinDestinationMapper$mapComparisonBlock$1.L$3 = null;
        altpinDestinationMapper$mapComparisonBlock$1.L$4 = null;
        altpinDestinationMapper$mapComparisonBlock$1.L$5 = kvcVar22;
        altpinDestinationMapper$mapComparisonBlock$1.I$0 = i2;
        altpinDestinationMapper$mapComparisonBlock$1.label = 2;
        obj = c.i(cVar2, formattedText22, null, altpinDestinationMapper$mapComparisonBlock$1, 30);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public final Object g(f4e f4eVar, OptionType optionType, Continuation continuation) {
        this.e.getClass();
        return tje.k0(uyj.a, new AltpinDestinationMapper$mapConfirmationScreen$2(f4eVar, null, this, optionType), continuation);
    }
}
