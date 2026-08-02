package com.google.android.gms.internal.ads;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.google.android.gms.internal.ads.vA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4060vA {

    /* renamed from: a, reason: collision with root package name */
    public static final ClipData f35436a = ClipData.newIntent("", new Intent());

    public static Intent a(int i, Intent intent) {
        AbstractC2792Sd.q("Must set component on Intent.", intent.getComponent() != null);
        if (b(0, 1)) {
            AbstractC2792Sd.q("Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.", !b(i, 67108864));
        } else {
            AbstractC2792Sd.q("Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.", b(i, 67108864));
        }
        Intent intent2 = new Intent(intent);
        if (!b(i, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!b(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!b(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!b(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!b(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(f35436a);
            }
        }
        return intent2;
    }

    public static boolean b(int i, int i4) {
        return (i & i4) == i4;
    }
}
