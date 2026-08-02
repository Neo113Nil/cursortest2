package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DeviceKey;
import com.braze.enums.SdkFlavor;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class l4 extends i2 {
    public lb l;
    public SdkFlavor m;
    public mb n;
    public l1 o;
    public EnumSet p;
    public String q;
    public String r;
    public final c9 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(ue ueVar, String str, lb lbVar) {
        super(new kd(Recorder$$ExternalSyntheticOutline2.m$1(str, "data"), false), (String) null, ueVar, 10);
        ueVar.getClass();
        str.getClass();
        lbVar.getClass();
        this.l = lbVar;
        this.s = c9.f;
    }

    public static final String l() {
        return "Remote notifications enabled field set on request, but push token field not set. Not sending remote notifications enabled field.";
    }

    public static final String m() {
        return "Experienced JSONException while retrieving parameters. Returning empty object.";
    }

    public static final String n() {
        return "Trigger dispatch completed. Alerting subscribers.";
    }

    @Override // bo.app.i2, bo.app.d9
    public final JSONObject a() {
        String str;
        mb mbVar;
        x4 x4Var = this.j;
        if (x4Var == null || !x4Var.getJsonObject().has(DeviceKey.NOTIFICATIONS_ENABLED.getKey()) || ((mbVar = this.n) != null && mbVar.a.has(DataStoreKey.PUSH_TOKEN.getKey()))) {
            x4 x4Var2 = this.j;
            if (x4Var2 != null) {
                x4Var2.m = true;
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda0(5), 7, (Object) null);
            x4 x4Var3 = this.j;
            if (x4Var3 != null) {
                x4Var3.m = false;
            }
        }
        JSONObject a = super.a();
        if (a == null) {
            return null;
        }
        try {
            String str2 = this.q;
            if (str2 != null) {
                a.put("app_version", str2);
            }
            String str3 = this.r;
            if (str3 != null && !StringsKt.isBlank(str3)) {
                a.put("app_version_code", this.r);
            }
            mb mbVar2 = this.n;
            if (mbVar2 != null && !mbVar2.isEmpty()) {
                JSONArray jSONArray = mbVar2.b;
                jSONArray.getClass();
                a.put("attributes", jSONArray);
            }
            l1 l1Var = this.o;
            if (l1Var != null && !l1Var.b) {
                a.put("events", JsonUtils.constructJsonArray(l1Var.a));
            }
            SdkFlavor sdkFlavor = this.m;
            if (sdkFlavor != null) {
                a.put("sdk_flavor", sdkFlavor.getJsonObject());
            }
            EnumSet<BrazeSdkMetadata> enumSet = this.p;
            if (enumSet != null) {
                BrazeSdkMetadata.Companion.getClass();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(enumSet, 10));
                for (BrazeSdkMetadata brazeSdkMetadata : enumSet) {
                    brazeSdkMetadata.getClass();
                    str = brazeSdkMetadata.jsonKey;
                    arrayList.add(str);
                }
                a.put("sdk_metadata", new JSONArray((Collection) CollectionsKt.sorted(arrayList)));
            }
            a.put("respond_with", this.l.getJsonObject());
            return a;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new l$$ExternalSyntheticLambda0(6), 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.i2, bo.app.r9
    public final void b(r7 r7Var) {
        r7Var.getClass();
        if (this.l.b()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda0(7), 7, (Object) null);
            r7Var.b(new dg(this), dg.class);
        }
    }

    @Override // bo.app.d9
    public final boolean c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.j);
        arrayList.add(this.n);
        arrayList.add(this.o);
        arrayList.add(this.l);
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                l9 l9Var = (l9) obj;
                if (l9Var != null && !l9Var.isEmpty()) {
                    break;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.j);
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            l9 l9Var2 = (l9) obj2;
            if (l9Var2 != null && !l9Var2.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // bo.app.d9
    public final c9 b() {
        return this.s;
    }

    @Override // bo.app.i2, bo.app.r9
    public final void a(r7 r7Var) {
        r7Var.getClass();
        if (this.l.b()) {
            r7Var.b(new eg(this), eg.class);
        }
    }

    @Override // bo.app.i2, bo.app.d9
    public final void a(HashMap hashMap) {
        hashMap.getClass();
        super.a(hashMap);
        if (!this.l.isEmpty() && this.l.b()) {
            hashMap.put("X-Braze-TriggersRequest", "true");
            hashMap.put("X-Braze-DataRequest", "true");
        }
    }
}
