package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.a360;
import defpackage.a460;
import defpackage.b460;
import defpackage.bni0;
import defpackage.c460;
import defpackage.cni0;
import defpackage.d360;
import defpackage.d460;
import defpackage.dni0;
import defpackage.e360;
import defpackage.e460;
import defpackage.f360;
import defpackage.f460;
import defpackage.g460;
import defpackage.gia1;
import defpackage.h360;
import defpackage.h460;
import defpackage.i360;
import defpackage.i460;
import defpackage.j460;
import defpackage.k460;
import defpackage.l460;
import defpackage.l7x0;
import defpackage.lvi0;
import defpackage.m260;
import defpackage.m460;
import defpackage.n260;
import defpackage.n460;
import defpackage.ny61;
import defpackage.o260;
import defpackage.o460;
import defpackage.p260;
import defpackage.p360;
import defpackage.p460;
import defpackage.q260;
import defpackage.q8s;
import defpackage.r260;
import defpackage.r460;
import defpackage.s260;
import defpackage.s360;
import defpackage.s460;
import defpackage.t260;
import defpackage.t460;
import defpackage.tcc;
import defpackage.u260;
import defpackage.u460;
import defpackage.uvi0;
import defpackage.v260;
import defpackage.v460;
import defpackage.w260;
import defpackage.w460;
import defpackage.w511;
import defpackage.x260;
import defpackage.y260;
import defpackage.z260;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.logistics.sdk.tracking.impl.data.NeuroPostcardShownStagesRepository;

/* loaded from: classes5.dex */
public final class b {
    public final String a;
    public final q8s b;
    public final NeuroPostcardShownStagesRepository c;
    public final l7x0 d;
    public final ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a e;

    public b(String str, q8s q8sVar, NeuroPostcardShownStagesRepository neuroPostcardShownStagesRepository, l7x0 l7x0Var, ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a aVar) {
        this.a = str;
        this.b = q8sVar;
        this.c = neuroPostcardShownStagesRepository;
        this.d = l7x0Var;
        this.e = aVar;
    }

