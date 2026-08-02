package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final class p92 extends Fragment {
    public static final /* synthetic */ int d = 0;
    public int a;
    public o92 b;
    public boolean c;

    public final void a(Task task) {
        if (this.c) {
            return;
        }
        int i = 1;
        this.c = true;
        Activity activity = getActivity();
        activity.getFragmentManager().beginTransaction().remove(this).commit();
        int i2 = this.a;
        if (task == null) {
            q92.a(activity, i2, 0, new Intent());
            return;
        }
        int i3 = q92.b;
        if (activity.isFinishing()) {
            if (Log.isLoggable("AutoResolveHelper", 3)) {
                Log.d("AutoResolveHelper", "Ignoring task result for, Activity is finishing.");
                return;
            }
            return;
        }
        if (task.g() instanceof f2o) {
            try {
                PendingIntent pendingIntent = ((f2o) task.g()).a.c;
                if (pendingIntent == null) {
                    i = 0;
                }
                if (i == 0) {
                    return;
                }
                y1g.G(pendingIntent);
                activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i2, null, 0, 0, 0);
                return;
            } catch (IntentSender.SendIntentException e) {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    Log.e("AutoResolveHelper", "Error starting pending intent!", e);
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent();
        if (task.l()) {
            kek kekVar = (kek) task.h();
            kekVar.getClass();
            Parcel obtain = Parcel.obtain();
            kekVar.writeToParcel(obtain, 0);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            intent.putExtra("com.google.android.gms.wallet.PaymentData", marshall);
            i = -1;
        } else if (task.g() instanceof qo0) {
            qo0 qo0Var = (qo0) task.g();
            intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", new Status(qo0Var.a.a, qo0Var.getMessage(), null, null));
        } else {
            if (Log.isLoggable("AutoResolveHelper", 6)) {
                Log.e("AutoResolveHelper", "Unexpected non API exception!", task.g());
            }
            intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", new Status(8, "Unexpected non API exception when trying to deliver the task result to an activity!", null, null));
        }
        q92.a(activity, i2, i, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = getArguments().getInt("requestCode");
        if (q92.a != getArguments().getLong("initializationElapsedRealtime")) {
            this.b = null;
        } else {
            this.b = (o92) o92.e.get(getArguments().getInt("resolveCallId"));
        }
        this.c = bundle != null && bundle.getBoolean("delivered");
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        o92 o92Var = this.b;
        if (o92Var == null || o92Var.b != this) {
            return;
        }
        o92Var.b = null;
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        o92 o92Var = this.b;
        if (o92Var != null) {
            o92Var.b = this;
            o92Var.a();
        } else {
            if (Log.isLoggable("AutoResolveHelper", 5)) {
                Log.w("AutoResolveHelper", "Sending canceled result for garbage collected task!");
            }
            a(null);
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("delivered", this.c);
        o92 o92Var = this.b;
        if (o92Var == null || o92Var.b != this) {
            return;
        }
        o92Var.b = null;
    }
}
