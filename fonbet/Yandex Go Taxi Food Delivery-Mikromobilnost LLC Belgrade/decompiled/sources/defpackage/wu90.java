package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public final class wu90 extends xqt {
    public static final wu90 e = new wu90();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, su90.Companion.serializer(), qoi0.a(su90.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("default", su90.Companion.serializer(), qoi0.a(su90.class)), new f9("photo_verification_required", av90.Companion.serializer(), qoi0.a(av90.class)), new f9("photo_verification_with_passport_required", dv90.Companion.serializer(), qoi0.a(dv90.class)), new f9("driver_license_verification_required", vu90.Companion.serializer(), qoi0.a(vu90.class)));
    }
}
