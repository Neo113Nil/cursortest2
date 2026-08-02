package defpackage;

import android.content.Context;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class h0j implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0j b;

    public /* synthetic */ h0j(i0j i0jVar, int i) {
        this.a = i;
        this.b = i0jVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        i0j i0jVar = this.b;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Context context = i0jVar.d;
                context.getClass();
                File file = new File(context.getDataDir(), "libsslMetrica");
                if (booleanValue) {
                    try {
                        r7o r7oVar = z7o.b;
                        File parentFile = file.getParentFile();
                        if (parentFile != null) {
                            parentFile.mkdirs();
                        }
                        file.createNewFile();
                    } catch (Throwable unused) {
                        r7o r7oVar2 = z7o.b;
                    }
                } else {
                    file.delete();
                }
                break;
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                Context context2 = i0jVar.d;
                context2.getClass();
                File file2 = new File(context2.getDataDir(), "libssl");
                if (booleanValue2) {
                    try {
                        r7o r7oVar3 = z7o.b;
                        File parentFile2 = file2.getParentFile();
                        if (parentFile2 != null) {
                            parentFile2.mkdirs();
                        }
                        file2.createNewFile();
                    } catch (Throwable unused2) {
                        r7o r7oVar4 = z7o.b;
                    }
                } else {
                    file2.delete();
                }
                break;
        }
        return Unit.a;
    }
}
