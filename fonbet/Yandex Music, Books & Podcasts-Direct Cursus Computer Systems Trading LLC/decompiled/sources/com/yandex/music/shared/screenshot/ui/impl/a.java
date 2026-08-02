package com.yandex.music.shared.screenshot.ui.impl;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import defpackage.aur;
import defpackage.dfi;
import defpackage.fx1;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.v3w;
import defpackage.vvo;
import defpackage.xod;
import defpackage.xq0;
import defpackage.xqn;
import defpackage.yg0;
import defpackage.yvo;
import defpackage.zzp;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class a extends aur implements Function2 {
    public int j;
    public final /* synthetic */ xod k;
    public final /* synthetic */ xqn l;
    public final /* synthetic */ vvo m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(xod xodVar, xqn xqnVar, vvo vvoVar, Continuation continuation) {
        super(2, continuation);
        yvo[] yvoVarArr = yvo.a;
        this.k = xodVar;
        this.l = xqnVar;
        this.m = vvoVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        yvo[] yvoVarArr = yvo.a;
        return new a(this.k, this.l, this.m, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            this.j = 1;
            obj = this.k.j(this);
            if (obj == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        yvo[] yvoVarArr = yvo.a;
        Bitmap b = fx1.b((yg0) obj);
        vvo vvoVar = this.m;
        Context context = vvoVar.a;
        zzp zzpVar = vvoVar.b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", dfi.e(zzpVar.b(), "ya-music-", ".png"));
        contentValues.put("mime_type", "image/png");
        ContentResolver contentResolver = context.getContentResolver();
        Uri insert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        if (insert != null) {
            try {
                OutputStream openOutputStream = contentResolver.openOutputStream(insert);
                if (openOutputStream != null) {
                    try {
                        b.compress(Bitmap.CompressFormat.PNG, 100, openOutputStream);
                        openOutputStream.close();
                    } finally {
                    }
                }
            } catch (FileNotFoundException e) {
                v3w.l("Failed to compress the screenshot. Error: ", e.getMessage(), 6, "ScreenshotCreatorImpl", null);
            }
        }
        if (insert == null) {
            throw new ScreenshotSaveException("File could not be saved to gallery");
        }
        this.l.a = insert;
        return Unit.a;
    }
}
