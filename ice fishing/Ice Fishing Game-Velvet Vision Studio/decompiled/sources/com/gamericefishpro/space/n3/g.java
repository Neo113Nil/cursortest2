package com.gamericefishpro.space.n3;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.gamericefishpro.space.w.r1;
import com.gamericefishpro.space.w.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements com.gamericefishpro.space.t0.c, r1 {
    public int d;
    public int e;
    public final Object i;

    public g(Context context) {
        this.e = 0;
        this.i = context;
    }

    @Override // com.gamericefishpro.space.t0.c
    public void c(int i, Object obj) {
        ((com.gamericefishpro.space.t0.c) this.i).c(i + (this.e == 0 ? this.d : 0), obj);
    }

    @Override // com.gamericefishpro.space.t0.c
    public void d(Object obj) {
        this.e++;
        ((com.gamericefishpro.space.t0.c) this.i).d(obj);
    }

    @Override // com.gamericefishpro.space.t0.c
    public void e() {
        ((com.gamericefishpro.space.t0.c) this.i).e();
    }

    @Override // com.gamericefishpro.space.w.p1
    public com.gamericefishpro.space.w.o f(long j, com.gamericefishpro.space.w.o oVar, com.gamericefishpro.space.w.o oVar2, com.gamericefishpro.space.w.o oVar3) {
        return ((com.gamericefishpro.space.u6.n) this.i).f(j, oVar, oVar2, oVar3);
    }

    @Override // com.gamericefishpro.space.t0.c
    public void g(int i, Object obj) {
        ((com.gamericefishpro.space.t0.c) this.i).g(i + (this.e == 0 ? this.d : 0), obj);
    }

    @Override // com.gamericefishpro.space.t0.c
    public Object getCurrent() {
        return ((com.gamericefishpro.space.t0.c) this.i).getCurrent();
    }

    @Override // com.gamericefishpro.space.t0.c
    public void i(int i, int i2, int i3) {
        int i4 = this.e == 0 ? this.d : 0;
        ((com.gamericefishpro.space.t0.c) this.i).i(i + i4, i2 + i4, i3);
    }

    @Override // com.gamericefishpro.space.t0.c
    public void j(int i, int i2) {
        ((com.gamericefishpro.space.t0.c) this.i).j(i + (this.e == 0 ? this.d : 0), i2);
    }

    @Override // com.gamericefishpro.space.t0.c
    public void l() {
        if (!(this.e > 0)) {
            com.gamericefishpro.space.t0.s.a("OffsetApplier up called with no corresponding down");
        }
        this.e--;
        ((com.gamericefishpro.space.t0.c) this.i).l();
    }

    @Override // com.gamericefishpro.space.w.r1
    public int m() {
        return this.e;
    }

    @Override // com.gamericefishpro.space.t0.c
    public void n(Object obj, Function2 function2) {
        ((com.gamericefishpro.space.t0.c) this.i).n(obj, function2);
    }

    @Override // com.gamericefishpro.space.w.r1
    public int o() {
        return this.d;
    }

    public synchronized int p() {
        PackageInfo packageInfoE;
        if (this.d == 0) {
            try {
                packageInfoE = com.gamericefishpro.space.b9.c.a((Context) this.i).e(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfoE = null;
            }
            if (packageInfoE != null) {
                this.d = packageInfoE.versionCode;
            }
        }
        return this.d;
    }

    public synchronized int q() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        Context context = (Context) this.i;
        PackageManager packageManager = context.getPackageManager();
        if (com.gamericefishpro.space.b9.c.a(context).a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers != null && !listQueryBroadcastReceivers.isEmpty()) {
            this.e = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        this.e = 2;
        return 2;
    }

    @Override // com.gamericefishpro.space.w.p1
    public com.gamericefishpro.space.w.o r(long j, com.gamericefishpro.space.w.o oVar, com.gamericefishpro.space.w.o oVar2, com.gamericefishpro.space.w.o oVar3) {
        return ((com.gamericefishpro.space.u6.n) this.i).r(j, oVar, oVar2, oVar3);
    }

    public g(View view) {
        this.i = view;
    }

    public g(Context context, XmlResourceParser xmlResourceParser) {
        this.i = new ArrayList();
        this.e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.d = typedArrayObtainStyledAttributes.getResourceId(index, this.d);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.e);
                this.e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new o().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public g(com.gamericefishpro.space.t0.c cVar, int i) {
        this.i = cVar;
        this.d = i;
    }

    public g(int i, int i2, com.gamericefishpro.space.w.s sVar) {
        this.d = i;
        this.e = i2;
        this.i = new com.gamericefishpro.space.u6.n(new x(i, i2, sVar));
    }
}
