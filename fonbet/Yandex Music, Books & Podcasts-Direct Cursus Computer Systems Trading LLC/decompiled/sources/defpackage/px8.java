package defpackage;

import android.net.Uri;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class px8 implements uct {
    public final /* synthetic */ int a;
    public final Object b;

    public px8(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new JSONObject();
                break;
            case 2:
                this.b = new JSONArray();
                break;
            case 3:
                this.b = Uri.EMPTY;
                break;
            default:
                this.b = new vc7(0L, TimeZone.getDefault());
                break;
        }
    }

    @Override // defpackage.uct
    public final Object a() {
        switch (this.a) {
            case 0:
                return (vc7) this.b;
            case 1:
                return (JSONObject) this.b;
            case 2:
                return (JSONArray) this.b;
            default:
                return (Uri) this.b;
        }
    }

    @Override // defpackage.uct
    public final boolean b(Object obj) {
        switch (this.a) {
            case 0:
                return obj instanceof vc7;
            case 1:
                return obj instanceof JSONObject;
            case 2:
                return obj instanceof JSONArray;
            default:
                return obj instanceof Uri;
        }
    }
}
