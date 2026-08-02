package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraService;
import defpackage.uif;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/x8;", CameraService.RESULT, "", "invoke", "(Lru/kinopoisk/sdk/easylogin/internal/x8;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class EasyLoginActivity$onCreate$1 extends uif implements Function1<InterfaceC1287x8, Boolean> {
    final /* synthetic */ EasyLoginActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EasyLoginActivity$onCreate$1(EasyLoginActivity easyLoginActivity) {
        super(1);
        this.this$0 = easyLoginActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(InterfaceC1287x8 interfaceC1287x8) {
        boolean z;
        interfaceC1287x8.getClass();
        if (interfaceC1287x8 instanceof S9) {
            this.this$0.setResult(-1);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
