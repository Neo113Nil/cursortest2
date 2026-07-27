package com.giderosmobile.android.plugins.iab;

import android.app.Activity;
import android.content.Intent;
import java.lang.ref.WeakReference;
import java.util.Hashtable;

/* loaded from: classes.dex */
public interface IabInterface {
    void check();

    void init(Object obj);

    void onActivityResult(int i, int i2, Intent intent);

    void onCreate(WeakReference<Activity> weakReference);

    void onDestroy();

    void onStart();

    void purchase(String str);

    void request(Hashtable<String, String> hashtable);

    void restore();
}
