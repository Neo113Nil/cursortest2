package com.yandex.passport.data.network;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.arf;
import defpackage.c5b;
import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.p3d;
import defpackage.q5b;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class w5 implements p3d {
    public static final w5 a;

    @NotNull
    private static final mhp descriptor;

    static {
        w5 w5Var = new w5();
        a = w5Var;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.GetConfigRequest.Result", w5Var, 10);
        j5mVar.k("backends", true);
        j5mVar.k("am_config", true);
        j5mVar.k("android_white_list_regex", true);
        j5mVar.k("default_locations", true);
        j5mVar.k("url_templates", true);
        j5mVar.k("android_ebs_config", true);
        j5mVar.k("android_block_vpn", true);
        j5mVar.k("android_vpn_manual_mode", true);
        j5mVar.k("android_autologin_app_parameters", true);
        j5mVar.k("android_autologin_client_id_parameters", true);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = y5.k;
        return new t9f[]{arfVarArr[0].getValue(), arfVarArr[1].getValue(), ff7.C(tkr.a), arfVarArr[3].getValue(), ff7.C(c6.a), ff7.C(o5.a), arfVarArr[6].getValue(), arfVarArr[7].getValue(), arfVarArr[8].getValue(), arfVarArr[9].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        Set set;
        List list;
        e6 e6Var;
        List list2;
        List list3;
        q5 q5Var;
        List list4;
        String str;
        List list5;
        List list6;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = y5.k;
        int i2 = 9;
        int i3 = 8;
        List list7 = null;
        if (c.m()) {
            List list8 = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            List list9 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            String str2 = (String) c.n(mhpVar, 2, tkr.a, null);
            List list10 = (List) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            e6 e6Var2 = (e6) c.n(mhpVar, 4, c6.a, null);
            q5 q5Var2 = (q5) c.n(mhpVar, 5, o5.a, null);
            List list11 = (List) c.z(mhpVar, 6, (t9f) arfVarArr[6].getValue(), null);
            Set set2 = (Set) c.z(mhpVar, 7, (t9f) arfVarArr[7].getValue(), null);
            List list12 = (List) c.z(mhpVar, 8, (t9f) arfVarArr[8].getValue(), null);
            list2 = (List) c.z(mhpVar, 9, (t9f) arfVarArr[9].getValue(), null);
            list5 = list8;
            q5Var = q5Var2;
            e6Var = e6Var2;
            str = str2;
            i = 1023;
            set = set2;
            list = list11;
            list4 = list10;
            list3 = list12;
            list6 = list9;
        } else {
            int i4 = 7;
            int i5 = 6;
            int i6 = 3;
            int i7 = 1;
            boolean z = true;
            int i8 = 0;
            Set set3 = null;
            List list13 = null;
            e6 e6Var3 = null;
            List list14 = null;
            List list15 = null;
            q5 q5Var3 = null;
            List list16 = null;
            String str3 = null;
            List list17 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        i2 = 9;
                        i7 = 1;
                        i6 = 3;
                        i5 = 6;
                        i4 = 7;
                    case 0:
                        list7 = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), list7);
                        i8 |= 1;
                        i2 = 9;
                        i3 = 8;
                        i7 = 1;
                        i6 = 3;
                        i5 = 6;
                        i4 = 7;
                    case 1:
                        list17 = (List) c.z(mhpVar, i7, (t9f) arfVarArr[i7].getValue(), list17);
                        i8 |= 2;
                        i2 = 9;
                        i3 = 8;
                        i6 = 3;
                        i5 = 6;
                        i4 = 7;
                    case 2:
                        str3 = (String) c.n(mhpVar, 2, tkr.a, str3);
                        i8 |= 4;
                        i2 = 9;
                        i3 = 8;
                        i6 = 3;
                        i5 = 6;
                        i4 = 7;
                    case 3:
                        list16 = (List) c.z(mhpVar, i6, (t9f) arfVarArr[i6].getValue(), list16);
                        i8 |= 8;
                        i2 = 9;
                        i3 = 8;
                        i5 = 6;
                        i4 = 7;
                    case 4:
                        e6Var3 = (e6) c.n(mhpVar, 4, c6.a, e6Var3);
                        i8 |= 16;
                        i2 = 9;
                        i3 = 8;
                        i5 = 6;
                        i4 = 7;
                    case 5:
                        q5Var3 = (q5) c.n(mhpVar, 5, o5.a, q5Var3);
                        i8 |= 32;
                        i2 = 9;
                        i3 = 8;
                        i5 = 6;
                        i4 = 7;
                    case 6:
                        list13 = (List) c.z(mhpVar, i5, (t9f) arfVarArr[i5].getValue(), list13);
                        i8 |= 64;
                        i2 = 9;
                        i3 = 8;
                        i4 = 7;
                    case 7:
                        set3 = (Set) c.z(mhpVar, i4, (t9f) arfVarArr[i4].getValue(), set3);
                        i8 |= 128;
                        i2 = 9;
                        i3 = 8;
                    case 8:
                        int i9 = i3;
                        list15 = (List) c.z(mhpVar, i9, (t9f) arfVarArr[i9].getValue(), list15);
                        i8 |= 256;
                        i3 = i9;
                        i2 = 9;
                    case 9:
                        list14 = (List) c.z(mhpVar, i2, (t9f) arfVarArr[i2].getValue(), list14);
                        i8 |= RemoteCameraConfig.Mic.BUFFER_SIZE;
                        i3 = i3;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i8;
            set = set3;
            list = list13;
            e6Var = e6Var3;
            list2 = list14;
            list3 = list15;
            q5Var = q5Var3;
            list4 = list16;
            str = str3;
            list5 = list7;
            list6 = list17;
        }
        c.b(mhpVar);
        return new y5(i, list5, list6, str, list4, e6Var, q5Var, list, set, list3, list2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        y5 y5Var = (y5) obj;
        l6bVar.getClass();
        y5Var.getClass();
        List list = y5Var.j;
        List list2 = y5Var.i;
        Set set = y5Var.h;
        List list3 = y5Var.g;
        q5 q5Var = y5Var.f;
        e6 e6Var = y5Var.e;
        List list4 = y5Var.d;
        String str = y5Var.c;
        List list5 = y5Var.b;
        List list6 = y5Var.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = y5.k;
        if (c.e(mhpVar) || !Intrinsics.d(list6, c5b.a)) {
            c.k(mhpVar, 0, (t9f) arfVarArr[0].getValue(), list6);
        }
        if (c.e(mhpVar) || !Intrinsics.d(list5, c5b.a)) {
            c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), list5);
        }
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 2, tkr.a, str);
        }
        if (c.e(mhpVar) || !Intrinsics.d(list4, c5b.a)) {
            c.k(mhpVar, 3, (t9f) arfVarArr[3].getValue(), list4);
        }
        if (c.e(mhpVar) || e6Var != null) {
            c.q(mhpVar, 4, c6.a, e6Var);
        }
        if (c.e(mhpVar) || q5Var != null) {
            c.q(mhpVar, 5, o5.a, q5Var);
        }
        if (c.e(mhpVar) || !Intrinsics.d(list3, c5b.a)) {
            c.k(mhpVar, 6, (t9f) arfVarArr[6].getValue(), list3);
        }
        if (c.e(mhpVar) || !Intrinsics.d(set, q5b.a)) {
            c.k(mhpVar, 7, (t9f) arfVarArr[7].getValue(), set);
        }
        if (c.e(mhpVar) || !Intrinsics.d(list2, c5b.a)) {
            c.k(mhpVar, 8, (t9f) arfVarArr[8].getValue(), list2);
        }
        if (c.e(mhpVar) || !Intrinsics.d(list, c5b.a)) {
            c.k(mhpVar, 9, (t9f) arfVarArr[9].getValue(), list);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
