package defpackage;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes3.dex */
public abstract class vn {
    static {
        fo[] foVarArr = {new fo(1, un.class)};
        HashMap hashMap = new HashMap();
        fo foVar = foVarArr[0];
        boolean containsKey = hashMap.containsKey(foVar.a);
        Class cls = foVar.a;
        if (containsKey) {
            xq0.x(tlm.i(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        hashMap.put(cls, foVar);
        Class cls2 = foVarArr[0].a;
        Collections.unmodifiableMap(hashMap);
        fo[] foVarArr2 = {new fo(4, un.class)};
        HashMap hashMap2 = new HashMap();
        fo foVar2 = foVarArr2[0];
        boolean containsKey2 = hashMap2.containsKey(foVar2.a);
        Class cls3 = foVar2.a;
        if (containsKey2) {
            xq0.x(tlm.i(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        hashMap2.put(cls3, foVar2);
        Class cls4 = foVarArr2[0].a;
        Collections.unmodifiableMap(hashMap2);
        fo[] foVarArr3 = {new fo(5, un.class)};
        HashMap hashMap3 = new HashMap();
        fo foVar3 = foVarArr3[0];
        boolean containsKey3 = hashMap3.containsKey(foVar3.a);
        Class cls5 = foVar3.a;
        if (containsKey3) {
            xq0.x(tlm.i(cls5, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        hashMap3.put(cls5, foVar3);
        Class cls6 = foVarArr3[0].a;
        Collections.unmodifiableMap(hashMap3);
        fo[] foVarArr4 = {new fo(3, un.class)};
        HashMap hashMap4 = new HashMap();
        fo foVar4 = foVarArr4[0];
        boolean containsKey4 = hashMap4.containsKey(foVar4.a);
        Class cls7 = foVar4.a;
        if (containsKey4) {
            xq0.x(tlm.i(cls7, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        hashMap4.put(cls7, foVar4);
        Class cls8 = foVarArr4[0].a;
        Collections.unmodifiableMap(hashMap4);
        fo[] foVarArr5 = {new fo(9, un.class)};
        HashMap hashMap5 = new HashMap();
        fo foVar5 = foVarArr5[0];
        boolean containsKey5 = hashMap5.containsKey(foVar5.a);
        Class cls9 = foVar5.a;
        if (containsKey5) {
            xq0.x(tlm.i(cls9, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        hashMap5.put(cls9, foVar5);
        Class cls10 = foVarArr5[0].a;
        Collections.unmodifiableMap(hashMap5);
        fo[] foVarArr6 = {new fo(10, un.class)};
        HashMap hashMap6 = new HashMap();
        fo foVar6 = foVarArr6[0];
        boolean containsKey6 = hashMap6.containsKey(foVar6.a);
        Class cls11 = foVar6.a;
        if (containsKey6) {
            xq0.x(tlm.i(cls11, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        hashMap6.put(cls11, foVar6);
        Class cls12 = foVarArr6[0].a;
        Collections.unmodifiableMap(hashMap6);
        fo[] foVarArr7 = {new fo(7, un.class)};
        HashMap hashMap7 = new HashMap();
        fo foVar7 = foVarArr7[0];
        boolean containsKey7 = hashMap7.containsKey(foVar7.a);
        Class cls13 = foVar7.a;
        if (containsKey7) {
            xq0.x(tlm.i(cls13, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        hashMap7.put(cls13, foVar7);
        Class cls14 = foVarArr7[0].a;
        Collections.unmodifiableMap(hashMap7);
        fo[] foVarArr8 = {new fo(11, un.class)};
        HashMap hashMap8 = new HashMap();
        fo foVar8 = foVarArr8[0];
        boolean containsKey8 = hashMap8.containsKey(foVar8.a);
        Class cls15 = foVar8.a;
        if (containsKey8) {
            xq0.x(tlm.i(cls15, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        hashMap8.put(cls15, foVar8);
        Class cls16 = foVarArr8[0].a;
        Collections.unmodifiableMap(hashMap8);
        int i = osn.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        r4h.a();
        Class<ko> cls = ko.class;
        msn.f(new ho(cls, new fo[]{new fo(1, un.class)}, 1), true);
        msn.f(new ho(uo.class, new fo[]{new fo(3, un.class)}, 2), true);
        msn.f(new ho(zo.class, new fo[]{new fo(4, un.class)}, 3), true);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            msn.f(new ho(ep.class, new fo[]{new fo(5, un.class)}, 4), true);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        msn.f(new ho(qa4.class, new fo[]{new fo(7, un.class)}, 6), true);
        msn.f(new ho(vhf.class, new fo[]{new fo(9, un.class)}, 8), true);
        msn.f(new ho(aif.class, new fo[]{new fo(10, un.class)}, 9), true);
        msn.f(new ho(w6w.class, new fo[]{new fo(11, un.class)}, 10), true);
        msn.g(new xn());
    }
}
