package com.watchfacestudio.turman;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.wear.remote.interactions.RemoteActivityHelper;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.Wearable;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class MainActivity extends AppCompatActivity {
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        ((ImageView) findViewById(R.id.image)).setOnClickListener(new View.OnClickListener() { // from class: com.watchfacestudio.turman.MainActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.this.m274lambda$onCreate$0$comwatchfacestudioturmanMainActivity(view);
            }
        });
    }

    /* renamed from: lambda$onCreate$0$com-watchfacestudio-turman-MainActivity, reason: not valid java name */
    /* synthetic */ void m274lambda$onCreate$0$comwatchfacestudioturmanMainActivity(View view) {
        launchPlayStoreOnWear();
    }

    private Node getConnectedNode() {
        Node node = null;
        try {
            for (Node node2 : (List) Tasks.await(Wearable.getNodeClient((Activity) this).getConnectedNodes())) {
                if (node2.isNearby()) {
                    node = node2;
                }
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        return node;
    }

    private void launchPlayStoreOnWear() {
        new Thread(new Runnable() { // from class: com.watchfacestudio.turman.MainActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.this.m273x6c4a47d9();
            }
        }).start();
    }

    /* renamed from: lambda$launchPlayStoreOnWear$1$com-watchfacestudio-turman-MainActivity, reason: not valid java name */
    /* synthetic */ void m273x6c4a47d9() {
        Looper.prepare();
        if (getConnectedNode() != null) {
            new RemoteActivityHelper(this, Executors.newSingleThreadExecutor()).startRemoteActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse("market://details?id=" + getPackageName())).addCategory("android.intent.category.BROWSABLE"));
            Toast.makeText(this, "Please check your watch", 1).show();
        } else {
            Toast.makeText(this, "No watch is connected", 1).show();
        }
    }
}
