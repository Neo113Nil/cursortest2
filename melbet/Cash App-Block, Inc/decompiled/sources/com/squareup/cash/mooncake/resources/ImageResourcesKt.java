package com.squareup.cash.mooncake.resources;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.PartialGapBuffer;
import androidx.compose.ui.text.TextRange;
import app.cash.arcade.values.ImageResource;
import coil3.size.SizeKt;
import com.fillr.e;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.arcade.Emojis;
import com.squareup.cash.arcade.Icons;
import com.squareup.kotterknife.Lazy;
import com.squareup.protos.cash.ui.Image;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.ranges.RangesKt___RangesKt;
import timber.log.Timber;

/* loaded from: classes5.dex */
public abstract class ImageResourcesKt {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if (r0 == r1) goto L16;
     */
    /* renamed from: adjustTextRange-vJH6DeI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m3660adjustTextRangevJH6DeI(int i, int i2, int i3, long j) {
        int i4;
        int m990getMinimpl = TextRange.m990getMinimpl(j);
        int m989getMaximpl = TextRange.m989getMaximpl(j);
        if (m989getMaximpl < i) {
            return j;
        }
        if (m990getMinimpl > i || i2 > m989getMaximpl) {
            if (m990getMinimpl > i && m989getMaximpl < i2) {
                i += i3;
                m990getMinimpl = i;
            } else if (m990getMinimpl >= i2) {
                i4 = i3 - (i2 - i);
            } else if (i < m990getMinimpl) {
                m990getMinimpl = i + i3;
                i = (i3 - (i2 - i)) + m989getMaximpl;
            }
            return SizeKt.TextRange(m990getMinimpl, i);
        }
        i4 = i3 - (i2 - i);
        m990getMinimpl += i4;
        i = m989getMaximpl + i4;
        return SizeKt.TextRange(m990getMinimpl, i);
    }

    public static final void delete(TextFieldBuffer textFieldBuffer, int i, int i2) {
        textFieldBuffer.replace(i, i2, "");
    }

    public static final void insert(TextFieldBuffer textFieldBuffer, int i, String str) {
        textFieldBuffer.replace(i, i, str);
    }

    public static final void placeCursorAtEnd(TextFieldBuffer textFieldBuffer) {
        PartialGapBuffer partialGapBuffer = textFieldBuffer.buffer;
        int length = partialGapBuffer.length();
        int length2 = partialGapBuffer.length() + 1;
        if (length < 0 || length >= length2) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected " + length + " to be in [0, " + length2 + ')');
        }
        textFieldBuffer.selectionInChars = SizeKt.TextRange(length, length);
    }

    public static final void setSelectionCoerced(TextFieldBuffer textFieldBuffer, int i, int i2) {
        textFieldBuffer.m379setSelection5zctL8(SizeKt.TextRange(RangesKt___RangesKt.coerceIn(i, 0, textFieldBuffer.buffer.length()), RangesKt___RangesKt.coerceIn(i2, 0, textFieldBuffer.buffer.length())));
    }

    public static Drawable toDrawable$default(ImageResource imageResource, Resources resources) {
        Lazy lazy = ResourcesKt.mooncakeResourceIndex;
        imageResource.getClass();
        resources.getClass();
        lazy.getClass();
        Integer drawableResId = toDrawableResId(imageResource, lazy);
        if (drawableResId != null) {
            return resources.getDrawable(drawableResId.intValue(), null);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Integer toDrawableResId(ImageResource imageResource, Lazy lazy) {
        int i;
        imageResource.getClass();
        lazy.getClass();
        Integer num = null;
        if (!(imageResource instanceof ImageResource.Token)) {
            if (imageResource instanceof ImageResource.Id) {
                return (Integer) ((Map) lazy.initializer).get(imageResource);
            }
            if (imageResource instanceof ImageResource.Url) {
                return null;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        zzd zzdVar = Icons.Companion;
        String str = ((ImageResource.Token) imageResource).id;
        zzdVar.getClass();
        Icons icons = zzd.get(str);
        if (icons == null) {
            Emojis.Companion.getClass();
            Emojis emojis = e.get(str);
            if (emojis != null) {
                i = emojis.drawableResLight48;
            }
            if (num == null) {
                Timber.Forest.e(new IllegalArgumentException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Token with id ", str, " not found on the host device.")));
            }
            return num;
        }
        i = icons.drawableRes;
        num = Integer.valueOf(i);
        if (num == null) {
        }
        return num;
    }

    public static final Image toProto(ImageResource.Url url) {
        url.getClass();
        return new Image(url.light, url.dark, 4);
    }
}
