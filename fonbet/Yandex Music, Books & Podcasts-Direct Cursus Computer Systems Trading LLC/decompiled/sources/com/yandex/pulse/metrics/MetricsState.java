package com.yandex.pulse.metrics;

import android.os.SystemClock;
import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.pulse.histogram.ComponentHistograms;
import defpackage.b5i;
import defpackage.lyd;
import defpackage.php;
import defpackage.uo7;
import defpackage.xav;
import defpackage.xee;
import defpackage.y2x;
import defpackage.zav;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.zip.CRC32;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/pulse/metrics/MetricsState;", "", "Lxav;", "handlerCallback", "Lxav;", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class MetricsState {
    public static final lyd f = y2x.y(3, "MetricsState.LoadStatus");
    public static final lyd g;
    public static final lyd h;
    public static final lyd i;
    public final File a;
    public final zav b;
    public final php c;
    public final b5i d;
    public boolean e;

    @Keep
    @NotNull
    private final xav handlerCallback;

    static {
        Object obj = ComponentHistograms.b;
        g = xee.B().b("MetricsState.LoadTimes", (int) 1, (int) 10000, 50);
        h = xee.B().b("MetricsState.LoadSize", 1, 2048, 50);
        i = y2x.y(2, "MetricsState.StoreStatus");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MetricsState(File file, Executor executor) {
        FileInputStream fileInputStream;
        l lVar;
        b5i b5iVar;
        long elapsedRealtime;
        lyd lydVar = f;
        executor.getClass();
        File file2 = new File(file, "metrics_state");
        this.a = file2;
        uo7 uo7Var = new uo7(2, this);
        this.handlerCallback = uo7Var;
        this.b = new zav(uo7Var);
        this.c = new php(executor);
        try {
            elapsedRealtime = SystemClock.elapsedRealtime();
            fileInputStream = new FileInputStream(file2);
        } catch (Throwable th) {
            th = th;
            fileInputStream = null;
        }
        try {
            byte[] bArr = new byte[1024];
            int read = fileInputStream.read(bArr);
            int i2 = 8;
            if (read < 8) {
                throw new IOException("File to small");
            }
            long j = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).getLong();
            int i3 = read - 8;
            CRC32 crc32 = new CRC32();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (i3 >= 0) {
                crc32.update(bArr, i2, i3);
                byteArrayOutputStream.write(bArr, i2, i3);
                i3 = fileInputStream.read(bArr);
                i2 = 0;
            }
            if (crc32.getValue() != j) {
                lydVar.b(1);
                try {
                    fileInputStream.close();
                } catch (FileNotFoundException | IOException unused) {
                }
                lVar = null;
                b5iVar = lVar != null ? (b5i) lVar.m30toBuilder() : null;
                if (b5iVar == null) {
                    b5iVar = l.newBuilder();
                    b5iVar.getClass();
                }
                this.d = b5iVar;
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            lVar = l.parseFrom(byteArray);
            lydVar.b(0);
            g.c(SystemClock.elapsedRealtime() - elapsedRealtime, TimeUnit.MILLISECONDS);
            h.b(byteArray.length / 1024);
            try {
                fileInputStream.close();
            } catch (IOException unused2) {
            }
            if (lVar != null) {
            }
            if (b5iVar == null) {
            }
            this.d = b5iVar;
        } catch (Throwable th2) {
            th = th2;
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException unused3) {
                }
            }
            try {
                throw th;
            } catch (IOException unused4) {
                lydVar.b(2);
            }
        }
    }

    public final void a() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.b.sendEmptyMessageDelayed(0, 10000L);
    }
}
