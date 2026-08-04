package com.gamericefishpro.space.za;

import com.gamericefishpro.space.hj.c;
import com.gamericefishpro.space.n9.f2;
import com.gamericefishpro.space.ua.b;
import com.gamericefishpro.space.ua.d;
import com.gamericefishpro.space.ua.f;
import com.gamericefishpro.space.ua.h;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final h a;
    public static final h b;
    public static final h c;

    static {
        int i = f.i;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        f.l(15, objArr);
        b bVar = d.e;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        c.l(7, objArr2);
        a = d.h(7, objArr2);
        Object[] objArr3 = {"auto", "app", "am"};
        c.l(3, objArr3);
        b = d.h(3, objArr3);
        Object[] objArr4 = {"_r", "_dbg"};
        c.l(2, objArr4);
        c = d.h(2, objArr4);
        com.gamericefishpro.space.a.a.e(4, "initialCapacity");
        String[] strArr = f2.i;
        c.l(15, strArr);
        Object[] objArrCopyOf = Arrays.copyOf(new Object[4], com.gamericefishpro.space.d9.h.u(4, 15));
        System.arraycopy(strArr, 0, objArrCopyOf, 0, 15);
        String[] strArr2 = f2.j;
        c.l(15, strArr2);
        if (objArrCopyOf.length < 30) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, com.gamericefishpro.space.d9.h.u(objArrCopyOf.length, 30));
        }
        System.arraycopy(strArr2, 0, objArrCopyOf, 15, 15);
        d.h(30, objArrCopyOf);
        Object[] objArr5 = {"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"};
        c.l(2, objArr5);
        d.h(2, objArr5);
    }
}
