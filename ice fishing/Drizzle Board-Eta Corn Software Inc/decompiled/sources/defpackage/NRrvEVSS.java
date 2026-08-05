package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
@vv("activity")
/* loaded from: classes.dex */
public class NRrvEVSS extends wv {
    public final Context MdtA4re8;
    public final Activity wxUZMvaN;

    public NRrvEVSS(Context context) {
        Object obj;
        this.MdtA4re8 = context;
        Iterator it = l60.RXQxj5Oe(context, new tKaxLBvG(0)).iterator();
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
        this.wxUZMvaN = (Activity) obj;
    }

    @Override // defpackage.wv
    public final pu MdtA4re8(pu puVar, Bundle bundle, xu xuVar) {
        Intent intent;
        int intExtra;
        QhQjwNAr qhQjwNAr = (QhQjwNAr) puVar;
        VM67d7Sv vM67d7Sv = qhQjwNAr.MdtA4re8;
        if (qhQjwNAr.Qr9iLBAD == null) {
            throw new IllegalStateException(("Destination " + vM67d7Sv.qoPGr6Ce + " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(qhQjwNAr.Qr9iLBAD);
        if (bundle != null) {
            intent2.putExtras(bundle);
            String str = qhQjwNAr.jb9XjC4I;
            if (str != null && str.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    String group = matcher.group(1);
                    group.getClass();
                    if (!bundle.containsKey(group)) {
                        throw new IllegalArgumentException(("Could not find " + group + " in " + bundle + " to fill data pattern " + str).toString());
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    tt ttVar = (tt) qhQjwNAr.wxUZMvaN().get(group);
                    ev evVar = ttVar != null ? ttVar.qoPGr6Ce : null;
                    stringBuffer.append(evVar != null ? evVar.P7K7Inc8(evVar.qoPGr6Ce(group, bundle)) : Uri.encode(String.valueOf(bundle.get(group))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        Activity activity = this.wxUZMvaN;
        if (activity == null) {
            intent2.addFlags(268435456);
        }
        if (xuVar != null && xuVar.qoPGr6Ce) {
            intent2.addFlags(536870912);
        }
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", vM67d7Sv.qoPGr6Ce);
        Context context = this.MdtA4re8;
        Resources resources = context.getResources();
        if (xuVar != null) {
            int i = xuVar.Qr9iLBAD;
            int i2 = xuVar.jb9XjC4I;
            if ((i <= 0 || !fn.qoPGr6Ce(resources.getResourceTypeName(i), "animator")) && (i2 <= 0 || !fn.qoPGr6Ce(resources.getResourceTypeName(i2), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i2).getClass();
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i) + " and popExit resource " + resources.getResourceName(i2) + " when launching " + qhQjwNAr);
            }
        }
        context.startActivity(intent2);
        if (xuVar != null && activity != null) {
            int i3 = xuVar.P7K7Inc8;
            int i4 = xuVar.b2ZJblxo;
            if ((i3 > 0 && fn.qoPGr6Ce(resources.getResourceTypeName(i3), "animator")) || (i4 > 0 && fn.qoPGr6Ce(resources.getResourceTypeName(i4), "animator"))) {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i3) + " and exit resource " + resources.getResourceName(i4) + "when launching " + qhQjwNAr);
                return null;
            }
            if (i3 >= 0 || i4 >= 0) {
                if (i3 < 0) {
                    i3 = 0;
                }
                activity.overridePendingTransition(i3, i4 >= 0 ? i4 : 0);
            }
        }
        return null;
    }

    @Override // defpackage.wv
    public final boolean eVhOlqcC() {
        Activity activity = this.wxUZMvaN;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // defpackage.wv
    public final pu qoPGr6Ce() {
        return new QhQjwNAr(this);
    }
}
