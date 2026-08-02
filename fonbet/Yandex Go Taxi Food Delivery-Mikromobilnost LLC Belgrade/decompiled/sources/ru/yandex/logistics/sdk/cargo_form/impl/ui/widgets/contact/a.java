package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.contact;

import com.squareup.moshi.Moshi;
import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.a0k0;
import defpackage.an91;
import defpackage.b51;
import defpackage.c0k0;
import defpackage.c51;
import defpackage.d51;
import defpackage.dty0;
import defpackage.evu0;
import defpackage.fws0;
import defpackage.hts0;
import defpackage.hty0;
import defpackage.j6s;
import defpackage.jbq0;
import defpackage.jvs0;
import defpackage.l690;
import defpackage.lts0;
import defpackage.mum;
import defpackage.ny61;
import defpackage.o690;
import defpackage.oae;
import defpackage.oxh0;
import defpackage.q8s;
import defpackage.qbe;
import defpackage.qv0;
import defpackage.qv10;
import defpackage.rbe;
import defpackage.s9e;
import defpackage.sbe;
import defpackage.tbe;
import defpackage.u1n;
import defpackage.up21;
import defpackage.vbb;
import defpackage.w511;
import defpackage.x2s;
import defpackage.x41;
import defpackage.yuj0;
import defpackage.yzj0;
import defpackage.z5s;
import defpackage.zzj0;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.ContactSelectorRemoteCoreWidget$ContactPositionModel;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.definitions.RoutePointContactDto;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.formclientstate.FormStateRoutePointDto;

/* loaded from: classes5.dex */
public final class a {
    public final q8s a;
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a b;
    public final up21 c;
    public final vbb d;
    public final z5s e;
    public final yuj0 f;

