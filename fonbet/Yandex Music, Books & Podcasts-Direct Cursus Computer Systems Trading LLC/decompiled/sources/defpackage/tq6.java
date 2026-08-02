package defpackage;

import android.util.Log;
import com.connectsdk.service.NetcastTVService;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class tq6 {
    public static final Charset e = Charset.forName("UTF-8");
    public static final int f = 15;
    public static final sq6 g = new sq6();
    public static final mj h = new mj(7);
    public static final cp6 i = new cp6(2);
    public final AtomicInteger a = new AtomicInteger(0);
    public final jac b;
    public final hgp c;
    public final dp6 d;

    public tq6(jac jacVar, hgp hgpVar, dp6 dp6Var) {
        this.b = jacVar;
        this.c = hgpVar;
        this.d = dp6Var;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) {
        byte[] bArr = new byte[RemoteCameraConfig.Notification.ID];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void f(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        jac jacVar = this.b;
        arrayList.addAll(jac.r(((File) jacVar.f).listFiles()));
        arrayList.addAll(jac.r(((File) jacVar.g).listFiles()));
        mj mjVar = h;
        Collections.sort(arrayList, mjVar);
        List r = jac.r(((File) jacVar.e).listFiles());
        Collections.sort(r, mjVar);
        arrayList.addAll(r);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(jac.r(((File) this.b.d).list())).descendingSet();
    }

    public final void d(kq6 kq6Var, String str, boolean z) {
        jac jacVar = this.b;
        int i2 = this.c.l().a.b;
        g.getClass();
        try {
            f(jacVar.k(str, hrg.q(NetcastTVService.UDAP_API_EVENT, String.format(Locale.US, "%010d", Integer.valueOf(this.a.getAndIncrement())), z ? "_" : "")), sq6.a.n(kq6Var));
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e2);
        }
        cp6 cp6Var = new cp6(3);
        jacVar.getClass();
        File file = new File((File) jacVar.d, str);
        file.mkdirs();
        List<File> r = jac.r(file.listFiles(cp6Var));
        Collections.sort(r, new mj(8));
        int size = r.size();
        for (File file2 : r) {
            if (size <= i2) {
                return;
            }
            jac.q(file2);
            size--;
        }
    }
}
