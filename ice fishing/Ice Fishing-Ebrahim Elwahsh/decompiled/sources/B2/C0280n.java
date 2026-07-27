package B2;

import android.os.RemoteException;
import android.util.JsonWriter;
import q2.InterfaceC4900l0;

/* renamed from: B2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0280n implements u2.e, y0.d {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f287n;

    /* renamed from: u, reason: collision with root package name */
    public String f288u;

    @Override // y0.d
    public String b() {
        return this.f288u;
    }

    @Override // u2.e
    public /* synthetic */ void h(JsonWriter jsonWriter) {
        Object obj = u2.f.f41231b;
        jsonWriter.name("params").beginObject();
        String str = this.f288u;
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    public String toString() {
        switch (this.f287n) {
            case 1:
                return this.f288u;
            default:
                return super.toString();
        }
    }

    public C0280n(String query, int i) {
        this.f287n = i;
        switch (i) {
            case 3:
                kotlin.jvm.internal.h.e(query, "query");
                this.f288u = query;
                break;
            default:
                this.f288u = query;
                break;
        }
    }

    public C0280n(InterfaceC4900l0 interfaceC4900l0) {
        String str;
        this.f287n = 1;
        try {
            str = interfaceC4900l0.c();
        } catch (RemoteException e6) {
            u2.i.d("", e6);
            str = null;
        }
        this.f288u = str;
    }

    @Override // y0.d
    public void g(y0.c cVar) {
    }
}