    public a(q8s q8sVar, ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar, up21 up21Var, vbb vbbVar, z5s z5sVar, yuj0 yuj0Var) {
        this.a = q8sVar;
        this.b = aVar;
        this.c = up21Var;
        this.d = vbbVar;
        this.e = z5sVar;
        this.f = yuj0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01c5, code lost:
    
        if (r9 != null) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19, types: [T, s9e] */
    /* JADX WARN: Type inference failed for: r5v21, types: [T, s9e] */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(tbe tbeVar, j6s j6sVar, ContinuationImpl continuationImpl) {
        ContactMapper$map$1 contactMapper$map$1;
        int i;
        fws0 fws0Var;
        RoutePointContactDto contact;
        s9e s9eVar;
        ?? r5;
        sbe sbeVar;
        x2s x2sVar;
        T t;
        fws0 fws0Var2;
        s9e s9eVar2;
        String str;
        Object a;
        tbe tbeVar2;
        dty0 dty0Var;
        j6s j6sVar2;
        ContactSelectorRemoteCoreWidget$ContactPositionModel contactSelectorRemoteCoreWidget$ContactPositionModel;
        Ref$ObjectRef ref$ObjectRef;
        String str2;
        CharSequence charSequence;
        jvs0 jvs0Var;
        tbe tbeVar3;
        String str3;
        CharSequence charSequence2;
        String str4;
        hts0 s;
        o690 o690Var;
        l690 b;
        if (continuationImpl instanceof ContactMapper$map$1) {
            contactMapper$map$1 = (ContactMapper$map$1) continuationImpl;
            int i2 = contactMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                contactMapper$map$1.label = i2 - Integer.MIN_VALUE;
                ContactMapper$map$1 contactMapper$map$12 = contactMapper$map$1;
                Object obj = contactMapper$map$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = contactMapper$map$12.label;
                ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar = this.b;
                if (i != 0) {
                    Ref$ObjectRef z = qv10.z(obj);
                    c0k0 c0k0Var = tbeVar.b;
                    fws0Var = tbeVar.i;
                    vbb vbbVar = this.d;
                    vbbVar.getClass();
                    if (!(c0k0Var instanceof yzj0)) {
                        if (c0k0Var instanceof zzj0) {
                            Object obj2 = j6sVar.a.get(((zzj0) c0k0Var).a);
                            RoutePointContactDto routePointContactDto = obj2 instanceof RoutePointContactDto ? (RoutePointContactDto) obj2 : obj2 instanceof Map ? (RoutePointContactDto) ((Moshi) ((u1n) vbbVar.b).b).adapter(RoutePointContactDto.class).fromJsonValue((Map) obj2) : null;
                            if (routePointContactDto != null) {
                                String name = routePointContactDto.getName();
                                s9eVar = new s9e(name != null ? name : "", routePointContactDto.getPhone());
                                r5 = s9eVar;
                            }
                            r5 = 0;
                        } else {
                            if (!(c0k0Var instanceof a0k0)) {
                                w511.b();
                                return null;
                            }
                            FormStateRoutePointDto h = ((mum) vbbVar.a).h(j6sVar, ((a0k0) c0k0Var).a);
                            if (h != null && (contact = h.getContact()) != null) {
                                String name2 = contact.getName();
                                s9eVar = new s9e(name2 != null ? name2 : "", contact.getPhone());
                                r5 = s9eVar;
                            }
                            r5 = 0;
                        }
                        z.element = r5;
                        if (r5 != 0) {
                        }
                        sbeVar = tbeVar.l;
                        if (!(sbeVar instanceof qbe)) {
                        }
                        x2sVar = new x2s(tbeVar.m, tbeVar.n);
                        t = z.element;
                        if (t != 0) {
                        }
                        fws0Var = fws0Var2;
                        s9eVar2 = (s9e) z.element;
                        if (s9eVar2 != null) {
                            if (evu0.J(str)) {
                            }
                        }
                        s9e s9eVar3 = (s9e) z.element;
                        if (s9eVar3 == null) {
                        }
                        ContactSelectorRemoteCoreWidget$ContactPositionModel contactSelectorRemoteCoreWidget$ContactPositionModel2 = tbeVar.c;
                        hty0 hty0Var = tbeVar.f;
                        if (hty0Var == null) {
                        }
                        if (((s9e) z.element) == null) {
                        }
                        contactMapper$map$12.L$0 = tbeVar;
                        contactMapper$map$12.L$1 = j6sVar;
                        contactMapper$map$12.L$2 = z;
                        contactMapper$map$12.L$3 = x2sVar;
                        contactMapper$map$12.L$4 = fws0Var;
                        contactMapper$map$12.L$5 = str;
                        contactMapper$map$12.L$6 = contactSelectorRemoteCoreWidget$ContactPositionModel2;
                        contactMapper$map$12.L$7 = r15;
                        contactMapper$map$12.L$8 = null;
                        contactMapper$map$12.I$0 = 0;
                        contactMapper$map$12.label = 1;
                        a = this.a.a(r11, contactMapper$map$12);
                        if (a != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    yzj0 yzj0Var = (yzj0) c0k0Var;
                    int i3 = yzj0Var.a;
                    d51 d51Var = yzj0Var.b;
                    if (d51Var instanceof c51) {
                        qv0 qv0Var = (qv0) kotlin.collections.a.S(i3, j6sVar.c.a);
                        if (qv0Var != null) {
                            r5 = qv0Var.g;
                        }
                        r5 = 0;
                    } else {
                        if (!(d51Var instanceof b51)) {
                            w511.b();
                            return null;
                        }
                        r5 = (s9e) j6sVar.e.get(Integer.valueOf(i3));
                    }
                    z.element = r5;
                    if (r5 != 0 || r5.equals(new s9e(0))) {
                        sbeVar = tbeVar.l;
                        if (!(sbeVar instanceof qbe)) {
                            ?? s9eVar4 = new s9e(this.f.a(oxh0.cargoform_contact_picker_me, new Object[0]), this.c.a());
                            this.e.a(tbeVar.b, new x41(s9eVar4));
                            z.element = s9eVar4;
                        } else if (!(sbeVar instanceof rbe) && sbeVar != null) {
                            w511.b();
                            return null;
                        }
                    }
                    x2sVar = new x2s(tbeVar.m, tbeVar.n);
                    t = z.element;
                    if ((t != 0 || ((s9e) t).equals(new s9e(0))) && (fws0Var2 = tbeVar.j) != null) {
                        fws0Var = fws0Var2;
                    }
                    s9eVar2 = (s9e) z.element;
                    if (s9eVar2 != null && (str = s9eVar2.a) != null) {
                        if (evu0.J(str)) {
                            str = ((s9e) z.element).b;
                        }
                    }
                    s9e s9eVar32 = (s9e) z.element;
                    str = s9eVar32 == null ? s9eVar32.b : null;
                    ContactSelectorRemoteCoreWidget$ContactPositionModel contactSelectorRemoteCoreWidget$ContactPositionModel22 = tbeVar.c;
                    hty0 hty0Var2 = tbeVar.f;
                    dty0 v = hty0Var2 == null ? aVar.v(hty0Var2) : null;
                    FormattedText formattedText = ((s9e) z.element) == null ? tbeVar.d : tbeVar.e;
                    contactMapper$map$12.L$0 = tbeVar;
                    contactMapper$map$12.L$1 = j6sVar;
                    contactMapper$map$12.L$2 = z;
                    contactMapper$map$12.L$3 = x2sVar;
                    contactMapper$map$12.L$4 = fws0Var;
                    contactMapper$map$12.L$5 = str;
                    contactMapper$map$12.L$6 = contactSelectorRemoteCoreWidget$ContactPositionModel22;
                    contactMapper$map$12.L$7 = v;
                    contactMapper$map$12.L$8 = null;
                    contactMapper$map$12.I$0 = 0;
                    contactMapper$map$12.label = 1;
                    a = this.a.a(formattedText, contactMapper$map$12);
                    if (a != coroutineSingletons) {
                        dty0 dty0Var2 = v;
                        tbeVar2 = tbeVar;
                        dty0Var = dty0Var2;
                        j6sVar2 = j6sVar;
                        contactSelectorRemoteCoreWidget$ContactPositionModel = contactSelectorRemoteCoreWidget$ContactPositionModel22;
                        ref$ObjectRef = z;
                        obj = a;
                        str2 = str;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charSequence2 = (CharSequence) contactMapper$map$12.L$8;
                    dty0Var = (dty0) contactMapper$map$12.L$7;
                    contactSelectorRemoteCoreWidget$ContactPositionModel = (ContactSelectorRemoteCoreWidget$ContactPositionModel) contactMapper$map$12.L$6;
                    str4 = (String) contactMapper$map$12.L$5;
                    x2sVar = (x2s) contactMapper$map$12.L$3;
                    ref$ObjectRef = (Ref$ObjectRef) contactMapper$map$12.L$2;
                    tbeVar3 = (tbe) contactMapper$map$12.L$0;
                    kotlin.b.b(obj);
                    charSequence = charSequence2;
                    jvs0Var = (jvs0) obj;
                    str3 = str4;
                    dty0 dty0Var3 = dty0Var;
                    ContactSelectorRemoteCoreWidget$ContactPositionModel contactSelectorRemoteCoreWidget$ContactPositionModel3 = contactSelectorRemoteCoreWidget$ContactPositionModel;
                    if (((s9e) ref$ObjectRef.element) != null) {
                        lts0 lts0Var = tbeVar3.g;
                        hts0 s2 = lts0Var != null ? aVar.s(lts0Var) : null;
                        if (s2 != null) {
                            s = s2;
                            jbq0 jbq0Var = new jbq0(tbeVar3.b, (s9e) ref$ObjectRef.element, x2sVar);
                            String str5 = tbeVar3.a;
                            o690Var = tbeVar3.k;
                            if (o690Var == null) {
                                aVar.getClass();
                                b = ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.i(o690Var);
                            } else {
                                b = an91.b(8.0f, 0.0f, 2);
                            }
                            return new oae(str3, charSequence, contactSelectorRemoteCoreWidget$ContactPositionModel3, dty0Var3, s, jvs0Var, b, x2sVar, jbq0Var, str5);
                        }
                    }
                    lts0 lts0Var2 = tbeVar3.h;
                    s = lts0Var2 != null ? aVar.s(lts0Var2) : null;
                    jbq0 jbq0Var2 = new jbq0(tbeVar3.b, (s9e) ref$ObjectRef.element, x2sVar);
                    String str52 = tbeVar3.a;
                    o690Var = tbeVar3.k;
                    if (o690Var == null) {
                    }
                    return new oae(str3, charSequence, contactSelectorRemoteCoreWidget$ContactPositionModel3, dty0Var3, s, jvs0Var, b, x2sVar, jbq0Var2, str52);
                }
                dty0Var = (dty0) contactMapper$map$12.L$7;
                contactSelectorRemoteCoreWidget$ContactPositionModel = (ContactSelectorRemoteCoreWidget$ContactPositionModel) contactMapper$map$12.L$6;
                String str6 = (String) contactMapper$map$12.L$5;
                fws0 fws0Var3 = (fws0) contactMapper$map$12.L$4;
                x2s x2sVar2 = (x2s) contactMapper$map$12.L$3;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) contactMapper$map$12.L$2;
                j6sVar2 = (j6s) contactMapper$map$12.L$1;
                tbeVar2 = (tbe) contactMapper$map$12.L$0;
                kotlin.b.b(obj);
                str2 = str6;
                x2sVar = x2sVar2;
                fws0Var = fws0Var3;
                ref$ObjectRef = ref$ObjectRef2;
                CharSequence charSequence3 = (CharSequence) obj;
                if (fws0Var != null) {
                    charSequence = charSequence3;
                    jvs0Var = null;
                    tbeVar3 = tbeVar2;
                    str3 = str2;
                    dty0 dty0Var32 = dty0Var;
                    ContactSelectorRemoteCoreWidget$ContactPositionModel contactSelectorRemoteCoreWidget$ContactPositionModel32 = contactSelectorRemoteCoreWidget$ContactPositionModel;
                    if (((s9e) ref$ObjectRef.element) != null) {
                    }
                    lts0 lts0Var22 = tbeVar3.h;
                    s = lts0Var22 != null ? aVar.s(lts0Var22) : null;
                    jbq0 jbq0Var22 = new jbq0(tbeVar3.b, (s9e) ref$ObjectRef.element, x2sVar);
                    String str522 = tbeVar3.a;
                    o690Var = tbeVar3.k;
                    if (o690Var == null) {
                    }
                    return new oae(str3, charSequence, contactSelectorRemoteCoreWidget$ContactPositionModel32, dty0Var32, s, jvs0Var, b, x2sVar, jbq0Var22, str522);
                }
                contactMapper$map$12.L$0 = tbeVar2;
                contactMapper$map$12.L$1 = null;
                contactMapper$map$12.L$2 = ref$ObjectRef;
                contactMapper$map$12.L$3 = x2sVar;
                contactMapper$map$12.L$4 = null;
                contactMapper$map$12.L$5 = str2;
                contactMapper$map$12.L$6 = contactSelectorRemoteCoreWidget$ContactPositionModel;
                contactMapper$map$12.L$7 = dty0Var;
                contactMapper$map$12.L$8 = charSequence3;
                contactMapper$map$12.L$9 = null;
                contactMapper$map$12.I$0 = 0;
                contactMapper$map$12.label = 2;
                Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef;
                x2s x2sVar3 = x2sVar;
                Object u = this.b.u(fws0Var, j6sVar2, false, true, contactMapper$map$12);
                if (u != coroutineSingletons) {
                    x2sVar = x2sVar3;
                    charSequence2 = charSequence3;
                    obj = u;
                    str4 = str2;
                    ref$ObjectRef = ref$ObjectRef3;
                    tbeVar3 = tbeVar2;
                    charSequence = charSequence2;
                    jvs0Var = (jvs0) obj;
                    str3 = str4;
                    dty0 dty0Var322 = dty0Var;
                    ContactSelectorRemoteCoreWidget$ContactPositionModel contactSelectorRemoteCoreWidget$ContactPositionModel322 = contactSelectorRemoteCoreWidget$ContactPositionModel;
                    if (((s9e) ref$ObjectRef.element) != null) {
                    }
                    lts0 lts0Var222 = tbeVar3.h;
                    s = lts0Var222 != null ? aVar.s(lts0Var222) : null;
                    jbq0 jbq0Var222 = new jbq0(tbeVar3.b, (s9e) ref$ObjectRef.element, x2sVar);
                    String str5222 = tbeVar3.a;
                    o690Var = tbeVar3.k;
                    if (o690Var == null) {
                    }
                    return new oae(str3, charSequence, contactSelectorRemoteCoreWidget$ContactPositionModel322, dty0Var322, s, jvs0Var, b, x2sVar, jbq0Var222, str5222);
                }
                return coroutineSingletons;
            }
        }
        contactMapper$map$1 = new ContactMapper$map$1(this, continuationImpl);
        ContactMapper$map$1 contactMapper$map$122 = contactMapper$map$1;
        Object obj3 = contactMapper$map$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = contactMapper$map$122.label;
        ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar2 = this.b;
        if (i != 0) {
        }
        CharSequence charSequence32 = (CharSequence) obj3;
        if (fws0Var != null) {
        }
    }
}