    public final String a(gia1 gia1Var) {
        if (gia1Var instanceof dni0) {
            return ((dni0) gia1Var).a;
        }
        if (gia1Var instanceof bni0) {
            return this.d.a(((bni0) gia1Var).a);
        }
        if (gia1Var.equals(cni0.a)) {
            return null;
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(p460 p460Var, boolean z, ContinuationImpl continuationImpl) {
        NeuroPostcardMapper$map$1 neuroPostcardMapper$map$1;
        Object obj;
        int i;
        Object e;
        k460 k460Var;
        boolean z2;
        if (continuationImpl instanceof NeuroPostcardMapper$map$1) {
            neuroPostcardMapper$map$1 = (NeuroPostcardMapper$map$1) continuationImpl;
            int i2 = neuroPostcardMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                neuroPostcardMapper$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = neuroPostcardMapper$map$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = neuroPostcardMapper$map$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    f460 f460Var = p460Var.a;
                    neuroPostcardMapper$map$1.L$0 = p460Var;
                    neuroPostcardMapper$map$1.Z$0 = z;
                    neuroPostcardMapper$map$1.label = 1;
                    obj2 = i(f460Var, neuroPostcardMapper$map$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z2 = neuroPostcardMapper$map$1.Z$0;
                        k460Var = (k460) neuroPostcardMapper$map$1.L$1;
                        kotlin.b.b(obj2);
                        return new s360(k460Var, (d360) obj2, z2);
                    }
                    z = neuroPostcardMapper$map$1.Z$0;
                    p460Var = (p460) neuroPostcardMapper$map$1.L$0;
                    kotlin.b.b(obj2);
                }
                k460 k460Var2 = (k460) obj2;
                neuroPostcardMapper$map$1.L$0 = null;
                neuroPostcardMapper$map$1.L$1 = k460Var2;
                neuroPostcardMapper$map$1.Z$0 = z;
                neuroPostcardMapper$map$1.label = 2;
                e = e(p460Var, neuroPostcardMapper$map$1);
                if (e != obj) {
                    k460Var = k460Var2;
                    obj2 = e;
                    z2 = z;
                    return new s360(k460Var, (d360) obj2, z2);
                }
                return obj;
            }
        }
        neuroPostcardMapper$map$1 = new NeuroPostcardMapper$map$1(this, continuationImpl);
        Object obj22 = neuroPostcardMapper$map$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = neuroPostcardMapper$map$1.label;
        if (i != 0) {
        }
        k460 k460Var22 = (k460) obj22;
        neuroPostcardMapper$map$1.L$0 = null;
        neuroPostcardMapper$map$1.L$1 = k460Var22;
        neuroPostcardMapper$map$1.Z$0 = z;
        neuroPostcardMapper$map$1.label = 2;
        e = e(p460Var, neuroPostcardMapper$map$1);
        if (e != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r8 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        if (r8 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(s260 s260Var, ContinuationImpl continuationImpl) {
        NeuroPostcardMapper$mapAction$1 neuroPostcardMapper$mapAction$1;
        int i;
        if (continuationImpl instanceof NeuroPostcardMapper$mapAction$1) {
            neuroPostcardMapper$mapAction$1 = (NeuroPostcardMapper$mapAction$1) continuationImpl;
            int i2 = neuroPostcardMapper$mapAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                neuroPostcardMapper$mapAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = neuroPostcardMapper$mapAction$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = neuroPostcardMapper$mapAction$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return new v260((u460) obj);
                    }
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return new t260((u460) obj);
                }
                kotlin.b.b(obj);
                if (s260Var instanceof o260) {
                    r460 r460Var = ((o260) s260Var).a;
                    neuroPostcardMapper$mapAction$1.L$0 = null;
                    neuroPostcardMapper$mapAction$1.label = 1;
                    obj = h("open_prompt", r460Var, neuroPostcardMapper$mapAction$1);
                } else {
                    if (s260Var instanceof p260) {
                        return w260.a;
                    }
                    if (s260Var instanceof n260) {
                        return u260.a;
                    }
                    if (!(s260Var instanceof m260)) {
                        if (s260Var instanceof q260) {
                            return x260.a;
                        }
                        if ((s260Var instanceof r260) || s260Var == null) {
                            return null;
                        }
                        w511.b();
                        return null;
                    }
                    r460 r460Var2 = ((m260) s260Var).a;
                    neuroPostcardMapper$mapAction$1.L$0 = null;
                    neuroPostcardMapper$mapAction$1.label = 2;
                    obj = h("add_signature", r460Var2, neuroPostcardMapper$mapAction$1);
                }
                return obj2;
            }
        }
        neuroPostcardMapper$mapAction$1 = new NeuroPostcardMapper$mapAction$1(this, continuationImpl);
        Object obj3 = neuroPostcardMapper$mapAction$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = neuroPostcardMapper$mapAction$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0074, code lost:
    
        if (r15 == r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(z260 z260Var, ContinuationImpl continuationImpl) {
        NeuroPostcardMapper$mapButton$1 neuroPostcardMapper$mapButton$1;
        int i;
        FormattedText formattedText;
        CharSequence charSequence;
        CharSequence charSequence2;
        z260 z260Var2;
        CharSequence charSequence3;
        int i2;
        NeuroPostcardButtonModel$ButtonStyleModel neuroPostcardButtonModel$ButtonStyleModel;
        int i3;
        NeuroPostcardButtonModel$ButtonSizeModel neuroPostcardButtonModel$ButtonSizeModel;
        Object c;
        z260 z260Var3;
        CharSequence charSequence4;
        NeuroPostcardButtonModel$ButtonSizeModel neuroPostcardButtonModel$ButtonSizeModel2;
        NeuroPostcardButtonModel$ButtonStyleModel neuroPostcardButtonModel$ButtonStyleModel2;
        if (continuationImpl instanceof NeuroPostcardMapper$mapButton$1) {
            neuroPostcardMapper$mapButton$1 = (NeuroPostcardMapper$mapButton$1) continuationImpl;
            int i4 = neuroPostcardMapper$mapButton$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                neuroPostcardMapper$mapButton$1.label = i4 - Integer.MIN_VALUE;
                Object obj = neuroPostcardMapper$mapButton$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = neuroPostcardMapper$mapButton$1.label;
                q8s q8sVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText2 = z260Var.a;
                    neuroPostcardMapper$mapButton$1.L$0 = z260Var;
                    neuroPostcardMapper$mapButton$1.label = 1;
                    obj = q8sVar.a(formattedText2, neuroPostcardMapper$mapButton$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            NeuroPostcardButtonModel$ButtonSizeModel neuroPostcardButtonModel$ButtonSizeModel3 = (NeuroPostcardButtonModel$ButtonSizeModel) neuroPostcardMapper$mapButton$1.L$4;
                            NeuroPostcardButtonModel$ButtonStyleModel neuroPostcardButtonModel$ButtonStyleModel3 = (NeuroPostcardButtonModel$ButtonStyleModel) neuroPostcardMapper$mapButton$1.L$3;
                            CharSequence charSequence5 = (CharSequence) neuroPostcardMapper$mapButton$1.L$2;
                            charSequence = (CharSequence) neuroPostcardMapper$mapButton$1.L$1;
                            z260Var3 = (z260) neuroPostcardMapper$mapButton$1.L$0;
                            kotlin.b.b(obj);
                            neuroPostcardButtonModel$ButtonSizeModel2 = neuroPostcardButtonModel$ButtonSizeModel3;
                            neuroPostcardButtonModel$ButtonStyleModel2 = neuroPostcardButtonModel$ButtonStyleModel3;
                            charSequence4 = charSequence5;
                            return new a360(charSequence, charSequence4, neuroPostcardButtonModel$ButtonStyleModel2, neuroPostcardButtonModel$ButtonSizeModel2, (y260) obj, z260Var3.f);
                        }
                        charSequence3 = (CharSequence) neuroPostcardMapper$mapButton$1.L$2;
                        z260Var2 = (z260) neuroPostcardMapper$mapButton$1.L$0;
                        kotlin.b.b(obj);
                        charSequence2 = (CharSequence) obj;
                        z260 z260Var4 = z260Var2;
                        charSequence = charSequence3;
                        z260Var = z260Var4;
                        i2 = p360.a[z260Var.c.ordinal()];
                        if (i2 == 1) {
                            neuroPostcardButtonModel$ButtonStyleModel = NeuroPostcardButtonModel$ButtonStyleModel.MAIN;
                        } else if (i2 == 2) {
                            neuroPostcardButtonModel$ButtonStyleModel = NeuroPostcardButtonModel$ButtonStyleModel.FLOATING;
                        } else {
                            if (i2 != 3) {
                                w511.b();
                                return null;
                            }
                            neuroPostcardButtonModel$ButtonStyleModel = NeuroPostcardButtonModel$ButtonStyleModel.MINOR;
                        }
                        i3 = p360.b[z260Var.d.ordinal()];
                        if (i3 == 1) {
                            neuroPostcardButtonModel$ButtonSizeModel = NeuroPostcardButtonModel$ButtonSizeModel.S;
                        } else if (i3 == 2) {
                            neuroPostcardButtonModel$ButtonSizeModel = NeuroPostcardButtonModel$ButtonSizeModel.M;
                        } else {
                            if (i3 != 3) {
                                w511.b();
                                return null;
                            }
                            neuroPostcardButtonModel$ButtonSizeModel = NeuroPostcardButtonModel$ButtonSizeModel.L;
                        }
                        s260 s260Var = z260Var.e;
                        neuroPostcardMapper$mapButton$1.L$0 = z260Var;
                        neuroPostcardMapper$mapButton$1.L$1 = charSequence;
                        neuroPostcardMapper$mapButton$1.L$2 = charSequence2;
                        neuroPostcardMapper$mapButton$1.L$3 = neuroPostcardButtonModel$ButtonStyleModel;
                        neuroPostcardMapper$mapButton$1.L$4 = neuroPostcardButtonModel$ButtonSizeModel;
                        neuroPostcardMapper$mapButton$1.label = 3;
                        c = c(s260Var, neuroPostcardMapper$mapButton$1);
                        if (c != obj2) {
                            z260Var3 = z260Var;
                            charSequence4 = charSequence2;
                            neuroPostcardButtonModel$ButtonSizeModel2 = neuroPostcardButtonModel$ButtonSizeModel;
                            neuroPostcardButtonModel$ButtonStyleModel2 = neuroPostcardButtonModel$ButtonStyleModel;
                            obj = c;
                            return new a360(charSequence, charSequence4, neuroPostcardButtonModel$ButtonStyleModel2, neuroPostcardButtonModel$ButtonSizeModel2, (y260) obj, z260Var3.f);
                        }
                        return obj2;
                    }
                    z260Var = (z260) neuroPostcardMapper$mapButton$1.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence6 = (CharSequence) obj;
                formattedText = z260Var.b;
                if (formattedText != null) {
                    charSequence = charSequence6;
                    charSequence2 = null;
                    i2 = p360.a[z260Var.c.ordinal()];
                    if (i2 == 1) {
                    }
                    i3 = p360.b[z260Var.d.ordinal()];
                    if (i3 == 1) {
                    }
                    s260 s260Var2 = z260Var.e;
                    neuroPostcardMapper$mapButton$1.L$0 = z260Var;
                    neuroPostcardMapper$mapButton$1.L$1 = charSequence;
                    neuroPostcardMapper$mapButton$1.L$2 = charSequence2;
                    neuroPostcardMapper$mapButton$1.L$3 = neuroPostcardButtonModel$ButtonStyleModel;
                    neuroPostcardMapper$mapButton$1.L$4 = neuroPostcardButtonModel$ButtonSizeModel;
                    neuroPostcardMapper$mapButton$1.label = 3;
                    c = c(s260Var2, neuroPostcardMapper$mapButton$1);
                    if (c != obj2) {
                    }
                    return obj2;
                }
                neuroPostcardMapper$mapButton$1.L$0 = z260Var;
                neuroPostcardMapper$mapButton$1.L$1 = null;
                neuroPostcardMapper$mapButton$1.L$2 = charSequence6;
                neuroPostcardMapper$mapButton$1.I$0 = 0;
                neuroPostcardMapper$mapButton$1.label = 2;
                Object a = q8sVar.a(formattedText, neuroPostcardMapper$mapButton$1);
                if (a != obj2) {
                    z260Var2 = z260Var;
                    charSequence3 = charSequence6;
                    obj = a;
                    charSequence2 = (CharSequence) obj;
                    z260 z260Var42 = z260Var2;
                    charSequence = charSequence3;
                    z260Var = z260Var42;
                    i2 = p360.a[z260Var.c.ordinal()];
                    if (i2 == 1) {
                    }
                    i3 = p360.b[z260Var.d.ordinal()];
                    if (i3 == 1) {
                    }
                    s260 s260Var22 = z260Var.e;
                    neuroPostcardMapper$mapButton$1.L$0 = z260Var;
                    neuroPostcardMapper$mapButton$1.L$1 = charSequence;
                    neuroPostcardMapper$mapButton$1.L$2 = charSequence2;
                    neuroPostcardMapper$mapButton$1.L$3 = neuroPostcardButtonModel$ButtonStyleModel;
                    neuroPostcardMapper$mapButton$1.L$4 = neuroPostcardButtonModel$ButtonSizeModel;
                    neuroPostcardMapper$mapButton$1.label = 3;
                    c = c(s260Var22, neuroPostcardMapper$mapButton$1);
                    if (c != obj2) {
                    }
                }
                return obj2;
            }
        }
        neuroPostcardMapper$mapButton$1 = new NeuroPostcardMapper$mapButton$1(this, continuationImpl);
        Object obj3 = neuroPostcardMapper$mapButton$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = neuroPostcardMapper$mapButton$1.label;
        q8s q8sVar2 = this.b;
        if (i != 0) {
        }
        CharSequence charSequence62 = (CharSequence) obj3;
        formattedText = z260Var.b;
        if (formattedText != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x012f, code lost:
    
        if (r2 == r4) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x01b2 -> B:20:0x01b3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(p460 p460Var, ContinuationImpl continuationImpl) {
        NeuroPostcardMapper$mapCommonParams$1 neuroPostcardMapper$mapCommonParams$1;
        int i;
        f360 f360Var;
        CharSequence charSequence;
        f360 f360Var2;
        FormattedText formattedText;
        f360 f360Var3;
        CharSequence charSequence2;
        CharSequence charSequence3;
        p460 p460Var2;
        CharSequence charSequence4;
        List list;
        CharSequence charSequence5;
        CharSequence charSequence6;
        f360 f360Var4;
        Iterator it;
        Collection collection;
        int i2;
        p460 p460Var3;
        int i3;
        List list2;
        p460 p460Var4;
        NeuroPostcardMapper$mapCommonParams$1 neuroPostcardMapper$mapCommonParams$12;
        CharSequence charSequence7;
        CharSequence charSequence8;
        List list3;
        f360 f360Var5;
        p460 p460Var5 = p460Var;
        if (continuationImpl instanceof NeuroPostcardMapper$mapCommonParams$1) {
            neuroPostcardMapper$mapCommonParams$1 = (NeuroPostcardMapper$mapCommonParams$1) continuationImpl;
            int i4 = neuroPostcardMapper$mapCommonParams$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                neuroPostcardMapper$mapCommonParams$1.label = i4 - Integer.MIN_VALUE;
                Object obj = neuroPostcardMapper$mapCommonParams$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = neuroPostcardMapper$mapCommonParams$1.label;
                q8s q8sVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    o460 o460Var = p460Var5.b;
                    if (o460Var instanceof m460) {
                        e360 e360Var = ((m460) o460Var).a;
                        f360Var = new f360(new lvi0(a(e360Var.a), null, null, null, null, 62), e360Var.b, e360Var.c, e360Var.d, this.e.b.d(e360Var.e));
                    } else if (o460Var instanceof l460) {
                        f360Var = new f360(new uvi0(((l460) o460Var).a.a), r2.b, r2.c, null, null);
                    } else {
                        if (!(o460Var instanceof n460) && o460Var != null) {
                            w511.b();
                            return null;
                        }
                        f360Var = null;
                    }
                    FormattedText formattedText2 = p460Var5.c;
                    if (formattedText2 == null) {
                        charSequence = null;
                        f360Var2 = f360Var;
                        formattedText = p460Var5.d;
                        if (formattedText == null) {
                            f360Var3 = f360Var2;
                            charSequence2 = charSequence;
                            charSequence3 = null;
                            list = p460Var5.e;
                            if (list != null) {
                            }
                            NeuroPostcardMapper$mapCommonParams$1 neuroPostcardMapper$mapCommonParams$13 = neuroPostcardMapper$mapCommonParams$1;
                            p460Var4 = p460Var5;
                            charSequence7 = charSequence3;
                            neuroPostcardMapper$mapCommonParams$12 = neuroPostcardMapper$mapCommonParams$13;
                            f360Var4 = f360Var3;
                            list2 = EmptyList.a;
                            s260 s260Var = p460Var4.f;
                            neuroPostcardMapper$mapCommonParams$12.L$0 = p460Var4;
                            neuroPostcardMapper$mapCommonParams$12.L$1 = f360Var4;
                            neuroPostcardMapper$mapCommonParams$12.L$2 = charSequence2;
                            neuroPostcardMapper$mapCommonParams$12.L$3 = charSequence7;
                            neuroPostcardMapper$mapCommonParams$12.L$4 = list2;
                            neuroPostcardMapper$mapCommonParams$12.L$5 = null;
                            neuroPostcardMapper$mapCommonParams$12.L$6 = null;
                            neuroPostcardMapper$mapCommonParams$12.L$7 = null;
                            neuroPostcardMapper$mapCommonParams$12.L$8 = null;
                            neuroPostcardMapper$mapCommonParams$12.L$9 = null;
                            neuroPostcardMapper$mapCommonParams$12.L$10 = null;
                            neuroPostcardMapper$mapCommonParams$12.label = 4;
                            obj = c(s260Var, neuroPostcardMapper$mapCommonParams$12);
                            if (obj != obj2) {
                            }
                            return obj2;
                        }
                        neuroPostcardMapper$mapCommonParams$1.L$0 = p460Var5;
                        neuroPostcardMapper$mapCommonParams$1.L$1 = null;
                        neuroPostcardMapper$mapCommonParams$1.L$2 = f360Var2;
                        neuroPostcardMapper$mapCommonParams$1.L$3 = charSequence;
                        neuroPostcardMapper$mapCommonParams$1.I$0 = 0;
                        neuroPostcardMapper$mapCommonParams$1.label = 2;
                        Object a = q8sVar.a(formattedText, neuroPostcardMapper$mapCommonParams$1);
                        if (a != obj2) {
                            p460Var2 = p460Var5;
                            charSequence4 = charSequence;
                            obj = a;
                            charSequence3 = (CharSequence) obj;
                            f360 f360Var6 = f360Var2;
                            charSequence2 = charSequence4;
                            p460Var5 = p460Var2;
                            f360Var3 = f360Var6;
                            list = p460Var5.e;
                            if (list != null) {
                            }
                            NeuroPostcardMapper$mapCommonParams$1 neuroPostcardMapper$mapCommonParams$132 = neuroPostcardMapper$mapCommonParams$1;
                            p460Var4 = p460Var5;
                            charSequence7 = charSequence3;
                            neuroPostcardMapper$mapCommonParams$12 = neuroPostcardMapper$mapCommonParams$132;
                            f360Var4 = f360Var3;
                            list2 = EmptyList.a;
                            s260 s260Var2 = p460Var4.f;
                            neuroPostcardMapper$mapCommonParams$12.L$0 = p460Var4;
                            neuroPostcardMapper$mapCommonParams$12.L$1 = f360Var4;
                            neuroPostcardMapper$mapCommonParams$12.L$2 = charSequence2;
                            neuroPostcardMapper$mapCommonParams$12.L$3 = charSequence7;
                            neuroPostcardMapper$mapCommonParams$12.L$4 = list2;
                            neuroPostcardMapper$mapCommonParams$12.L$5 = null;
                            neuroPostcardMapper$mapCommonParams$12.L$6 = null;
                            neuroPostcardMapper$mapCommonParams$12.L$7 = null;
                            neuroPostcardMapper$mapCommonParams$12.L$8 = null;
                            neuroPostcardMapper$mapCommonParams$12.L$9 = null;
                            neuroPostcardMapper$mapCommonParams$12.L$10 = null;
                            neuroPostcardMapper$mapCommonParams$12.label = 4;
                            obj = c(s260Var2, neuroPostcardMapper$mapCommonParams$12);
                            if (obj != obj2) {
                            }
                        }
                        return obj2;
                    }
                    neuroPostcardMapper$mapCommonParams$1.L$0 = p460Var5;
                    neuroPostcardMapper$mapCommonParams$1.L$1 = null;
                    neuroPostcardMapper$mapCommonParams$1.L$2 = f360Var;
                    neuroPostcardMapper$mapCommonParams$1.I$0 = 0;
                    neuroPostcardMapper$mapCommonParams$1.label = 1;
                    obj = q8sVar.a(formattedText2, neuroPostcardMapper$mapCommonParams$1);
                } else if (i == 1) {
                    f360 f360Var7 = (f360) neuroPostcardMapper$mapCommonParams$1.L$2;
                    p460 p460Var6 = (p460) neuroPostcardMapper$mapCommonParams$1.L$0;
                    kotlin.b.b(obj);
                    f360Var = f360Var7;
                    p460Var5 = p460Var6;
                } else {
                    if (i == 2) {
                        charSequence4 = (CharSequence) neuroPostcardMapper$mapCommonParams$1.L$3;
                        f360Var2 = (f360) neuroPostcardMapper$mapCommonParams$1.L$2;
                        p460Var2 = (p460) neuroPostcardMapper$mapCommonParams$1.L$0;
                        kotlin.b.b(obj);
                        charSequence3 = (CharSequence) obj;
                        f360 f360Var62 = f360Var2;
                        charSequence2 = charSequence4;
                        p460Var5 = p460Var2;
                        f360Var3 = f360Var62;
                        list = p460Var5.e;
                        if (list != null) {
                            List list4 = list;
                            ArrayList arrayList = new ArrayList(tcc.n(list4, 10));
                            charSequence5 = charSequence3;
                            charSequence6 = charSequence2;
                            f360Var4 = f360Var3;
                            it = list4.iterator();
                            collection = arrayList;
                            i2 = 0;
                            p460Var3 = p460Var5;
                            i3 = 0;
                            if (it.hasNext()) {
                            }
                        }
                        NeuroPostcardMapper$mapCommonParams$1 neuroPostcardMapper$mapCommonParams$1322 = neuroPostcardMapper$mapCommonParams$1;
                        p460Var4 = p460Var5;
                        charSequence7 = charSequence3;
                        neuroPostcardMapper$mapCommonParams$12 = neuroPostcardMapper$mapCommonParams$1322;
                        f360Var4 = f360Var3;
                        list2 = EmptyList.a;
                        s260 s260Var22 = p460Var4.f;
                        neuroPostcardMapper$mapCommonParams$12.L$0 = p460Var4;
                        neuroPostcardMapper$mapCommonParams$12.L$1 = f360Var4;
                        neuroPostcardMapper$mapCommonParams$12.L$2 = charSequence2;
                        neuroPostcardMapper$mapCommonParams$12.L$3 = charSequence7;
                        neuroPostcardMapper$mapCommonParams$12.L$4 = list2;
                        neuroPostcardMapper$mapCommonParams$12.L$5 = null;
                        neuroPostcardMapper$mapCommonParams$12.L$6 = null;
                        neuroPostcardMapper$mapCommonParams$12.L$7 = null;
                        neuroPostcardMapper$mapCommonParams$12.L$8 = null;
                        neuroPostcardMapper$mapCommonParams$12.L$9 = null;
                        neuroPostcardMapper$mapCommonParams$12.L$10 = null;
                        neuroPostcardMapper$mapCommonParams$12.label = 4;
                        obj = c(s260Var22, neuroPostcardMapper$mapCommonParams$12);
                        if (obj != obj2) {
                        }
                        return obj2;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list5 = (List) neuroPostcardMapper$mapCommonParams$1.L$4;
                        charSequence7 = (CharSequence) neuroPostcardMapper$mapCommonParams$1.L$3;
                        CharSequence charSequence9 = (CharSequence) neuroPostcardMapper$mapCommonParams$1.L$2;
                        f360 f360Var8 = (f360) neuroPostcardMapper$mapCommonParams$1.L$1;
                        p460Var4 = (p460) neuroPostcardMapper$mapCommonParams$1.L$0;
                        kotlin.b.b(obj);
                        list3 = list5;
                        charSequence8 = charSequence9;
                        f360Var5 = f360Var8;
                        return new d360(f360Var5, charSequence8, charSequence7, list3, (y260) obj, p460Var4.g);
                    }
                    i3 = neuroPostcardMapper$mapCommonParams$1.I$1;
                    i2 = neuroPostcardMapper$mapCommonParams$1.I$0;
                    collection = (Collection) neuroPostcardMapper$mapCommonParams$1.L$10;
                    charSequence5 = (CharSequence) neuroPostcardMapper$mapCommonParams$1.L$9;
                    charSequence6 = (CharSequence) neuroPostcardMapper$mapCommonParams$1.L$8;
                    f360Var4 = (f360) neuroPostcardMapper$mapCommonParams$1.L$7;
                    it = (Iterator) neuroPostcardMapper$mapCommonParams$1.L$4;
                    Collection collection2 = (Collection) neuroPostcardMapper$mapCommonParams$1.L$3;
                    p460Var3 = (p460) neuroPostcardMapper$mapCommonParams$1.L$0;
                    kotlin.b.b(obj);
                    collection.add((a360) obj);
                    collection = collection2;
                    if (it.hasNext()) {
                        z260 z260Var = (z260) it.next();
                        neuroPostcardMapper$mapCommonParams$1.L$0 = p460Var3;
                        neuroPostcardMapper$mapCommonParams$1.L$1 = null;
                        neuroPostcardMapper$mapCommonParams$1.L$2 = null;
                        neuroPostcardMapper$mapCommonParams$1.L$3 = collection;
                        neuroPostcardMapper$mapCommonParams$1.L$4 = it;
                        neuroPostcardMapper$mapCommonParams$1.L$5 = null;
                        neuroPostcardMapper$mapCommonParams$1.L$6 = null;
                        neuroPostcardMapper$mapCommonParams$1.L$7 = f360Var4;
                        neuroPostcardMapper$mapCommonParams$1.L$8 = charSequence6;
                        neuroPostcardMapper$mapCommonParams$1.L$9 = charSequence5;
                        neuroPostcardMapper$mapCommonParams$1.L$10 = collection;
                        neuroPostcardMapper$mapCommonParams$1.I$0 = i2;
                        neuroPostcardMapper$mapCommonParams$1.I$1 = i3;
                        neuroPostcardMapper$mapCommonParams$1.I$2 = 0;
                        neuroPostcardMapper$mapCommonParams$1.label = 3;
                        obj = d(z260Var, neuroPostcardMapper$mapCommonParams$1);
                        if (obj != obj2) {
                            collection2 = collection;
                            collection.add((a360) obj);
                            collection = collection2;
                            if (it.hasNext()) {
                                list2 = (List) collection;
                                if (list2 == null) {
                                    p460Var5 = p460Var3;
                                    charSequence3 = charSequence5;
                                    charSequence2 = charSequence6;
                                    f360Var3 = f360Var4;
                                    NeuroPostcardMapper$mapCommonParams$1 neuroPostcardMapper$mapCommonParams$13222 = neuroPostcardMapper$mapCommonParams$1;
                                    p460Var4 = p460Var5;
                                    charSequence7 = charSequence3;
                                    neuroPostcardMapper$mapCommonParams$12 = neuroPostcardMapper$mapCommonParams$13222;
                                    f360Var4 = f360Var3;
                                    list2 = EmptyList.a;
                                    s260 s260Var222 = p460Var4.f;
                                    neuroPostcardMapper$mapCommonParams$12.L$0 = p460Var4;
                                    neuroPostcardMapper$mapCommonParams$12.L$1 = f360Var4;
                                    neuroPostcardMapper$mapCommonParams$12.L$2 = charSequence2;
                                    neuroPostcardMapper$mapCommonParams$12.L$3 = charSequence7;
                                    neuroPostcardMapper$mapCommonParams$12.L$4 = list2;
                                    neuroPostcardMapper$mapCommonParams$12.L$5 = null;
                                    neuroPostcardMapper$mapCommonParams$12.L$6 = null;
                                    neuroPostcardMapper$mapCommonParams$12.L$7 = null;
                                    neuroPostcardMapper$mapCommonParams$12.L$8 = null;
                                    neuroPostcardMapper$mapCommonParams$12.L$9 = null;
                                    neuroPostcardMapper$mapCommonParams$12.L$10 = null;
                                    neuroPostcardMapper$mapCommonParams$12.label = 4;
                                    obj = c(s260Var222, neuroPostcardMapper$mapCommonParams$12);
                                    if (obj != obj2) {
                                        charSequence8 = charSequence2;
                                        list3 = list2;
                                        f360Var5 = f360Var4;
                                        return new d360(f360Var5, charSequence8, charSequence7, list3, (y260) obj, p460Var4.g);
                                    }
                                } else {
                                    neuroPostcardMapper$mapCommonParams$12 = neuroPostcardMapper$mapCommonParams$1;
                                    p460Var4 = p460Var3;
                                    charSequence7 = charSequence5;
                                    charSequence2 = charSequence6;
                                    s260 s260Var2222 = p460Var4.f;
                                    neuroPostcardMapper$mapCommonParams$12.L$0 = p460Var4;
                                    neuroPostcardMapper$mapCommonParams$12.L$1 = f360Var4;
                                    neuroPostcardMapper$mapCommonParams$12.L$2 = charSequence2;
                                    neuroPostcardMapper$mapCommonParams$12.L$3 = charSequence7;
                                    neuroPostcardMapper$mapCommonParams$12.L$4 = list2;
                                    neuroPostcardMapper$mapCommonParams$12.L$5 = null;
                                    neuroPostcardMapper$mapCommonParams$12.L$6 = null;
                                    neuroPostcardMapper$mapCommonParams$12.L$7 = null;
                                    neuroPostcardMapper$mapCommonParams$12.L$8 = null;
                                    neuroPostcardMapper$mapCommonParams$12.L$9 = null;
                                    neuroPostcardMapper$mapCommonParams$12.L$10 = null;
                                    neuroPostcardMapper$mapCommonParams$12.label = 4;
                                    obj = c(s260Var2222, neuroPostcardMapper$mapCommonParams$12);
                                    if (obj != obj2) {
                                    }
                                }
                            }
                        }
                        return obj2;
                    }
                }
                charSequence = (CharSequence) obj;
                f360Var2 = f360Var;
                formattedText = p460Var5.d;
                if (formattedText == null) {
                }
            }
        }
        neuroPostcardMapper$mapCommonParams$1 = new NeuroPostcardMapper$mapCommonParams$1(this, continuationImpl);
        Object obj3 = neuroPostcardMapper$mapCommonParams$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = neuroPostcardMapper$mapCommonParams$1.label;
        q8s q8sVar2 = this.b;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj3;
        f360Var2 = f360Var;
        formattedText = p460Var5.d;
        if (formattedText == null) {
        }
    }

