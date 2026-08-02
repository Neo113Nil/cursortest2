package com.squareup.cash.fileupload.real;

import android.content.Context;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.storage.AndroidFileProvider;
import com.squareup.cash.storage.Storage;
import com.squareup.cash.work.presenters.RealYouPresenter$MetroFactory;

/* loaded from: classes.dex */
public final class RealImageFormatConverter$Factory$Impl {
    public final RealYouPresenter$MetroFactory delegateFactory;

    public RealImageFormatConverter$Factory$Impl(RealYouPresenter$MetroFactory realYouPresenter$MetroFactory) {
        this.delegateFactory = realYouPresenter$MetroFactory;
    }

    public final EglCore create$1() {
        RealYouPresenter$MetroFactory realYouPresenter$MetroFactory = this.delegateFactory;
        Context context = (Context) realYouPresenter$MetroFactory.assignedJobProvider.invoke();
        AndroidFileProvider androidFileProvider = (AndroidFileProvider) realYouPresenter$MetroFactory.assignedLocationProvider.invoke();
        Storage storage = (Storage) realYouPresenter$MetroFactory.passcodeProvider.invoke();
        context.getClass();
        androidFileProvider.getClass();
        storage.getClass();
        return new EglCore(context, androidFileProvider, storage);
    }
}
