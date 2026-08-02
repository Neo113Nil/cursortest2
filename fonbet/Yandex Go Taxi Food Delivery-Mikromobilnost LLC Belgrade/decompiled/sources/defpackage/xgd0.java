package defpackage;

import com.yandex.plus.pay.data.mb.dto.FamilyRoleDto;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class xgd0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FamilyRoleDto.values().length];
        try {
            iArr[FamilyRoleDto.PARENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FamilyRoleDto.CHILD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FamilyRoleDto.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
