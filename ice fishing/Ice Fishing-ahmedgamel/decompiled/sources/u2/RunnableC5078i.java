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
    public final /* synthetic */ Context f41284n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f41285u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f41286v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f41287w;

    public RunnableC5078i(j jVar, Context context, String str, boolean z3, boolean z6) {
        this.f41284n = context;
        this.f41285u = str;
        this.f41286v = z3;
        this.f41287w = z6;
        Objects.requireNonNull(jVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        D d2 = C4835j.f39733C.f39738c;
        Context context = this.f41284n;
        AlertDialog.Builder k9 = D.k(context);
        k9.setMessage(this.f41285u);
        if (this.f41286v) {
            k9.setTitle("Error");
        } else {
            k9.setTitle("Info");
        }
        if (this.f41287w) {
            k9.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            k9.setPositiveButton("Learn More", new com.icefishingapp.icefishing.D(this, context));
            k9.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        k9.create().show();
    }
}
