package com.gamericefishpro.space;

import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import com.appsflyer.AppsFlyerLib;
import com.gamericefishpro.space.a7.d;
import com.gamericefishpro.space.b1.h;
import com.gamericefishpro.space.d.k;
import com.gamericefishpro.space.e7.g;
import com.gamericefishpro.space.i2.a1;
import com.gamericefishpro.space.oh.i;
import com.gamericefishpro.space.oh.j;
import com.gamericefishpro.space.vb.c;
import com.gamericefishpro.space.wa.b;
import com.gamericefishpro.space.z4.m0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class MainActivity extends k {
    public final Object M;
    public final Object N;

    public MainActivity() {
        j jVar = j.d;
        this.M = i.a(jVar, new d(0, this));
        this.N = i.a(jVar, new d(1, this));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
    @Override // com.gamericefishpro.space.d.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intrinsics.checkNotNullParameter(this, "<this>");
        (Build.VERSION.SDK_INT >= 31 ? new com.gamericefishpro.space.a4.d(this) : new c(this)).m();
        super.onCreate(bundle);
        b.N(getWindow(), false);
        AppsFlyerLib.getInstance().init("SyJCM6fH8F29LiDmvYhwNa", ((g) this.M.getValue()).d, this).setDebugLog(true);
        AppsFlyerLib.getInstance().start(this);
        h hVar = com.gamericefishpro.space.a7.b.a;
        ViewGroup.LayoutParams layoutParams = com.gamericefishpro.space.e.i.a;
        View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content)).getChildAt(0);
        a1 a1Var = childAt instanceof a1 ? (a1) childAt : null;
        if (a1Var != null) {
            a1Var.setParentCompositionContext(null);
            a1Var.setContent(hVar);
            return;
        }
        a1 a1Var2 = new a1(this);
        a1Var2.setParentCompositionContext(null);
        a1Var2.setContent(hVar);
        View decorView = getWindow().getDecorView();
        if (m0.e(decorView) == null) {
            m0.i(decorView, this);
        }
        if (m0.f(decorView) == null) {
            m0.j(decorView, this);
        }
        if (com.gamericefishpro.space.z5.g.b(decorView) == null) {
            com.gamericefishpro.space.z5.g.c(decorView, this);
        }
        setContentView(a1Var2, com.gamericefishpro.space.e.i.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        com.gamericefishpro.space.w7.b bVar = (com.gamericefishpro.space.w7.b) this.N.getValue();
        MediaPlayer mediaPlayer = bVar.b;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
        MediaPlayer mediaPlayer2 = bVar.b;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        bVar.b = null;
        SoundPool soundPool = bVar.c;
        if (soundPool != null) {
            soundPool.release();
        }
        bVar.c = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        com.gamericefishpro.space.w7.b bVar = (com.gamericefishpro.space.w7.b) this.N.getValue();
        bVar.f = false;
        MediaPlayer mediaPlayer = bVar.b;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
        CookieManager.getInstance().flush();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        com.gamericefishpro.space.w7.b bVar = (com.gamericefishpro.space.w7.b) this.N.getValue();
        bVar.f = true;
        bVar.b();
    }
}