    public final f360 f(e360 e360Var) {
        return new f360(new lvi0(a(e360Var.a), null, null, null, null, 62), e360Var.b, e360Var.c, e360Var.d, this.e.b.d(e360Var.e));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(h360 h360Var, ContinuationImpl continuationImpl) {
        NeuroPostcardMapper$mapLabels$1 neuroPostcardMapper$mapLabels$1;
        int i;
        f360 f;
        f360 f360Var;
        if (continuationImpl instanceof NeuroPostcardMapper$mapLabels$1) {
            neuroPostcardMapper$mapLabels$1 = (NeuroPostcardMapper$mapLabels$1) continuationImpl;
            int i2 = neuroPostcardMapper$mapLabels$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                neuroPostcardMapper$mapLabels$1.label = i2 - Integer.MIN_VALUE;
                Object obj = neuroPostcardMapper$mapLabels$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = neuroPostcardMapper$mapLabels$1.label;
                CharSequence charSequence = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e360 e360Var = h360Var.a;
                    f = e360Var != null ? f(e360Var) : null;
                    FormattedText formattedText = h360Var.b;
                    if (formattedText != null) {
                        neuroPostcardMapper$mapLabels$1.L$0 = null;
                        neuroPostcardMapper$mapLabels$1.L$1 = null;
                        neuroPostcardMapper$mapLabels$1.L$2 = f;
                        neuroPostcardMapper$mapLabels$1.I$0 = 0;
                        neuroPostcardMapper$mapLabels$1.label = 1;
                        Object a = this.b.a(formattedText, neuroPostcardMapper$mapLabels$1);
                        if (a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        f360 f360Var2 = f;
                        obj = a;
                        f360Var = f360Var2;
                    }
                    return new i360(f, charSequence);
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f360Var = (f360) neuroPostcardMapper$mapLabels$1.L$2;
                kotlin.b.b(obj);
                charSequence = (CharSequence) obj;
                f = f360Var;
                return new i360(f, charSequence);
            }
        }
        neuroPostcardMapper$mapLabels$1 = new NeuroPostcardMapper$mapLabels$1(this, continuationImpl);
        Object obj2 = neuroPostcardMapper$mapLabels$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = neuroPostcardMapper$mapLabels$1.label;
        CharSequence charSequence2 = null;
        if (i != 0) {
        }
        charSequence2 = (CharSequence) obj2;
        f = f360Var;
        return new i360(f, charSequence2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0211 -> B:25:0x0221). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, r460 r460Var, ContinuationImpl continuationImpl) {
        NeuroPostcardMapper$mapNeuroTextInput$1 neuroPostcardMapper$mapNeuroTextInput$1;
        int i;
        String str2;
        f360 f360Var;
        FormattedText formattedText;
        r460 r460Var2;
        String str3;
        f360 f360Var2;
        CharSequence charSequence;
        CharSequence charSequence2;
        r460 r460Var3;
        CharSequence charSequence3;
        String str4;
        FormattedText formattedText2;
        CharSequence charSequence4;
        CharSequence charSequence5;
        List list;
        String str5;
        List list2;
        Collection arrayList;
        Iterator it;
        CharSequence charSequence6;
        CharSequence charSequence7;
        String str6;
        Integer num;
        int i2;
        r460 r460Var4;
        f360 f360Var3;
        CharSequence charSequence8;
        int i3;
        String str7;
        List list3;
        ArrayList arrayList2;
        Object a;
        CharSequence charSequence9;
        List list4;
        f360 f360Var4;
        Integer num2;
        CharSequence charSequence10;
        List list5;
        String str8;
        r460 r460Var5;
        CharSequence charSequence11;
        CharSequence charSequence12;
        r460 r460Var6;
        CharSequence charSequence13;
        f360 f360Var5;
        Integer num3;
        CharSequence charSequence14;
        Iterator it2;
        int i4;
        Collection collection;
        NeuroPostcardMapper$mapNeuroTextInput$1 neuroPostcardMapper$mapNeuroTextInput$12;
        int i5;
        CharSequence charSequence15;
        FormattedText formattedText3;
        CharSequence charSequence16;
        String str9;
        CharSequence charSequence17;
        r460 r460Var7;
        f360 f360Var6;
        String str10;
        CharSequence charSequence18;
        String str11;
        f360 f360Var7;
        String str12;
        r460 r460Var8 = r460Var;
        if (continuationImpl instanceof NeuroPostcardMapper$mapNeuroTextInput$1) {
            neuroPostcardMapper$mapNeuroTextInput$1 = (NeuroPostcardMapper$mapNeuroTextInput$1) continuationImpl;
            int i6 = neuroPostcardMapper$mapNeuroTextInput$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                neuroPostcardMapper$mapNeuroTextInput$1.label = i6 - Integer.MIN_VALUE;
                Object obj = neuroPostcardMapper$mapNeuroTextInput$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = neuroPostcardMapper$mapNeuroTextInput$1.label;
                q8s q8sVar = this.b;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj);
                        e360 e360Var = r460Var8.a;
                        f360 f = e360Var != null ? f(e360Var) : null;
                        FormattedText formattedText4 = r460Var8.b;
                        str2 = str;
                        neuroPostcardMapper$mapNeuroTextInput$1.L$0 = str2;
                        neuroPostcardMapper$mapNeuroTextInput$1.L$1 = r460Var8;
                        neuroPostcardMapper$mapNeuroTextInput$1.L$2 = f;
                        neuroPostcardMapper$mapNeuroTextInput$1.label = 1;
                        Object a2 = q8sVar.a(formattedText4, neuroPostcardMapper$mapNeuroTextInput$1);
                        if (a2 != obj2) {
                            f360Var = f;
                            obj = a2;
                            CharSequence charSequence19 = (CharSequence) obj;
                            formattedText = r460Var8.c;
                            if (formattedText == null) {
                                neuroPostcardMapper$mapNeuroTextInput$1.L$0 = str2;
                                neuroPostcardMapper$mapNeuroTextInput$1.L$1 = r460Var8;
                                neuroPostcardMapper$mapNeuroTextInput$1.L$2 = f360Var;
                                neuroPostcardMapper$mapNeuroTextInput$1.L$3 = charSequence19;
                                neuroPostcardMapper$mapNeuroTextInput$1.L$4 = null;
                                neuroPostcardMapper$mapNeuroTextInput$1.I$0 = 0;
                                neuroPostcardMapper$mapNeuroTextInput$1.label = 2;
                                Object a3 = q8sVar.a(formattedText, neuroPostcardMapper$mapNeuroTextInput$1);
                                if (a3 != obj2) {
                                    String str13 = str2;
                                    r460Var3 = r460Var8;
                                    charSequence3 = charSequence19;
                                    obj = a3;
                                    str4 = str13;
                                    charSequence2 = (CharSequence) obj;
                                    str3 = str4;
                                    r460Var2 = r460Var3;
                                    f360Var2 = f360Var;
                                    charSequence = charSequence3;
                                    formattedText2 = r460Var2.d;
                                    if (formattedText2 != null) {
                                        neuroPostcardMapper$mapNeuroTextInput$1.L$0 = str3;
                                        neuroPostcardMapper$mapNeuroTextInput$1.L$1 = r460Var2;
                                        neuroPostcardMapper$mapNeuroTextInput$1.L$2 = f360Var2;
                                        neuroPostcardMapper$mapNeuroTextInput$1.L$3 = charSequence;
                                        neuroPostcardMapper$mapNeuroTextInput$1.L$4 = charSequence2;
                                        neuroPostcardMapper$mapNeuroTextInput$1.L$5 = null;
                                        neuroPostcardMapper$mapNeuroTextInput$1.I$0 = 0;
                                        neuroPostcardMapper$mapNeuroTextInput$1.label = 3;
                                        Object a4 = q8sVar.a(formattedText2, neuroPostcardMapper$mapNeuroTextInput$1);
                                        if (a4 != obj2) {
                                            CharSequence charSequence20 = charSequence2;
                                            obj = a4;
                                            charSequence5 = charSequence20;
                                            CharSequence charSequence21 = (CharSequence) obj;
                                            charSequence2 = charSequence5;
                                            charSequence4 = charSequence21;
                                            Integer num4 = r460Var2.e;
                                            list = r460Var2.f;
                                            if (list != null) {
                                                List list6 = list;
                                                arrayList = new ArrayList(tcc.n(list6, 10));
                                                it = list6.iterator();
                                                charSequence6 = charSequence4;
                                                charSequence7 = charSequence2;
                                                str6 = str3;
                                                num = num4;
                                                i2 = 0;
                                                r460Var4 = r460Var2;
                                                f360Var3 = f360Var2;
                                                charSequence8 = charSequence;
                                                i3 = 0;
                                                Collection collection2 = arrayList;
                                                if (it.hasNext()) {
                                                    v460 v460Var = (v460) it.next();
                                                    neuroPostcardMapper$mapNeuroTextInput$1.L$0 = str6;
                                                    neuroPostcardMapper$mapNeuroTextInput$1.L$1 = r460Var4;
                                                    neuroPostcardMapper$mapNeuroTextInput$1.L$2 = f360Var3;
                                                    neuroPostcardMapper$mapNeuroTextInput$1.L$3 = charSequence8;
                                                    neuroPostcardMapper$mapNeuroTextInput$1.L$4 = charSequence7;
                                                    neuroPostcardMapper$mapNeuroTextInput$1.L$5 = charSequence6;
                                                    neuroPostcardMapper$mapNeuroTextInput$1.L$6 = num;
                                                    String str14 = str6;
                                                    neuroPostcardMapper$mapNeuroTextInput$1.L$7 = null;
                                                    neuroPostcardMapper$mapNeuroTextInput$1.L$8 = null;
                                                    neuroPostcardMapper$mapNeuroTextInput$1.L$9 = collection2;
                                                    neuroPostcardMapper$mapNeuroTextInput$1.L$10 = it;
                                                    neuroPostcardMapper$mapNeuroTextInput$1.L$11 = null;
                                                    neuroPostcardMapper$mapNeuroTextInput$1.L$12 = null;
                                                    neuroPostcardMapper$mapNeuroTextInput$1.L$13 = collection2;
                                                    neuroPostcardMapper$mapNeuroTextInput$1.I$0 = i3;
                                                    neuroPostcardMapper$mapNeuroTextInput$1.I$1 = i2;
                                                    neuroPostcardMapper$mapNeuroTextInput$1.I$2 = 0;
                                                    neuroPostcardMapper$mapNeuroTextInput$1.label = 4;
                                                    Object j = j(v460Var, neuroPostcardMapper$mapNeuroTextInput$1);
                                                    if (j != obj2) {
                                                        arrayList = collection2;
                                                        charSequence12 = charSequence7;
                                                        r460Var6 = r460Var4;
                                                        charSequence13 = charSequence6;
                                                        f360Var5 = f360Var3;
                                                        num3 = num;
                                                        charSequence14 = charSequence8;
                                                        it2 = it;
                                                        i4 = i3;
                                                        collection = arrayList;
                                                        neuroPostcardMapper$mapNeuroTextInput$12 = neuroPostcardMapper$mapNeuroTextInput$1;
                                                        i5 = i2;
                                                        obj = j;
                                                        str6 = str14;
                                                        collection.add((w460) obj);
                                                        i2 = i5;
                                                        neuroPostcardMapper$mapNeuroTextInput$1 = neuroPostcardMapper$mapNeuroTextInput$12;
                                                        i3 = i4;
                                                        charSequence8 = charSequence14;
                                                        f360Var3 = f360Var5;
                                                        r460Var4 = r460Var6;
                                                        it = it2;
                                                        num = num3;
                                                        charSequence6 = charSequence13;
                                                        charSequence7 = charSequence12;
                                                        Collection collection22 = arrayList;
                                                        if (it.hasNext()) {
                                                            String str15 = str6;
                                                            List list7 = (List) collection22;
                                                            charSequence = charSequence8;
                                                            f360Var2 = f360Var3;
                                                            r460Var2 = r460Var4;
                                                            num4 = num;
                                                            charSequence4 = charSequence6;
                                                            charSequence2 = charSequence7;
                                                            list2 = list7;
                                                            str5 = str15;
                                                            str7 = r460Var2.g;
                                                            list3 = r460Var2.h;
                                                            if (list3 == null) {
                                                                List list8 = list3;
                                                                arrayList2 = new ArrayList(tcc.n(list8, 10));
                                                                for (Iterator it3 = list8.iterator(); it3.hasNext(); it3 = it3) {
                                                                    s460 s460Var = (s460) it3.next();
                                                                    arrayList2.add(new t460(s460Var.a, s460Var.b));
                                                                }
                                                            } else {
                                                                arrayList2 = null;
                                                            }
                                                            FormattedText formattedText5 = r460Var2.i;
                                                            neuroPostcardMapper$mapNeuroTextInput$1.L$0 = str5;
                                                            neuroPostcardMapper$mapNeuroTextInput$1.L$1 = r460Var2;
                                                            neuroPostcardMapper$mapNeuroTextInput$1.L$2 = f360Var2;
                                                            neuroPostcardMapper$mapNeuroTextInput$1.L$3 = charSequence;
                                                            neuroPostcardMapper$mapNeuroTextInput$1.L$4 = charSequence2;
                                                            neuroPostcardMapper$mapNeuroTextInput$1.L$5 = charSequence4;
                                                            neuroPostcardMapper$mapNeuroTextInput$1.L$6 = num4;
                                                            neuroPostcardMapper$mapNeuroTextInput$1.L$7 = list2;
                                                            neuroPostcardMapper$mapNeuroTextInput$1.L$8 = str7;
                                                            neuroPostcardMapper$mapNeuroTextInput$1.L$9 = arrayList2;
                                                            neuroPostcardMapper$mapNeuroTextInput$1.L$10 = null;
                                                            neuroPostcardMapper$mapNeuroTextInput$1.L$11 = null;
                                                            neuroPostcardMapper$mapNeuroTextInput$1.L$12 = null;
                                                            neuroPostcardMapper$mapNeuroTextInput$1.L$13 = null;
                                                            neuroPostcardMapper$mapNeuroTextInput$1.label = 5;
                                                            a = q8sVar.a(formattedText5, neuroPostcardMapper$mapNeuroTextInput$1);
                                                            if (a != obj2) {
                                                                Integer num5 = num4;
                                                                charSequence9 = charSequence4;
                                                                list4 = arrayList2;
                                                                f360Var4 = f360Var2;
                                                                num2 = num5;
                                                                List list9 = list2;
                                                                charSequence10 = charSequence;
                                                                list5 = list9;
                                                                str8 = str5;
                                                                r460Var5 = r460Var2;
                                                                charSequence11 = charSequence2;
                                                                obj = a;
                                                                charSequence15 = (CharSequence) obj;
                                                                formattedText3 = r460Var5.j;
                                                                if (formattedText3 != null) {
                                                                    charSequence16 = charSequence9;
                                                                    str9 = str7;
                                                                    charSequence17 = null;
                                                                    r460Var7 = r460Var5;
                                                                    f360Var6 = f360Var4;
                                                                    str10 = str8;
                                                                    return new u460(str10, f360Var6, charSequence10, charSequence11, charSequence16, num2, list5, str9, list4, charSequence15, charSequence17, r460Var7.l, r460Var7.k);
                                                                }
                                                                neuroPostcardMapper$mapNeuroTextInput$1.L$0 = str8;
                                                                neuroPostcardMapper$mapNeuroTextInput$1.L$1 = r460Var5;
                                                                neuroPostcardMapper$mapNeuroTextInput$1.L$2 = f360Var4;
                                                                neuroPostcardMapper$mapNeuroTextInput$1.L$3 = charSequence10;
                                                                neuroPostcardMapper$mapNeuroTextInput$1.L$4 = charSequence11;
                                                                neuroPostcardMapper$mapNeuroTextInput$1.L$5 = charSequence9;
                                                                neuroPostcardMapper$mapNeuroTextInput$1.L$6 = num2;
                                                                neuroPostcardMapper$mapNeuroTextInput$1.L$7 = list5;
                                                                neuroPostcardMapper$mapNeuroTextInput$1.L$8 = str7;
                                                                neuroPostcardMapper$mapNeuroTextInput$1.L$9 = list4;
                                                                neuroPostcardMapper$mapNeuroTextInput$1.L$10 = charSequence15;
                                                                neuroPostcardMapper$mapNeuroTextInput$1.L$11 = null;
                                                                neuroPostcardMapper$mapNeuroTextInput$1.I$0 = 0;
                                                                neuroPostcardMapper$mapNeuroTextInput$1.label = 6;
                                                                obj = q8sVar.a(formattedText3, neuroPostcardMapper$mapNeuroTextInput$1);
                                                                if (obj != obj2) {
                                                                    charSequence18 = charSequence9;
                                                                    str11 = str7;
                                                                    f360Var7 = f360Var4;
                                                                    r460Var7 = r460Var5;
                                                                    str12 = str8;
                                                                    charSequence17 = (CharSequence) obj;
                                                                    str10 = str12;
                                                                    str9 = str11;
                                                                    charSequence16 = charSequence18;
                                                                    f360Var6 = f360Var7;
                                                                    return new u460(str10, f360Var6, charSequence10, charSequence11, charSequence16, num2, list5, str9, list4, charSequence15, charSequence17, r460Var7.l, r460Var7.k);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                str5 = str3;
                                                list2 = null;
                                                str7 = r460Var2.g;
                                                list3 = r460Var2.h;
                                                if (list3 == null) {
                                                }
                                                FormattedText formattedText52 = r460Var2.i;
                                                neuroPostcardMapper$mapNeuroTextInput$1.L$0 = str5;
                                                neuroPostcardMapper$mapNeuroTextInput$1.L$1 = r460Var2;
                                                neuroPostcardMapper$mapNeuroTextInput$1.L$2 = f360Var2;
                                                neuroPostcardMapper$mapNeuroTextInput$1.L$3 = charSequence;
                                                neuroPostcardMapper$mapNeuroTextInput$1.L$4 = charSequence2;
                                                neuroPostcardMapper$mapNeuroTextInput$1.L$5 = charSequence4;
                                                neuroPostcardMapper$mapNeuroTextInput$1.L$6 = num4;
                                                neuroPostcardMapper$mapNeuroTextInput$1.L$7 = list2;
                                                neuroPostcardMapper$mapNeuroTextInput$1.L$8 = str7;
                                                neuroPostcardMapper$mapNeuroTextInput$1.L$9 = arrayList2;
                                                neuroPostcardMapper$mapNeuroTextInput$1.L$10 = null;
                                                neuroPostcardMapper$mapNeuroTextInput$1.L$11 = null;
                                                neuroPostcardMapper$mapNeuroTextInput$1.L$12 = null;
                                                neuroPostcardMapper$mapNeuroTextInput$1.L$13 = null;
                                                neuroPostcardMapper$mapNeuroTextInput$1.label = 5;
                                                a = q8sVar.a(formattedText52, neuroPostcardMapper$mapNeuroTextInput$1);
                                                if (a != obj2) {
                                                }
                                            }
                                        }
                                    } else {
                                        charSequence4 = null;
                                        Integer num42 = r460Var2.e;
                                        list = r460Var2.f;
                                        if (list != null) {
                                        }
                                    }
                                }
                            } else {
                                r460Var2 = r460Var8;
                                str3 = str2;
                                f360Var2 = f360Var;
                                charSequence = charSequence19;
                                charSequence2 = null;
                                formattedText2 = r460Var2.d;
                                if (formattedText2 != null) {
                                }
                            }
                        }
                        return obj2;
                    case 1:
                        f360 f360Var8 = (f360) neuroPostcardMapper$mapNeuroTextInput$1.L$2;
                        r460 r460Var9 = (r460) neuroPostcardMapper$mapNeuroTextInput$1.L$1;
                        str2 = (String) neuroPostcardMapper$mapNeuroTextInput$1.L$0;
                        kotlin.b.b(obj);
                        f360Var = f360Var8;
                        r460Var8 = r460Var9;
                        CharSequence charSequence192 = (CharSequence) obj;
                        formattedText = r460Var8.c;
                        if (formattedText == null) {
                        }
                        break;
                    case 2:
                        charSequence3 = (CharSequence) neuroPostcardMapper$mapNeuroTextInput$1.L$3;
                        f360Var = (f360) neuroPostcardMapper$mapNeuroTextInput$1.L$2;
                        r460Var3 = (r460) neuroPostcardMapper$mapNeuroTextInput$1.L$1;
                        str4 = (String) neuroPostcardMapper$mapNeuroTextInput$1.L$0;
                        kotlin.b.b(obj);
                        charSequence2 = (CharSequence) obj;
                        str3 = str4;
                        r460Var2 = r460Var3;
                        f360Var2 = f360Var;
                        charSequence = charSequence3;
                        formattedText2 = r460Var2.d;
                        if (formattedText2 != null) {
                        }
                        break;
                    case 3:
                        charSequence5 = (CharSequence) neuroPostcardMapper$mapNeuroTextInput$1.L$4;
                        charSequence = (CharSequence) neuroPostcardMapper$mapNeuroTextInput$1.L$3;
                        f360Var2 = (f360) neuroPostcardMapper$mapNeuroTextInput$1.L$2;
                        r460Var2 = (r460) neuroPostcardMapper$mapNeuroTextInput$1.L$1;
                        str3 = (String) neuroPostcardMapper$mapNeuroTextInput$1.L$0;
                        kotlin.b.b(obj);
                        CharSequence charSequence212 = (CharSequence) obj;
                        charSequence2 = charSequence5;
                        charSequence4 = charSequence212;
                        Integer num422 = r460Var2.e;
                        list = r460Var2.f;
                        if (list != null) {
                        }
                        break;
                    case 4:
                        int i7 = neuroPostcardMapper$mapNeuroTextInput$1.I$1;
                        int i8 = neuroPostcardMapper$mapNeuroTextInput$1.I$0;
                        Collection collection3 = (Collection) neuroPostcardMapper$mapNeuroTextInput$1.L$13;
                        Iterator it4 = (Iterator) neuroPostcardMapper$mapNeuroTextInput$1.L$10;
                        arrayList = (Collection) neuroPostcardMapper$mapNeuroTextInput$1.L$9;
                        Integer num6 = (Integer) neuroPostcardMapper$mapNeuroTextInput$1.L$6;
                        CharSequence charSequence22 = (CharSequence) neuroPostcardMapper$mapNeuroTextInput$1.L$5;
                        CharSequence charSequence23 = (CharSequence) neuroPostcardMapper$mapNeuroTextInput$1.L$4;
                        CharSequence charSequence24 = (CharSequence) neuroPostcardMapper$mapNeuroTextInput$1.L$3;
                        f360 f360Var9 = (f360) neuroPostcardMapper$mapNeuroTextInput$1.L$2;
                        r460 r460Var10 = (r460) neuroPostcardMapper$mapNeuroTextInput$1.L$1;
                        str6 = (String) neuroPostcardMapper$mapNeuroTextInput$1.L$0;
                        kotlin.b.b(obj);
                        charSequence12 = charSequence23;
                        charSequence13 = charSequence22;
                        num3 = num6;
                        it2 = it4;
                        collection = collection3;
                        r460Var6 = r460Var10;
                        f360Var5 = f360Var9;
                        charSequence14 = charSequence24;
                        i4 = i8;
                        neuroPostcardMapper$mapNeuroTextInput$12 = neuroPostcardMapper$mapNeuroTextInput$1;
                        i5 = i7;
                        collection.add((w460) obj);
                        i2 = i5;
                        neuroPostcardMapper$mapNeuroTextInput$1 = neuroPostcardMapper$mapNeuroTextInput$12;
                        i3 = i4;
                        charSequence8 = charSequence14;
                        f360Var3 = f360Var5;
                        r460Var4 = r460Var6;
                        it = it2;
                        num = num3;
                        charSequence6 = charSequence13;
                        charSequence7 = charSequence12;
                        Collection collection222 = arrayList;
                        if (it.hasNext()) {
                        }
                        break;
                    case 5:
                        List list10 = (List) neuroPostcardMapper$mapNeuroTextInput$1.L$9;
                        String str16 = (String) neuroPostcardMapper$mapNeuroTextInput$1.L$8;
                        list5 = (List) neuroPostcardMapper$mapNeuroTextInput$1.L$7;
                        num2 = (Integer) neuroPostcardMapper$mapNeuroTextInput$1.L$6;
                        charSequence9 = (CharSequence) neuroPostcardMapper$mapNeuroTextInput$1.L$5;
                        CharSequence charSequence25 = (CharSequence) neuroPostcardMapper$mapNeuroTextInput$1.L$4;
                        CharSequence charSequence26 = (CharSequence) neuroPostcardMapper$mapNeuroTextInput$1.L$3;
                        f360Var4 = (f360) neuroPostcardMapper$mapNeuroTextInput$1.L$2;
                        r460Var5 = (r460) neuroPostcardMapper$mapNeuroTextInput$1.L$1;
                        str8 = (String) neuroPostcardMapper$mapNeuroTextInput$1.L$0;
                        kotlin.b.b(obj);
                        charSequence11 = charSequence25;
                        charSequence10 = charSequence26;
                        str7 = str16;
                        list4 = list10;
                        charSequence15 = (CharSequence) obj;
                        formattedText3 = r460Var5.j;
                        if (formattedText3 != null) {
                        }
                        break;
                    case 6:
                        charSequence15 = (CharSequence) neuroPostcardMapper$mapNeuroTextInput$1.L$10;
                        list4 = (List) neuroPostcardMapper$mapNeuroTextInput$1.L$9;
                        str11 = (String) neuroPostcardMapper$mapNeuroTextInput$1.L$8;
                        list5 = (List) neuroPostcardMapper$mapNeuroTextInput$1.L$7;
                        num2 = (Integer) neuroPostcardMapper$mapNeuroTextInput$1.L$6;
                        charSequence18 = (CharSequence) neuroPostcardMapper$mapNeuroTextInput$1.L$5;
                        charSequence11 = (CharSequence) neuroPostcardMapper$mapNeuroTextInput$1.L$4;
                        charSequence10 = (CharSequence) neuroPostcardMapper$mapNeuroTextInput$1.L$3;
                        f360Var7 = (f360) neuroPostcardMapper$mapNeuroTextInput$1.L$2;
                        r460Var7 = (r460) neuroPostcardMapper$mapNeuroTextInput$1.L$1;
                        str12 = (String) neuroPostcardMapper$mapNeuroTextInput$1.L$0;
                        kotlin.b.b(obj);
                        charSequence17 = (CharSequence) obj;
                        str10 = str12;
                        str9 = str11;
                        charSequence16 = charSequence18;
                        f360Var6 = f360Var7;
                        return new u460(str10, f360Var6, charSequence10, charSequence11, charSequence16, num2, list5, str9, list4, charSequence15, charSequence17, r460Var7.l, r460Var7.k);
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        neuroPostcardMapper$mapNeuroTextInput$1 = new NeuroPostcardMapper$mapNeuroTextInput$1(this, continuationImpl);
        Object obj3 = neuroPostcardMapper$mapNeuroTextInput$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = neuroPostcardMapper$mapNeuroTextInput$1.label;
        q8s q8sVar2 = this.b;
        switch (i) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0066, code lost:
    
        if (r9 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0089, code lost:
    
        if (r9 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(f460 f460Var, ContinuationImpl continuationImpl) {
        NeuroPostcardMapper$mapStage$1 neuroPostcardMapper$mapStage$1;
        int i;
        i360 i360Var;
        Set set;
        NeuroPostcardShownStagesRepository.PostcardStage postcardStage;
        if (continuationImpl instanceof NeuroPostcardMapper$mapStage$1) {
            neuroPostcardMapper$mapStage$1 = (NeuroPostcardMapper$mapStage$1) continuationImpl;
            int i2 = neuroPostcardMapper$mapStage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                neuroPostcardMapper$mapStage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = neuroPostcardMapper$mapStage$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = neuroPostcardMapper$mapStage$1.label;
                boolean z = false;
                i360 i360Var2 = null;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        i360Var2 = (i360) obj;
                        return new h460(i360Var2);
                    }
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f460Var = (f460) neuroPostcardMapper$mapStage$1.L$0;
                    kotlin.b.b(obj);
                    i360Var = (i360) obj;
                    set = (Set) this.c.a.get(this.a);
                    if (set != null) {
                        if (f460Var.equals(c460.a)) {
                            postcardStage = NeuroPostcardShownStagesRepository.PostcardStage.INITIAL;
                        } else if (f460Var instanceof b460) {
                            postcardStage = NeuroPostcardShownStagesRepository.PostcardStage.EDITING;
                        } else if (f460Var instanceof d460) {
                            postcardStage = NeuroPostcardShownStagesRepository.PostcardStage.SENDING;
                        } else if (f460Var instanceof a460) {
                            postcardStage = NeuroPostcardShownStagesRepository.PostcardStage.COMPLETED;
                        } else {
                            if (!f460Var.equals(e460.a)) {
                                w511.b();
                                return null;
                            }
                            postcardStage = NeuroPostcardShownStagesRepository.PostcardStage.UNKNOWN;
                        }
                        z = set.contains(postcardStage);
                    }
                    return new j460(i360Var, z);
                }
                kotlin.b.b(obj);
                boolean z2 = f460Var instanceof c460;
                i460 i460Var = i460.a;
                if (z2) {
                    return i460Var;
                }
                if (f460Var instanceof b460) {
                    h360 h360Var = ((b460) f460Var).a;
                    if (h360Var != null) {
                        neuroPostcardMapper$mapStage$1.L$0 = null;
                        neuroPostcardMapper$mapStage$1.L$1 = null;
                        neuroPostcardMapper$mapStage$1.I$0 = 0;
                        neuroPostcardMapper$mapStage$1.label = 1;
                        obj = g(h360Var, neuroPostcardMapper$mapStage$1);
                    }
                    return new h460(i360Var2);
                }
                if (!(f460Var instanceof d460)) {
                    if (f460Var instanceof a460) {
                        return g460.a;
                    }
                    if (f460Var instanceof e460) {
                        return i460Var;
                    }
                    w511.b();
                    return null;
                }
                h360 h360Var2 = ((d460) f460Var).a;
                if (h360Var2 == null) {
                    i360Var = null;
                    set = (Set) this.c.a.get(this.a);
                    if (set != null) {
                    }
                    return new j460(i360Var, z);
                }
                neuroPostcardMapper$mapStage$1.L$0 = f460Var;
                neuroPostcardMapper$mapStage$1.L$1 = null;
                neuroPostcardMapper$mapStage$1.I$0 = 0;
                neuroPostcardMapper$mapStage$1.label = 2;
                obj = g(h360Var2, neuroPostcardMapper$mapStage$1);
                return obj2;
            }
        }
        neuroPostcardMapper$mapStage$1 = new NeuroPostcardMapper$mapStage$1(this, continuationImpl);
        Object obj3 = neuroPostcardMapper$mapStage$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = neuroPostcardMapper$mapStage$1.label;
        boolean z3 = false;
        i360 i360Var22 = null;
        if (i == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(v460 v460Var, ContinuationImpl continuationImpl) {
        NeuroPostcardMapper$mapStopWordsItem$1 neuroPostcardMapper$mapStopWordsItem$1;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        if (continuationImpl instanceof NeuroPostcardMapper$mapStopWordsItem$1) {
            neuroPostcardMapper$mapStopWordsItem$1 = (NeuroPostcardMapper$mapStopWordsItem$1) continuationImpl;
            int i2 = neuroPostcardMapper$mapStopWordsItem$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                neuroPostcardMapper$mapStopWordsItem$1.label = i2 - Integer.MIN_VALUE;
                Object obj = neuroPostcardMapper$mapStopWordsItem$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = neuroPostcardMapper$mapStopWordsItem$1.label;
                CharSequence charSequence = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    arrayList = v460Var.a;
                    FormattedText formattedText = v460Var.b;
                    if (formattedText != null) {
                        neuroPostcardMapper$mapStopWordsItem$1.L$0 = v460Var;
                        neuroPostcardMapper$mapStopWordsItem$1.L$1 = null;
                        neuroPostcardMapper$mapStopWordsItem$1.L$2 = arrayList;
                        neuroPostcardMapper$mapStopWordsItem$1.I$0 = 0;
                        neuroPostcardMapper$mapStopWordsItem$1.label = 1;
                        Object a = this.b.a(formattedText, neuroPostcardMapper$mapStopWordsItem$1);
                        if (a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        obj = a;
                        arrayList2 = arrayList;
                    }
                    return new w460(charSequence, v460Var.c, arrayList);
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ?? r6 = (List) neuroPostcardMapper$mapStopWordsItem$1.L$2;
                v460Var = (v460) neuroPostcardMapper$mapStopWordsItem$1.L$0;
                kotlin.b.b(obj);
                arrayList2 = r6;
                charSequence = (CharSequence) obj;
                arrayList = arrayList2;
                return new w460(charSequence, v460Var.c, arrayList);
            }
        }
        neuroPostcardMapper$mapStopWordsItem$1 = new NeuroPostcardMapper$mapStopWordsItem$1(this, continuationImpl);
        Object obj2 = neuroPostcardMapper$mapStopWordsItem$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = neuroPostcardMapper$mapStopWordsItem$1.label;
        CharSequence charSequence2 = null;
        if (i != 0) {
        }
        charSequence2 = (CharSequence) obj2;
        arrayList = arrayList2;
        return new w460(charSequence2, v460Var.c, arrayList);
    }
}
