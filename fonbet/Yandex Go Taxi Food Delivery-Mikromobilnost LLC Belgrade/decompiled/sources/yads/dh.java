package yads;

import android.app.ApplicationExitInfo;
import defpackage.cma1;
import defpackage.ji81;
import defpackage.mh;
import defpackage.tls;
import defpackage.z371;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class dh extends Lambda implements tls {
    public final /* synthetic */ z371 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh(z371 z371Var) {
        super(1);
        this.b = z371Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        InputStream traceInputStream;
        long timestamp;
        String description;
        int importance;
        int pid;
        long pss;
        long rss;
        String processName;
        int status;
        int realUid;
        ApplicationExitInfo g = mh.g(obj);
        this.b.getClass();
        try {
            traceInputStream = g.getTraceInputStream();
            if (traceInputStream == null) {
                return null;
            }
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(traceInputStream));
                try {
                    String x0 = cma1.x0(bufferedReader);
                    bufferedReader.close();
                    traceInputStream.close();
                    timestamp = g.getTimestamp();
                    description = g.getDescription();
                    if (description == null) {
                        description = "ANR";
                    }
                    importance = g.getImportance();
                    pid = g.getPid();
                    pss = g.getPss();
                    rss = g.getRss();
                    processName = g.getProcessName();
                    g.getReason();
                    status = g.getStatus();
                    realUid = g.getRealUid();
                    return new ji81(timestamp, description, x0, importance, pid, pss, rss, processName, status, realUid);
                } finally {
                }
            } finally {
            }
        } catch (Throwable unused) {
            return null;
        }
    }
}
