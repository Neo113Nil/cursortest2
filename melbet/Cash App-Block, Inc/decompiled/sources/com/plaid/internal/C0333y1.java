package com.plaid.internal;

import com.plaid.internal.C0095a6;
import com.plaid.internal.N2;
import dagger.Lazy;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.text.Charsets;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.ThreadPoolDispatcherKt;
import kotlinx.serialization.json.Json;

/* renamed from: com.plaid.internal.y1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0333y1 implements Z2 {
    public final H5 a;
    public final Lazy b;
    public final ExecutorCoroutineDispatcher c;
    public N2 d;

    public C0333y1(H5 h5, Lazy lazy) {
        h5.getClass();
        lazy.getClass();
        this.a = h5;
        this.b = lazy;
        this.c = ThreadPoolDispatcherKt.newSingleThreadContext("LinkStateStoreThreadSafe");
    }

    public static final N2 b(C0333y1 c0333y1) {
        String readText;
        c0333y1.getClass();
        try {
            try {
                H5 h5 = c0333y1.a;
                h5.getClass();
                File filesDir = h5.a.getFilesDir();
                filesDir.getClass();
                if (!filesDir.exists()) {
                    filesDir.mkdirs();
                }
                File file = new File(filesDir, "plaid_link_state");
                if (!file.exists()) {
                    file.createNewFile();
                }
                readText = FilesKt__FileReadWriteKt.readText(file, Charsets.UTF_8);
            } catch (Exception e) {
                C0095a6.a.a(C0095a6.a, e);
                c0333y1.a.a();
            }
            if (readText.length() == 0) {
                c0333y1.a.a();
                return N2.j.b;
            }
            N2 n2 = (N2) ((Json) c0333y1.b.get()).decodeFromString(readText, N2.a.getValue());
            c0333y1.a.a();
            return n2;
        } catch (Throwable th) {
            c0333y1.a.a();
            throw th;
        }
    }

    @Override // com.plaid.internal.Z2
    public final Object a(N2 n2, ContinuationImpl continuationImpl) {
        Object withContext = JobKt.withContext(this.c, new C0324x1(n2, this, null), continuationImpl);
        return withContext == CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
    }

    @Override // com.plaid.internal.Z2
    public final Object a(ContinuationImpl continuationImpl) {
        return JobKt.withContext(this.c, new C0315w1(this, null), continuationImpl);
    }

    public static final void b(C0333y1 c0333y1, N2 n2) {
        c0333y1.getClass();
        if (n2 instanceof N2.b) {
            return;
        }
        c0333y1.a.a("plaid_link_state", ((Json) c0333y1.b.get()).encodeToString(N2.a.getValue(), n2));
    }
}
