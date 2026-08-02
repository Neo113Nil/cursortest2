package ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import defpackage.sls;
import defpackage.yys0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class SmartCameraScreen$getView$1$1$1$1$2$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        Context a = ((yys0) this.receiver).c.a();
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", a.getPackageName(), null));
        if (intent.resolveActivity(a.getPackageManager()) != null) {
            try {
                a.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                intent.toString();
            }
        }
        return zy11.a;
    }
}
