package L3;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.util.Log;

/* loaded from: classes2.dex */
public final /* synthetic */ class v implements d3.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1738n;

    /* renamed from: u, reason: collision with root package name */
    public final String f1739u;

    public /* synthetic */ v(String str, int i) {
        this.f1738n = i;
        this.f1739u = str;
    }

    public void a(String str) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", this.f1739u + " : " + str);
        }
    }

    @Override // d3.c
    public Object c() {
        HandlerThread handlerThread = new HandlerThread(this.f1739u, 10);
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }

    public String toString() {
        switch (this.f1738n) {
            case 2:
                return this.f1739u;
            default:
                return super.toString();
        }
    }

    public v() {
        this.f1738n = 1;
        this.f1739u = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat("PhoneskyVerificationUtils");
    }
}
