package com.miteksystems.misnap.core.internal;

import com.miteksystems.misnap.core.LicenseStatus;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0082 ¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/miteksystems/misnap/core/internal/LicensingNativeWrapper;", "", "", "license", "featureName", "", "checkLicense", "(Ljava/lang/String;Ljava/lang/String;)Z", "checkIsExpired", "(Ljava/lang/String;)Z", "Lcom/miteksystems/misnap/core/LicenseStatus;", "checkLicenseStatus", "(Ljava/lang/String;Ljava/lang/String;)Lcom/miteksystems/misnap/core/LicenseStatus;", "core_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class LicensingNativeWrapper {
    private final native boolean checkIsExpired(String license);

    private final native boolean checkLicense(String license, String featureName);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: checkLicenseStatus, reason: merged with bridge method [inline-methods] */
    public final native LicenseStatus b(String license, String featureName);
}
