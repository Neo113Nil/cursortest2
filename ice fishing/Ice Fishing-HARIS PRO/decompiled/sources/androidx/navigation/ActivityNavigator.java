package androidx.navigation;

import D1.i;
import J1.h;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import f0.C0134C;
import f0.C0136a;
import f0.C0137b;
import f0.M;
import f0.N;
import f0.w;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@M("activity")
/* loaded from: classes.dex */
public class ActivityNavigator extends N {

    /* renamed from: c, reason: collision with root package name */
    public final Context f2067c;

    /* renamed from: d, reason: collision with root package name */
    public final Activity f2068d;

    public ActivityNavigator(Context context) {
        Object obj;
        this.f2067c = context;
        Iterator it = h.f0(context, C0137b.f2901c).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.f2068d = (Activity) obj;
    }

    @Override // f0.N
    public final w a() {
        return new C0136a(this);
    }

    @Override // f0.N
    public final w c(w wVar, Bundle bundle, C0134C c0134c) {
        Intent intent;
        int intExtra;
        C0136a c0136a = (C0136a) wVar;
        if (c0136a.f2899k == null) {
            throw new IllegalStateException(("Destination " + c0136a.f2994h + " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(c0136a.f2899k);
        if (bundle != null) {
            intent2.putExtras(bundle);
            String str = c0136a.f2900l;
            if (str != null && str.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    String group = matcher.group(1);
                    if (!bundle.containsKey(group)) {
                        throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + str);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(String.valueOf(bundle.get(group))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        Activity activity = this.f2068d;
        if (activity == null) {
            intent2.addFlags(268435456);
        }
        if (c0134c != null && c0134c.f2860a) {
            intent2.addFlags(536870912);
        }
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", c0136a.f2994h);
        Context context = this.f2067c;
        Resources resources = context.getResources();
        if (c0134c != null) {
            int i = c0134c.f2866h;
            int i2 = c0134c.i;
            if ((i <= 0 || !i.a(resources.getResourceTypeName(i), "animator")) && (i2 <= 0 || !i.a(resources.getResourceTypeName(i2), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i2);
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i) + " and popExit resource " + resources.getResourceName(i2) + " when launching " + c0136a);
            }
        }
        context.startActivity(intent2);
        if (c0134c == null || activity == null) {
            return null;
        }
        int i3 = c0134c.f2864f;
        int i4 = c0134c.f2865g;
        if ((i3 <= 0 || !i.a(resources.getResourceTypeName(i3), "animator")) && (i4 <= 0 || !i.a(resources.getResourceTypeName(i4), "animator"))) {
            if (i3 < 0 && i4 < 0) {
                return null;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            activity.overridePendingTransition(i3, i4 >= 0 ? i4 : 0);
            return null;
        }
        Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i3) + " and exit resource " + resources.getResourceName(i4) + "when launching " + c0136a);
        return null;
    }

    @Override // f0.N
    public final boolean j() {
        Activity activity = this.f2068d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
