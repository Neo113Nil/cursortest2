package ru.CryptoPro.AdES.tools.revocation.permission;

import ru.CryptoPro.AdES.tools.revocation.data.ValidatingPermissionData;

/* loaded from: classes4.dex */
public interface RevocationPermission {
    boolean isAuthorizedIssuer(ValidatingPermissionData validatingPermissionData);
}
