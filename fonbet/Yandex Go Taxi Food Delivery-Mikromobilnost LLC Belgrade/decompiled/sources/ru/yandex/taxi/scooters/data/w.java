package ru.yandex.taxi.scooters.data;

import android.content.Context;
import android.net.Uri;
import defpackage.dvw;
import defpackage.j18;
import defpackage.qan0;
import defpackage.r1s;
import defpackage.s6k0;
import defpackage.s8v;
import defpackage.vtx0;
import defpackage.w8v;
import defpackage.zgz;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.data.ScootersPhotoLocationRepository;
import ru.yandex.taxi.scooters.domain.model.ScootersPhotoNotSavedException;

/* loaded from: classes6.dex */
public final class w {
    public final Context a;
    public final vtx0 b;
    public final ScootersPhotoLocationRepository c;

    public w(Context context, vtx0 vtx0Var, ScootersPhotoLocationRepository scootersPhotoLocationRepository) {
        this.a = context;
        this.b = vtx0Var;
        this.c = scootersPhotoLocationRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(qan0 qan0Var, ContinuationImpl continuationImpl) {
        Pair pair;
        j18 j18Var = new j18(1, dvw.b(continuationImpl));
        j18Var.u();
        Context context = this.a;
        ScootersPhotoLocationRepository.Format format = ScootersPhotoLocationRepository.Format.JPEG;
        this.c.getClass();
        try {
            pair = ScootersPhotoLocationRepository.a(context, format);
        } catch (FileNotFoundException e) {
            zgz.a(null, e);
            pair = null;
            if (pair != null) {
            }
            Object s = j18Var.s();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return s;
        } catch (NullPointerException e2) {
            zgz.a(null, e2);
            pair = null;
            if (pair != null) {
            }
            Object s2 = j18Var.s();
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            return s2;
        }
        if (pair != null) {
            Uri uri = (Uri) pair.getFirst();
            OutputStream outputStream = (OutputStream) pair.getSecond();
            r1s r1sVar = new r1s((File) null, outputStream, (s8v) null);
            ExecutorService executorService = this.b.a;
            s6k0 s6k0Var = new s6k0(outputStream, j18Var, uri);
            switch (qan0Var.a) {
                case 0:
                    ((ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.a) qan0Var.b).e(r1sVar, executorService, s6k0Var);
                    break;
                case 1:
                    ((ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.a) qan0Var.b).e(r1sVar, executorService, s6k0Var);
                    break;
                default:
                    ((w8v) qan0Var.b).O(r1sVar, executorService, s6k0Var);
                    break;
            }
        } else {
            j18Var.resumeWith(new Result.Failure(new ScootersPhotoNotSavedException()));
        }
        Object s22 = j18Var.s();
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s22;
    }
}
