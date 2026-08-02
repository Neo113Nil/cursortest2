package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class og {
    public static final og a = new og();
    public static final String b = BrazeLogger.getBrazeLogTag((Class<?>) og.class);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static ArrayList a(JSONArray jSONArray) {
        jSONArray.getClass();
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new o8$$ExternalSyntheticLambda6(27), 12, (Object) null);
            } else {
                String string2 = optJSONObject.getString("type");
                if (string2 != null) {
                    switch (string2.hashCode()) {
                        case -1679221933:
                            if (string2.equals("purchase_property")) {
                                arrayList.add(new xb(optJSONObject));
                                break;
                            }
                            break;
                        case 3417674:
                            if (string2.equals("open")) {
                                arrayList.add(new gb());
                                break;
                            }
                            break;
                        case 3556498:
                            if (string2.equals("test")) {
                                arrayList.add(new tf());
                                break;
                            }
                            break;
                        case 447503464:
                            if (string2.equals("custom_event_property")) {
                                arrayList.add(new b4(optJSONObject));
                                break;
                            }
                            break;
                        case 717572172:
                            if (string2.equals("custom_event")) {
                                arrayList.add(new z3(optJSONObject));
                                break;
                            }
                            break;
                        case 1512893214:
                            if (string2.equals("iam_click")) {
                                arrayList.add(new ea(optJSONObject));
                                break;
                            }
                            break;
                        case 1743324417:
                            if (string2.equals("purchase")) {
                                arrayList.add(new vb(optJSONObject));
                                break;
                            }
                            break;
                        case 1926863907:
                            if (string2.equals("push_click")) {
                                arrayList.add(new zb(optJSONObject));
                                break;
                            }
                            break;
                    }
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new o6$$ExternalSyntheticLambda2(string2, 10), 12, (Object) null);
            }
        }
        return arrayList;
    }

    public static final String c(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Received unknown trigger type: ", str);
    }

    public final tg b(JSONObject jSONObject, e2 e2Var) {
        jSONObject.getClass();
        e2Var.getClass();
        try {
            String string2 = jSONObject.getString("type");
            if (Intrinsics.areEqual(string2, "inapp")) {
                return new oa(jSONObject, e2Var);
            }
            if (Intrinsics.areEqual(string2, "templated_iam")) {
                return new sf(jSONObject, e2Var);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new o6$$ExternalSyntheticLambda2(string2, 9), 6, (Object) null);
            return null;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new l$$ExternalSyntheticLambda2(jSONObject, 7), 8, (Object) null);
            return null;
        }
    }

    public static final String c() {
        return "Triggered actions Json array was null. Not de-serializing triggered actions.";
    }

    public static final String b(JSONArray jSONArray) {
        return "Failed to deserialize triggered actions Json array: " + jSONArray;
    }

    public static final String b(JSONObject jSONObject) {
        return "Failed to deserialize triggered action Json: " + jSONObject;
    }

    public static final String b() {
        return "Received null or blank trigger condition Json. Not parsing.";
    }

    public static final String b(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Received triggered condition Json with unknown type: ", str, ". Not parsing.");
    }

    public static final String a() {
        return "Templated message Json was null. Not de-serializing templated message.";
    }

    public static final String a(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Received templated message Json with unknown type: ", str, ". Not parsing.");
    }

    public static final String a(JSONObject jSONObject) {
        return "Encountered exception processing templated message: " + jSONObject;
    }

    public final ArrayList a(JSONArray jSONArray, e2 e2Var) {
        e2Var.getClass();
        try {
            if (jSONArray == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o8$$ExternalSyntheticLambda6(26), 14, (Object) null);
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                jSONObject.getClass();
                tg b2 = b(jSONObject, e2Var);
                if (b2 != null) {
                    arrayList.add(b2);
                }
            }
            return arrayList;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new og$$ExternalSyntheticLambda4(0, jSONArray), 8, (Object) null);
            return null;
        }
    }

    public static InAppMessageBase a(JSONObject jSONObject, e2 e2Var) {
        e2Var.getClass();
        try {
            if (jSONObject == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o8$$ExternalSyntheticLambda6(25), 14, (Object) null);
                return null;
            }
            String string2 = jSONObject.getString("type");
            if (Intrinsics.areEqual(string2, "inapp")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (jSONObject2 == null) {
                    return null;
                }
                return com.braze.support.i.a(jSONObject2, e2Var);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new o6$$ExternalSyntheticLambda2(string2, 8), 12, (Object) null);
            return null;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new l$$ExternalSyntheticLambda2(jSONObject, 6), 8, (Object) null);
            return null;
        }
    }
}
