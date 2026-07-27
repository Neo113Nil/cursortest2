package u2;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import java.util.Objects;
import p2.C4835j;

/* renamed from: u2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5078i implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f41281n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f41282u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f41283v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f41284w;

    public RunnableC5078i(j jVar, Context context, String str, boolean z3, boolean z6) {
        this.f41281n = context;
        this.f41282u = str;
        this.f41283v = z3;
        this.f41284w = z6;
        Objects.requireNonNull(jVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        D d2 = C4835j.f39730C.f39735c;
        Context context = this.f41281n;
        AlertDialog.Builder k9 = D.k(context);
        k9.setMessage(this.f41282u);
        if (this.f41283v) {
            k9.setTitle("Error");
        } else {
            k9.setTitle("Info");
        }
        if (this.f41284w) {
            k9.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            k9.setPositiveButton("Learn More", new com.icefishing.icefishinglive2.D(this, context));
            k9.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        k9.create().show();
    }
}
