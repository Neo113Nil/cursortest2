package androidx.core.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class TaskStackBuilder implements Iterable<Intent> {
    public final ArrayList mIntents = new ArrayList();
    public final Context mSourceContext;

    /* loaded from: classes.dex */
    public interface SupportParentable {
        Intent getSupportParentActivityIntent();
    }

    public TaskStackBuilder(Context context) {
        this.mSourceContext = context;
    }

    public static TaskStackBuilder create(AppCompatActivity appCompatActivity) {
        return new TaskStackBuilder(appCompatActivity);
    }

    public final void addParentStack(ComponentName componentName) {
        Context context = this.mSourceContext;
        ArrayList arrayList = this.mIntents;
        int size = arrayList.size();
        try {
            for (Intent parentActivityIntent = NavUtils.getParentActivityIntent(context, componentName); parentActivityIntent != null; parentActivityIntent = NavUtils.getParentActivityIntent(context, parentActivityIntent.getComponent())) {
                arrayList.add(size, parentActivityIntent);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            Path$$ExternalSyntheticBUOutline0.m((Throwable) e);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Intent> iterator() {
        return this.mIntents.iterator();
    }

    public final void startActivities() {
        ArrayList arrayList = this.mIntents;
        if (arrayList.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$1("No intents added to TaskStackBuilder; cannot startActivities");
            return;
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.mSourceContext.startActivities(intentArr, null);
    }

    public final void addParentStack(AppCompatActivity appCompatActivity) {
        Intent supportParentActivityIntent = appCompatActivity.getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = NavUtils.getParentActivityIntent(appCompatActivity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.mSourceContext.getPackageManager());
            }
            addParentStack(component);
            this.mIntents.add(supportParentActivityIntent);
        }
    }
}
