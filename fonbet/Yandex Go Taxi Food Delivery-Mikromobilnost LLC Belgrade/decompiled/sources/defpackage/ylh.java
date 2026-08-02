package defpackage;

import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class ylh extends ctx0 {
    public final Object a = new Object();
    public final ExecutorService b = Executors.newFixedThreadPool(4, new wlh());
    public volatile Handler c;
}
