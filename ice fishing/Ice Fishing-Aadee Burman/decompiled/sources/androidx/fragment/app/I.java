package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import e.C4455a;
import f.AbstractC4494a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import u7.C5089g;
import v7.AbstractC5128i;
import v7.AbstractC5131l;

/* loaded from: classes.dex */
public final class I extends AbstractC4494a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4833a;

    public /* synthetic */ I(int i) {
        this.f4833a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.AbstractC4494a
    public final Intent a(Context context, Parcelable parcelable) {
        Bundle bundleExtra;
        switch (this.f4833a) {
            case 0:
                e.j jVar = (e.j) parcelable;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = jVar.f37099u;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        jVar = new e.j(jVar.f37098n, null, jVar.f37100v, jVar.f37101w);
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
    @Override // f.AbstractC4494a
    public I0.j b(Context context, Parcelable parcelable) {
        switch (this.f4833a) {
            case 1:
                String[] input = (String[]) parcelable;
                kotlin.jvm.internal.h.e(input, "input");
                if (input.length == 0) {
                    return new I0.j(24, v7.q.f41440n);
                }
                for (String str : input) {
                    if (E.e.a(context, str) != 0) {
                        return null;
                    }
                }
                int P8 = v7.t.P(input.length);
                if (P8 < 16) {
                    P8 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(P8);
                for (String str2 : input) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new I0.j(24, linkedHashMap);
            default:
                return super.b(context, parcelable);
        }
    }

    @Override // f.AbstractC4494a
    public final Object c(int i, Intent intent) {
        switch (this.f4833a) {
            case 0:
                return new C4455a(i, intent);
            case 1:
                v7.q qVar = v7.q.f41440n;
                if (i != -1 || intent == null) {
                    return qVar;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return qVar;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i6 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i6 == 0));
                }
                ArrayList w6 = AbstractC5128i.w(stringArrayExtra);
                Iterator it = w6.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(AbstractC5131l.y(w6, 10), AbstractC5131l.y(arrayList, 10)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new C5089g(it.next(), it2.next()));
                }
                return v7.t.T(arrayList2);
            default:
                return new C4455a(i, intent);
        }
    }
}
