package com.squareup.cash.presenters;

import androidx.concurrent.futures.AbstractResolvableFuture;
import androidx.concurrent.futures.DirectExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.common.viewmodels.AvatarViewModel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.MerchantData;
import java.util.concurrent.ExecutionException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.guava.ListenableFutureKt$await$2$1;
import kotlinx.coroutines.guava.ToContinuation;

/* loaded from: classes6.dex */
public abstract class RecipientAvatars {
    public static final String avatarMonogramSource(String str, String str2) {
        String str3;
        String obj;
        if (str == null || (str3 = StringsKt.trim(str).toString()) == null || StringsKt.isBlank(str3)) {
            str3 = null;
        }
        if (str3 != null) {
            return str3;
        }
        if (str2 != null && (obj = StringsKt.trim(str2).toString()) != null) {
            if (StringsKt.isBlank(obj)) {
                obj = null;
            }
            if (obj != null) {
                int length = obj.length();
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    }
                    if (Character.isLetter(obj.charAt(i))) {
                        break;
                    }
                    i++;
                }
                return i > 0 ? obj.substring(i) : obj;
            }
        }
        return null;
    }

    public static final AvatarViewModel avatarViewModel(Recipient recipient) {
        Boolean bool;
        recipient.getClass();
        Image image = recipient.photo;
        ColorModel.Accented accented = new ColorModel.Accented(AccentColorsKt.getAccentColor(recipient));
        String str = recipient.displayName;
        String avatarMonogramSource = avatarMonogramSource(recipient.fullName, str);
        MerchantData merchantData = recipient.merchantData;
        return new AvatarViewModel(image, accented, str, avatarMonogramSource, merchantData != null ? Intrinsics.areEqual(merchantData.should_colorize_avatar, Boolean.TRUE) : false, (merchantData == null || (bool = merchantData.should_fill_background) == null) ? recipient.isCashCustomer : bool.booleanValue(), recipient.lookupKey, recipient.email, recipient.sms, (AvatarBadgeViewModel) null, (String) null, recipient.isFavorite, recipient.isSponsorAllowlisted, 19457);
    }

    public static final Object await(ListenableFuture listenableFuture, Continuation continuation) {
        try {
            if (listenableFuture.isDone()) {
                return AbstractResolvableFuture.getUninterruptibly(listenableFuture);
            }
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
            cancellableContinuationImpl.initCancellability();
            listenableFuture.addListener(new ToContinuation(listenableFuture, cancellableContinuationImpl, 1), DirectExecutor.INSTANCE);
            cancellableContinuationImpl.invokeOnCancellation(new ListenableFutureKt$await$2$1(listenableFuture, 1));
            Object result = cancellableContinuationImpl.getResult();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return result;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            throw cause;
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.DeprecatedViewBoostsPicker.deepLinkSpecs;
    }
}
