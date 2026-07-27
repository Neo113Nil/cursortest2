package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import e.C4462a;
import f.AbstractC4485a;
import g1.C4524d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import q7.C4938g;
import r7.AbstractC4978i;
import r7.AbstractC4981l;

/* loaded from: classes.dex */
public final class I extends AbstractC4485a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4945a;

    public /* synthetic */ I(int i) {
        this.f4945a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.AbstractC4485a
    public final Intent a(Context context, Parcelable parcelable) {
        Bundle bundleExtra;
        switch (this.f4945a) {
            case 0:
                e.j jVar = (e.j) parcelable;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = jVar.f37230u;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        jVar = new e.j(jVar.f37229n, null, jVar.f37231v, jVar.f37232w);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", jVar);
                if (N.E(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
            case 1:
                String[] input = (String[]) parcelable;
                kotlin.jvm.internal.h.e(input, "input");
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
                kotlin.jvm.internal.h.d(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            default:
                Intent input2 = (Intent) parcelable;
                kotlin.jvm.internal.h.e(input2, "input");
                return input2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.AbstractC4485a
    public C4524d b(Context context, Parcelable parcelable) {
        switch (this.f4945a) {
            case 1:
                String[] input = (String[]) parcelable;
                kotlin.jvm.internal.h.e(input, "input");
                if (input.length == 0) {
                    return new C4524d(18, r7.q.f40359n);
                }
                for (String str : input) {
                    if (E.e.a(context, str) != 0) {
                        return null;
                    }
                }
                int z8 = r7.t.z(input.length);
                if (z8 < 16) {
                    z8 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(z8);
                for (String str2 : input) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new C4524d(18, linkedHashMap);
            default:
                return super.b(context, parcelable);
        }
    }

    @Override // f.AbstractC4485a
    public final Object c(int i, Intent intent) {
        switch (this.f4945a) {
            case 0:
                return new C4462a(i, intent);
            case 1:
                r7.q qVar = r7.q.f40359n;
                if (i != -1 || intent == null) {
                    return qVar;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return qVar;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i4 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i4 == 0));
                }
                ArrayList N8 = AbstractC4978i.N(stringArrayExtra);
                Iterator it = N8.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(AbstractC4981l.E(N8, 10), AbstractC4981l.E(arrayList, 10)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new C4938g(it.next(), it2.next()));
                }
                return r7.t.D(arrayList2);
            default:
                return new C4462a(i, intent);
        }
    }
}
