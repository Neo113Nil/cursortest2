package w2;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import java.util.Objects;
import r2.C4906k;

/* renamed from: w2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5149i implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f41674n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f41675u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f41676v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f41677w;

    public RunnableC5149i(j jVar, Context context, String str, boolean z6, boolean z9) {
        this.f41674n = context;
        this.f41675u = str;
        this.f41676v = z6;
        this.f41677w = z9;
        Objects.requireNonNull(jVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        D d9 = C4906k.f40186C.f40191c;
        Context context = this.f41674n;
        AlertDialog.Builder k9 = D.k(context);
        k9.setMessage(this.f41675u);
        if (this.f41676v) {
            k9.setTitle("Error");
        } else {
            k9.setTitle("Info");
        }
        if (this.f41677w) {
            k9.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            k9.setPositiveButton("Learn More", new com.IceFishing.LiveIceFishing.E(this, context));
            k9.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        k9.create().show();
    }
}
