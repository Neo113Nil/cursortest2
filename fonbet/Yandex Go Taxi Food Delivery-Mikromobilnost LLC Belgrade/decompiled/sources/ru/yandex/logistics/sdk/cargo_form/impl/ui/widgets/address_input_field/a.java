package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.address_input_field;

import defpackage.a0k0;
import defpackage.an91;
import defpackage.b51;
import defpackage.c0k0;
import defpackage.c51;
import defpackage.cyq;
import defpackage.d51;
import defpackage.dyq;
import defpackage.eyq;
import defpackage.fws0;
import defpackage.fyq;
import defpackage.g191;
import defpackage.gyq;
import defpackage.hw0;
import defpackage.hyq;
import defpackage.iw0;
import defpackage.j6s;
import defpackage.jvs0;
import defpackage.l690;
import defpackage.l8e;
import defpackage.mum;
import defpackage.ny61;
import defpackage.o690;
import defpackage.ow0;
import defpackage.qv0;
import defpackage.sv0;
import defpackage.tv0;
import defpackage.uv0;
import defpackage.w511;
import defpackage.yzj0;
import defpackage.zzj0;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.formclientstate.FormStateRoutePointDto;

/* loaded from: classes5.dex */
public final class a {
    public final g191 a;
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a b;

    public a(g191 g191Var, ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar) {
        this.a = g191Var;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(iw0 iw0Var, j6s j6sVar, Set set, ContinuationImpl continuationImpl) {
        AddressInputFieldMapper$map$1 addressInputFieldMapper$map$1;
        int i;
        String comment;
        sv0 sv0Var;
        uv0 uv0Var;
        fws0 fws0Var;
        String str;
        jvs0 jvs0Var;
        String str2;
        l8e l8eVar;
        uv0 uv0Var2;
        iw0 iw0Var2;
        String str3;
        String str4;
        uv0 uv0Var3;
        l8e l8eVar2;
        o690 o690Var;
        l690 b;
        if (continuationImpl instanceof AddressInputFieldMapper$map$1) {
            addressInputFieldMapper$map$1 = (AddressInputFieldMapper$map$1) continuationImpl;
            int i2 = addressInputFieldMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressInputFieldMapper$map$1.label = i2 - Integer.MIN_VALUE;
                AddressInputFieldMapper$map$1 addressInputFieldMapper$map$12 = addressInputFieldMapper$map$1;
                Object obj = addressInputFieldMapper$map$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressInputFieldMapper$map$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    hyq hyqVar = iw0Var.c;
                    c0k0 c0k0Var = iw0Var.b;
                    g191 g191Var = this.a;
                    g191Var.getClass();
                    if (c0k0Var instanceof yzj0) {
                        yzj0 yzj0Var = (yzj0) c0k0Var;
                        int i3 = yzj0Var.a;
                        d51 d51Var = yzj0Var.b;
                        if (d51Var instanceof c51) {
                            qv0 qv0Var = (qv0) kotlin.collections.a.S(i3, j6sVar.c.a);
                            if (qv0Var != null) {
                                comment = g191.O(qv0Var, hyqVar);
                                boolean contains = set.contains(iw0Var.a);
                                String str5 = iw0Var.d;
                                if (comment == null) {
                                    comment = "";
                                }
                                l8e l8eVar3 = !(iw0Var.c instanceof dyq) ? new l8e(Integer.MAX_VALUE) : new l8e(1);
                                sv0Var = iw0Var.e;
                                if (sv0Var != null) {
                                    if (contains) {
                                        sv0Var = null;
                                    }
                                    if (sv0Var != null) {
                                        uv0Var = new uv0(sv0Var.a, sv0Var.b);
                                        fws0Var = iw0Var.f;
                                        if (fws0Var == null) {
                                            str = comment;
                                            jvs0Var = null;
                                            str2 = str5;
                                            l8eVar = l8eVar3;
                                            uv0Var2 = uv0Var;
                                            o690Var = iw0Var.g;
                                            if (o690Var != null) {
                                                this.b.getClass();
                                                b = ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.i(o690Var);
                                            } else {
                                                b = an91.b(0.0f, 0.0f, 3);
                                            }
                                            l690 l690Var = b;
                                            ow0 ow0Var = new ow0(iw0Var.c, iw0Var.b);
                                            String str6 = iw0Var.a;
                                            return new hw0(str2, str, l8eVar, uv0Var2, jvs0Var, l690Var, ow0Var, new tv0(str6), str6);
                                        }
                                        addressInputFieldMapper$map$12.L$0 = iw0Var;
                                        addressInputFieldMapper$map$12.L$1 = null;
                                        addressInputFieldMapper$map$12.L$2 = null;
                                        addressInputFieldMapper$map$12.L$3 = null;
                                        addressInputFieldMapper$map$12.L$4 = null;
                                        addressInputFieldMapper$map$12.L$5 = str5;
                                        addressInputFieldMapper$map$12.L$6 = comment;
                                        addressInputFieldMapper$map$12.L$7 = l8eVar3;
                                        addressInputFieldMapper$map$12.L$8 = uv0Var;
                                        addressInputFieldMapper$map$12.Z$0 = contains;
                                        addressInputFieldMapper$map$12.I$0 = 0;
                                        addressInputFieldMapper$map$12.label = 1;
                                        Object u = this.b.u(fws0Var, j6sVar, false, true, addressInputFieldMapper$map$12);
                                        if (u == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        iw0Var2 = iw0Var;
                                        str3 = comment;
                                        str4 = str5;
                                        uv0Var3 = uv0Var;
                                        obj = u;
                                        l8eVar2 = l8eVar3;
                                    }
                                }
                                uv0Var = null;
                                fws0Var = iw0Var.f;
                                if (fws0Var == null) {
                                }
                            }
                            comment = null;
                            boolean contains2 = set.contains(iw0Var.a);
                            String str52 = iw0Var.d;
                            if (comment == null) {
                            }
                            l8e l8eVar32 = !(iw0Var.c instanceof dyq) ? new l8e(Integer.MAX_VALUE) : new l8e(1);
                            sv0Var = iw0Var.e;
                            if (sv0Var != null) {
                            }
                            uv0Var = null;
                            fws0Var = iw0Var.f;
                            if (fws0Var == null) {
                            }
                        } else {
                            if (!(d51Var instanceof b51)) {
                                w511.b();
                                return null;
                            }
                            qv0 qv0Var2 = (qv0) kotlin.collections.a.S(i3, j6sVar.d.a);
                            if (qv0Var2 != null) {
                                comment = g191.O(qv0Var2, hyqVar);
                                boolean contains22 = set.contains(iw0Var.a);
                                String str522 = iw0Var.d;
                                if (comment == null) {
                                }
                                l8e l8eVar322 = !(iw0Var.c instanceof dyq) ? new l8e(Integer.MAX_VALUE) : new l8e(1);
                                sv0Var = iw0Var.e;
                                if (sv0Var != null) {
                                }
                                uv0Var = null;
                                fws0Var = iw0Var.f;
                                if (fws0Var == null) {
                                }
                            }
                            comment = null;
                            boolean contains222 = set.contains(iw0Var.a);
                            String str5222 = iw0Var.d;
                            if (comment == null) {
                            }
                            l8e l8eVar3222 = !(iw0Var.c instanceof dyq) ? new l8e(Integer.MAX_VALUE) : new l8e(1);
                            sv0Var = iw0Var.e;
                            if (sv0Var != null) {
                            }
                            uv0Var = null;
                            fws0Var = iw0Var.f;
                            if (fws0Var == null) {
                            }
                        }
                    } else if (c0k0Var instanceof zzj0) {
                        Object obj2 = j6sVar.a.get(((zzj0) c0k0Var).a);
                        if (obj2 instanceof String) {
                            comment = (String) obj2;
                            boolean contains2222 = set.contains(iw0Var.a);
                            String str52222 = iw0Var.d;
                            if (comment == null) {
                            }
                            l8e l8eVar32222 = !(iw0Var.c instanceof dyq) ? new l8e(Integer.MAX_VALUE) : new l8e(1);
                            sv0Var = iw0Var.e;
                            if (sv0Var != null) {
                            }
                            uv0Var = null;
                            fws0Var = iw0Var.f;
                            if (fws0Var == null) {
                            }
                        }
                        comment = null;
                        boolean contains22222 = set.contains(iw0Var.a);
                        String str522222 = iw0Var.d;
                        if (comment == null) {
                        }
                        l8e l8eVar322222 = !(iw0Var.c instanceof dyq) ? new l8e(Integer.MAX_VALUE) : new l8e(1);
                        sv0Var = iw0Var.e;
                        if (sv0Var != null) {
                        }
                        uv0Var = null;
                        fws0Var = iw0Var.f;
                        if (fws0Var == null) {
                        }
                    } else {
                        if (!(c0k0Var instanceof a0k0)) {
                            w511.b();
                            return null;
                        }
                        FormStateRoutePointDto h = ((mum) g191Var.a).h(j6sVar, ((a0k0) c0k0Var).a);
                        if (h != null) {
                            if (hyqVar.equals(cyq.a)) {
                                comment = h.getRoom();
                            } else if (hyqVar.equals(fyq.a)) {
                                comment = h.getFloor();
                            } else if (hyqVar.equals(gyq.a)) {
                                comment = h.getEntrance();
                            } else if (hyqVar.equals(eyq.a)) {
                                comment = h.getCode();
                            } else {
                                if (!hyqVar.equals(dyq.a)) {
                                    w511.b();
                                    return null;
                                }
                                comment = h.getComment();
                            }
                            boolean contains222222 = set.contains(iw0Var.a);
                            String str5222222 = iw0Var.d;
                            if (comment == null) {
                            }
                            l8e l8eVar3222222 = !(iw0Var.c instanceof dyq) ? new l8e(Integer.MAX_VALUE) : new l8e(1);
                            sv0Var = iw0Var.e;
                            if (sv0Var != null) {
                            }
                            uv0Var = null;
                            fws0Var = iw0Var.f;
                            if (fws0Var == null) {
                            }
                        }
                        comment = null;
                        boolean contains2222222 = set.contains(iw0Var.a);
                        String str52222222 = iw0Var.d;
                        if (comment == null) {
                        }
                        l8e l8eVar32222222 = !(iw0Var.c instanceof dyq) ? new l8e(Integer.MAX_VALUE) : new l8e(1);
                        sv0Var = iw0Var.e;
                        if (sv0Var != null) {
                        }
                        uv0Var = null;
                        fws0Var = iw0Var.f;
                        if (fws0Var == null) {
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uv0Var3 = (uv0) addressInputFieldMapper$map$12.L$8;
                    l8eVar2 = (l8e) addressInputFieldMapper$map$12.L$7;
                    str3 = (String) addressInputFieldMapper$map$12.L$6;
                    str4 = (String) addressInputFieldMapper$map$12.L$5;
                    iw0Var2 = (iw0) addressInputFieldMapper$map$12.L$0;
                    kotlin.b.b(obj);
                }
                uv0Var2 = uv0Var3;
                str = str3;
                iw0Var = iw0Var2;
                jvs0Var = (jvs0) obj;
                l8eVar = l8eVar2;
                str2 = str4;
                o690Var = iw0Var.g;
                if (o690Var != null) {
                }
                l690 l690Var2 = b;
                ow0 ow0Var2 = new ow0(iw0Var.c, iw0Var.b);
                String str62 = iw0Var.a;
                return new hw0(str2, str, l8eVar, uv0Var2, jvs0Var, l690Var2, ow0Var2, new tv0(str62), str62);
            }
        }
        addressInputFieldMapper$map$1 = new AddressInputFieldMapper$map$1(this, continuationImpl);
        AddressInputFieldMapper$map$1 addressInputFieldMapper$map$122 = addressInputFieldMapper$map$1;
        Object obj3 = addressInputFieldMapper$map$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressInputFieldMapper$map$122.label;
        if (i != 0) {
        }
        uv0Var2 = uv0Var3;
        str = str3;
        iw0Var = iw0Var2;
        jvs0Var = (jvs0) obj3;
        l8eVar = l8eVar2;
        str2 = str4;
        o690Var = iw0Var.g;
        if (o690Var != null) {
        }
        l690 l690Var22 = b;
        ow0 ow0Var22 = new ow0(iw0Var.c, iw0Var.b);
        String str622 = iw0Var.a;
        return new hw0(str2, str, l8eVar, uv0Var2, jvs0Var, l690Var22, ow0Var22, new tv0(str622), str622);
    }
}
