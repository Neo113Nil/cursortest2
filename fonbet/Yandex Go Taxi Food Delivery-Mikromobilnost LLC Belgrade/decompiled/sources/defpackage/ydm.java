package defpackage;

import android.content.Intent;
import com.yandex.go.drive.sdkintegration.presentation.DriveHostView;
import com.yandex.mobile.drive.sdk.DriveSdkView;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class ydm implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ DriveHostView b;

    public /* synthetic */ ydm(DriveHostView driveHostView, int i) {
        this.a = i;
        this.b = driveHostView;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        DriveSdkView driveSdkView;
        DriveSdkView driveSdkView2;
        DriveSdkView driveSdkView3;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        DriveHostView driveHostView = this.b;
        switch (i) {
            case 0:
                o0b0 o0b0Var = (o0b0) obj;
                driveSdkView = driveHostView.sdkView;
                driveSdkView.onRequestPermissionsResult(o0b0Var.a, o0b0Var.b, o0b0Var.c);
                break;
            case 1:
                r40 r40Var = (r40) obj;
                driveSdkView2 = driveHostView.sdkView;
                driveSdkView2.onActivityResult(r40Var.b, r40Var.a, r40Var.c);
                break;
            default:
                driveSdkView3 = driveHostView.sdkView;
                driveSdkView3.onNewIntent((Intent) obj);
                break;
        }
        return zy11Var;
    }
}
