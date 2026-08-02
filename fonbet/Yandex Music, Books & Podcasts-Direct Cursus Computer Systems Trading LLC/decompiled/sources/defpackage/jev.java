package defpackage;

import android.webkit.DownloadListener;

/* loaded from: classes4.dex */
public final class jev implements DownloadListener {
    public final /* synthetic */ g4n a;

    public jev(g4n g4nVar) {
        this.a = g4nVar;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        str.getClass();
        this.a.a.invoke(str, str2, str3, str4, Long.valueOf(j));
    }
}
