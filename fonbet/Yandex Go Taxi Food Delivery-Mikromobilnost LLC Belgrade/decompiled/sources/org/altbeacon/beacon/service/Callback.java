package org.altbeacon.beacon.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import defpackage.y7w;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.altbeacon.beacon.b;

/* loaded from: classes4.dex */
public class Callback implements Serializable {
    public static void a(Context context, Bundle bundle, String str) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context.getPackageName(), "org.altbeacon.beacon.BeaconIntentProcessor"));
        intent.putExtra(str, bundle);
        if (!b.j(context).p()) {
            new y7w();
            y7w.a(context, intent);
        } else {
            intent.getComponent();
            try {
                context.startService(intent);
            } catch (Exception unused) {
                intent.getComponent().flattenToString();
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
    }
}
