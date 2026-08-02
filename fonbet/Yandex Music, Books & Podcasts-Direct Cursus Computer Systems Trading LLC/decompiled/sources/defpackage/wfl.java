package defpackage;

import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import okio.internal.a;

/* loaded from: classes4.dex */
public final class wfl implements mau {
    public static final boolean a(cak cakVar) {
        cak cakVar2 = a.e;
        pn3 pn3Var = cakVar.a;
        int n = pn3.n(pn3Var, h.a);
        if (n == -1) {
            n = pn3.n(cakVar.a, h.b);
        }
        if (n != -1) {
            pn3Var = pn3.r(pn3Var, n + 1, 0, 2);
        } else if (cakVar.e() != null && pn3Var.d() == 2) {
            pn3Var = pn3.d;
        }
        return !c.n(pn3Var.u(), ".class", true);
    }

    public static ksp b(String str) {
        Object obj = null;
        if (str == null) {
            return null;
        }
        rdb rdbVar = ksp.i;
        rdbVar.getClass();
        c7 c7Var = new c7(0, rdbVar);
        while (true) {
            if (!c7Var.hasNext()) {
                break;
            }
            Object next = c7Var.next();
            if (Intrinsics.d(((ksp) next).name(), str)) {
                obj = next;
                break;
            }
        }
        return (ksp) obj;
    }

    public static final CharSequence e(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @Override // defpackage.mau
    public void c(MediaExtractor mediaExtractor, Object obj) {
        mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // defpackage.mau
    public void d(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }
}
