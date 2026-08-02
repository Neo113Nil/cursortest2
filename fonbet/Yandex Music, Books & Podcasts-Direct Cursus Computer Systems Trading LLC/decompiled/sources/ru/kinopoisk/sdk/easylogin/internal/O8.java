package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.command.ServiceCommand;
import defpackage.bg3;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qdc;
import defpackage.qgg;
import defpackage.qxe;
import defpackage.vjp;
import defpackage.vz7;
import defpackage.xq0;
import defpackage.z7l;
import defpackage.zt3;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class O8 {

    public static final class a extends RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String str) {
            super(str);
            str.getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull vjp vjpVar, @NotNull cg6 cg6Var) {
        Q8 q8;
        int i;
        if (cg6Var instanceof Q8) {
            q8 = (Q8) cg6Var;
            int i2 = q8.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q8.c = i2 - Integer.MIN_VALUE;
                Object obj = q8.a;
                nm6 nm6Var = nm6.a;
                i = q8.c;
                if (i != 0) {
                    qgg.h0(obj);
                    q8.c = 1;
                    zt3 zt3Var = new zt3(1, qxe.b(q8));
                    zt3Var.s();
                    int i3 = 4;
                    bg3.A(vjpVar.f, ServiceCommand.TYPE_GET, 30000, new qdc(i3, new P8(zt3Var), new z7l(3)));
                    obj = zt3Var.q();
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                String str = ((vz7) obj).b;
                str.getClass();
                return str;
            }
        }
        q8 = new Q8(this, cg6Var);
        Object obj2 = q8.a;
        nm6 nm6Var2 = nm6.a;
        i = q8.c;
        if (i != 0) {
        }
        String str2 = ((vz7) obj2).b;
        str2.getClass();
        return str2;
    }
}
