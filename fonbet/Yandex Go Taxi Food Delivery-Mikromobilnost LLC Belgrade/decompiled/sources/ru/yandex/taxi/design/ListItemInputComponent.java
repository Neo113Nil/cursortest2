package ru.yandex.taxi.design;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.transition.ChangeBounds;
import androidx.transition.TransitionManager;
import com.google.android.material.navigation.NavigationBarView;
import com.yandex.div.internal.widget.EllipsizedTextView;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.asy;
import defpackage.c4i0;
import defpackage.cma1;
import defpackage.dzg0;
import defpackage.evu0;
import defpackage.ffx;
import defpackage.hnr0;
import defpackage.jl40;
import defpackage.lz40;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.mzh0;
import defpackage.ndh0;
import defpackage.pw0;
import defpackage.qje;
import defpackage.qks;
import defpackage.t37;
import defpackage.t8;
import defpackage.tje;
import defpackage.tp11;
import defpackage.vng;
import defpackage.wuj0;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.zry;
import defpackage.zy11;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.BufferOverflow;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.utils.BaseTextWatcher;
import ru.yandex.taxi.widget.KeyboardAwareRobotoEditText;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringPaint;

@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 Þ\u00012\u00020\u00012\u00020\u0002:\u0004ß\u0001à\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\f2\b\b\u0001\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\f2\b\b\u0001\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u000eJ\u0017\u0010\u0018\u001a\u00020\f2\b\b\u0001\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u000eJ\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u000eJ\u0017\u0010\u001d\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u001f¢\u0006\u0004\b$\u0010\"J\u0015\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0007¢\u0006\u0004\b&\u0010\u000eJ\u0015\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u0007¢\u0006\u0004\b(\u0010\u000eJ\u0015\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u0007¢\u0006\u0004\b*\u0010\u000eJ\r\u0010+\u001a\u00020\f¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u00020\f2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\f2\b\u00101\u001a\u0004\u0018\u00010-¢\u0006\u0004\b2\u00100J\u0017\u00105\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\f2\b\u00107\u001a\u0004\u0018\u00010-¢\u0006\u0004\b8\u00100J\u0017\u0010:\u001a\u00020\f2\b\u00109\u001a\u0004\u0018\u00010-¢\u0006\u0004\b:\u00100J\u0017\u0010<\u001a\u00020\f2\b\b\u0001\u0010;\u001a\u00020\u0007¢\u0006\u0004\b<\u0010\u000eJ\u0017\u0010>\u001a\u00020\f2\b\u0010=\u001a\u0004\u0018\u000103¢\u0006\u0004\b>\u00106J\u0017\u0010<\u001a\u00020\f2\b\u0010?\u001a\u0004\u0018\u00010-¢\u0006\u0004\b<\u00100J\u000f\u0010@\u001a\u0004\u0018\u000103¢\u0006\u0004\b@\u0010AJ\u0013\u0010D\u001a\b\u0012\u0004\u0012\u00020C0B¢\u0006\u0004\bD\u0010EJ\u0013\u0010F\u001a\b\u0012\u0004\u0012\u00020\f0B¢\u0006\u0004\bF\u0010EJ\u0013\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001f0B¢\u0006\u0004\bG\u0010EJ\u0015\u0010H\u001a\u00020\f2\u0006\u0010.\u001a\u000203¢\u0006\u0004\bH\u00106J\u0015\u0010I\u001a\u00020\f2\u0006\u0010.\u001a\u000203¢\u0006\u0004\bI\u00106J\u0017\u0010L\u001a\u00020\f2\b\u0010K\u001a\u0004\u0018\u00010J¢\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001a\u00020\f2\b\u0010N\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\bO\u0010\u001eJ\u0015\u0010Q\u001a\u00020\f2\u0006\u0010P\u001a\u00020\u001f¢\u0006\u0004\bQ\u0010\"J\u0015\u0010S\u001a\u00020\f2\u0006\u0010R\u001a\u00020\u001f¢\u0006\u0004\bS\u0010\"J\u0015\u0010U\u001a\u00020\f2\u0006\u0010T\u001a\u00020\u0007¢\u0006\u0004\bU\u0010\u000eJ\u0015\u0010V\u001a\u00020\f2\u0006\u0010T\u001a\u00020\u0007¢\u0006\u0004\bV\u0010\u000eJ\u0015\u0010X\u001a\u00020\f2\u0006\u0010W\u001a\u00020\u0007¢\u0006\u0004\bX\u0010\u000eJ\u0015\u0010Y\u001a\u00020\f2\u0006\u0010W\u001a\u00020\u0007¢\u0006\u0004\bY\u0010\u000eJ\u0015\u0010[\u001a\u00020\f2\u0006\u0010Z\u001a\u00020\u0007¢\u0006\u0004\b[\u0010\u000eJ\u0017\u0010\\\u001a\u00020\f2\b\b\u0001\u0010;\u001a\u00020\u0007¢\u0006\u0004\b\\\u0010\u000eJ\u0017\u0010]\u001a\u00020\f2\b\b\u0001\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b]\u0010\u000eJ\r\u0010^\u001a\u00020\f¢\u0006\u0004\b^\u0010,J\u0015\u0010`\u001a\u00020\f2\u0006\u0010_\u001a\u00020\u001f¢\u0006\u0004\b`\u0010\"J\u0015\u0010b\u001a\u00020\f2\u0006\u0010a\u001a\u00020\u001f¢\u0006\u0004\bb\u0010\"J\u0017\u0010d\u001a\u00020\f2\b\b\u0001\u0010c\u001a\u00020\u0007¢\u0006\u0004\bd\u0010\u000eJ\u0017\u0010e\u001a\u00020\f2\b\b\u0001\u0010c\u001a\u00020\u0007¢\u0006\u0004\be\u0010\u000eJ\u0015\u0010f\u001a\u00020\f2\u0006\u0010c\u001a\u00020\u0007¢\u0006\u0004\bf\u0010\u000eJ\u0017\u0010g\u001a\u00020\f2\b\b\u0001\u0010c\u001a\u00020\u0007¢\u0006\u0004\bg\u0010\u000eJ\u000f\u0010h\u001a\u00020\fH\u0014¢\u0006\u0004\bh\u0010,J\u0015\u0010j\u001a\u00020\f2\u0006\u0010i\u001a\u00020\u001f¢\u0006\u0004\bj\u0010\"J7\u0010p\u001a\u00020\f2\u0006\u0010k\u001a\u00020\u001f2\u0006\u0010l\u001a\u00020\u00072\u0006\u0010m\u001a\u00020\u00072\u0006\u0010n\u001a\u00020\u00072\u0006\u0010o\u001a\u00020\u0007H\u0014¢\u0006\u0004\bp\u0010qJ\u0017\u0010t\u001a\u00020\f2\u0006\u0010s\u001a\u00020rH\u0014¢\u0006\u0004\bt\u0010uJ\u0017\u0010x\u001a\u00020\f2\u0006\u0010w\u001a\u00020vH\u0016¢\u0006\u0004\bx\u0010yJ\u0017\u0010z\u001a\u00020\f2\b\b\u0001\u0010;\u001a\u00020\u0007¢\u0006\u0004\bz\u0010\u000eJ!\u0010z\u001a\u00020\f2\b\b\u0001\u0010{\u001a\u00020\u00072\b\b\u0001\u0010|\u001a\u00020\u0007¢\u0006\u0004\bz\u0010}J\r\u0010~\u001a\u00020\f¢\u0006\u0004\b~\u0010,J\u000f\u0010\u007f\u001a\u00020\fH\u0007¢\u0006\u0004\b\u007f\u0010,J\u0012\u0010\u0080\u0001\u001a\u00020\u001fH\u0016¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001c\u0010\u0082\u0001\u001a\u00020\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001b\u0010\u0084\u0001\u001a\u00020\f2\b\b\u0001\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0005\b\u0084\u0001\u0010\u000eJ\u001b\u0010\u0085\u0001\u001a\u00020\f2\b\b\u0001\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0005\b\u0085\u0001\u0010\u000eJ\u001b\u0010\u0086\u0001\u001a\u00020\f2\b\b\u0001\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0005\b\u0086\u0001\u0010\u000eJ\u001a\u0010\u0088\u0001\u001a\u00020\f2\u0007\u0010\u0087\u0001\u001a\u00020\u001fH\u0002¢\u0006\u0005\b\u0088\u0001\u0010\"J\u001c\u0010\u008b\u0001\u001a\u00020\f2\b\u0010\u008a\u0001\u001a\u00030\u0089\u0001H\u0002¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u001c\u0010\u008d\u0001\u001a\u00020\f2\b\u0010\u008a\u0001\u001a\u00030\u0089\u0001H\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008c\u0001J\u001b\u0010\u008f\u0001\u001a\u00020\u00072\u0007\u0010\u008e\u0001\u001a\u00020\u0007H\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001b\u0010\u0092\u0001\u001a\u00020\u00072\u0007\u0010\u0091\u0001\u001a\u00020\u0007H\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0090\u0001J\u0011\u0010\u0093\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u0093\u0001\u0010,J\u0011\u0010\u0094\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u0094\u0001\u0010,J\u0011\u0010\u0095\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u0095\u0001\u0010,J\u0012\u0010\u0096\u0001\u001a\u00020\u001fH\u0002¢\u0006\u0006\b\u0096\u0001\u0010\u0081\u0001J\u0011\u0010\u0097\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u0097\u0001\u0010,J\u0012\u0010\u0098\u0001\u001a\u00020\u001fH\u0002¢\u0006\u0006\b\u0098\u0001\u0010\u0081\u0001J\u0012\u0010\u0099\u0001\u001a\u00020\u001fH\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u0081\u0001J\u0012\u0010\u009a\u0001\u001a\u00020\u001fH\u0002¢\u0006\u0006\b\u009a\u0001\u0010\u0081\u0001J\u001c\u0010\u009b\u0001\u001a\u00020\u001f2\b\u00109\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u0011\u0010\u009d\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u009d\u0001\u0010,J\u0011\u0010\u009e\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u009e\u0001\u0010,J\u0011\u0010\u009f\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u009f\u0001\u0010,J\u0011\u0010 \u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b \u0001\u0010,J\u0011\u0010¡\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b¡\u0001\u0010,R\u0018\u0010£\u0001\u001a\u00030¢\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0017\u0010P\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bP\u0010¥\u0001R\u0017\u0010R\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bR\u0010¥\u0001R\u0019\u0010¦\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u0017\u0010|\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b|\u0010§\u0001R\u0019\u0010¨\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010§\u0001R\u0019\u0010©\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010§\u0001R\u0017\u0010a\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\ba\u0010¥\u0001R\u0019\u0010ª\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010¥\u0001R\u0017\u0010«\u0001\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u0018\u0010®\u0001\u001a\u00030\u00ad\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u0018\u0010±\u0001\u001a\u00030°\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u0016\u00101\u001a\u00030³\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b1\u0010´\u0001R\u0016\u00107\u001a\u00030³\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b7\u0010´\u0001R\u0018\u0010¶\u0001\u001a\u00030µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u0018\u0010¹\u0001\u001a\u00030¸\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u0018\u0010»\u0001\u001a\u00030\u00ad\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¯\u0001R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001c\u0010¬\u0001R\u001c\u0010D\u001a\t\u0012\u0004\u0012\u00020C0¼\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bD\u0010½\u0001R\u001c\u0010F\u001a\t\u0012\u0004\u0012\u00020\f0¼\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bF\u0010½\u0001R\u001c\u0010G\u001a\t\u0012\u0004\u0012\u00020\u001f0¼\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bG\u0010½\u0001R\u0019\u0010¾\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¥\u0001R\u001b\u0010¿\u0001\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001R\u001b\u0010Á\u0001\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010À\u0001R\u001b\u0010Â\u0001\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010À\u0001R\u0019\u0010=\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b=\u0010Ã\u0001R\u0019\u0010Ä\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010¥\u0001R\u0019\u0010Å\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010¥\u0001R\u0019\u0010Æ\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010¥\u0001R\u0019\u0010Ç\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010§\u0001R\u0017\u0010_\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b_\u0010¥\u0001R\u001c\u0010É\u0001\u001a\u0005\u0018\u00010È\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R\u0019\u0010Ë\u0001\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bË\u0001\u0010§\u0001R\u0017\u0010Ì\u0001\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\b\n\u0006\bÌ\u0001\u0010§\u0001R\u001c\u0010Î\u0001\u001a\u0005\u0018\u00010Í\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÎ\u0001\u0010Ï\u0001R\u001c\u0010Ñ\u0001\u001a\u0005\u0018\u00010Ð\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÑ\u0001\u0010Ò\u0001R\u001c\u0010Ó\u0001\u001a\u0005\u0018\u00010Ð\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0001\u0010Ò\u0001R\u0014\u0010Ô\u0001\u001a\u00020\u001f8F¢\u0006\b\u001a\u0006\bÔ\u0001\u0010\u0081\u0001R\u0015\u0010.\u001a\u0004\u0018\u00010C8F¢\u0006\b\u001a\u0006\bÕ\u0001\u0010Ö\u0001R\u0015\u0010?\u001a\u0004\u0018\u00010-8F¢\u0006\b\u001a\u0006\b×\u0001\u0010Ø\u0001R\u0013\u0010)\u001a\u00020\u00078F¢\u0006\b\u001a\u0006\bÙ\u0001\u0010Ú\u0001R\u0015\u0010Ý\u0001\u001a\u00030¸\u00018F¢\u0006\b\u001a\u0006\bÛ\u0001\u0010Ü\u0001¨\u0006á\u0001"}, d2 = {"Lru/yandex/taxi/design/ListItemInputComponent;", "Lru/yandex/taxi/design/DividerAwareComponent;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "minHeight", "Lzy11;", "setMinimumHeight", "(I)V", "attrId", "setTitleTextColorAttr", "color", "setTitleTextColor", "setSubtitleTextColorAttr", "setSubtitleTextColor", "setInputTextColorAttr", "setInputTextColor", "drawable", "setLeadImage", "size", "setClearButtonSize", "Ljava/lang/Runnable;", "onClear", "setOnClear", "(Ljava/lang/Runnable;)V", "", BackendConfig.Restrictions.ENABLED, "setEnabled", "(Z)V", "animateDividerToHighlight", "setAnimateDividerToHighlight", "inputType", "setInputType", "imeOptions", "setImeOptions", "maxLines", "setMaxLines", "invalidateMaxLinesAndInputPadding", "()V", "", "text", "setText", "(Ljava/lang/CharSequence;)V", "title", "setTitle", "", "contentDescription", "setTitleContentDescription", "(Ljava/lang/String;)V", "subtitle", "setSubtitle", "newText", "setTextWithoutNotifying", "res", "setHint", "alertText", "setAlertText", "hint", "getAlertText", "()Ljava/lang/String;", "Lhnr0;", "Landroid/text/Editable;", "textValueFlow", "()Lhnr0;", "textClearedFlow", "textFocusFlow", "setCompanionText", "setCompanionSubtext", "Landroid/widget/TextView$OnEditorActionListener;", "l", "setOnEditorActionListener", "(Landroid/widget/TextView$OnEditorActionListener;)V", "onClose", "setOnKeyboardCloseListener", "showUnderLine", "setShowUnderLine", "isReadOnly", "setReadOnly", "paddingInPixels", "setListItemPaddingStart", "setListItemPaddingEnd", "alignment", "setCompanionTextAlignment", "setCompanionSubtextAlignment", "width", "setMaxCompanionTextWidth", "setTextSize", "setHintColor", "placeCursorAtEnd", "ellipsizeHint", "setEllipsizeHint", "animateLayoutChanges", "setAnimateLayoutChanges", "padding", "setInputPaddingBottom", "setInputVerticalPadding", "setCenterVerticalPaddings", "setTrailPaddingBottom", "onDetachedFromWindow", "isEnabled", "setProgress", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "setTrailImage", "imageRes", "trailImageTintAttr", "(II)V", "requestInputFocus", "disallowParentInterceptTouchEventsOnScroll", "applyThemeForChildrenByDefault", "()Z", "init", "(Landroid/util/AttributeSet;)V", "setTitleTextColorInternal", "setSubtitleTextColorInternal", "setInputTextColorInternal", "hasFocus", "processBorderAnimation", "Landroid/content/res/TypedArray;", "attributes", "setImeOptionsFromAttributes", "(Landroid/content/res/TypedArray;)V", "setInputTypeFromAttributes", "inputTypeAttr", "resolveInputType", "(I)I", "options", "resolveImeOptionsAttrValue", "updateInputState", "updateInputStateNow", "updateBottomDivider", "shouldShowClearButton", "updateInputStateWithError", "hasError", "inputEmpty", "inputNonEmpty", "isTextSameAsInput", "(Ljava/lang/CharSequence;)Z", "updateInputBackground", "updateReadOnly", "updateHorizontalPaddings", "updateHintColor", "applyClearFrame", "Landroid/animation/LayoutTransition;", "layoutTransition", "Landroid/animation/LayoutTransition;", "Z", "trailImageRes", CA20Status.STATUS_USER_I, "horizontalPaddingStart", "horizontalPaddingEnd", "isAnimateDividerToHighlight", "updateStateAction", "Ljava/lang/Runnable;", "Lru/yandex/taxi/design/ListItemSideContainer;", "leadFrame", "Lru/yandex/taxi/design/ListItemSideContainer;", "Landroid/widget/LinearLayout;", "center", "Landroid/widget/LinearLayout;", "Lru/yandex/taxi/widget/RobotoTextView;", "Lru/yandex/taxi/widget/RobotoTextView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "container", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/yandex/taxi/widget/KeyboardAwareRobotoEditText;", "input", "Lru/yandex/taxi/widget/KeyboardAwareRobotoEditText;", "trailFrame", "Llz40;", "Llz40;", "areTextWatcherEnabled", "titleText", "Ljava/lang/CharSequence;", "subtitleText", "hintText", "Ljava/lang/String;", "showClearButton", "showClearButtonUnfocused", "forceScrollingEnabled", "_maxLines", "Lru/yandex/taxi/widget/ShimmeringPaint;", "shimmeringPaint", "Lru/yandex/taxi/widget/ShimmeringPaint;", "hintTextColor", "disabledTextColor", "Landroid/view/View;", "bottomAnimationDivider", "Landroid/view/View;", "Landroid/widget/FrameLayout$LayoutParams;", "dividerAsBorderLayoutParams", "Landroid/widget/FrameLayout$LayoutParams;", "dividerAsFocusedLayoutParams", "isHintShowing", "getText", "()Landroid/text/Editable;", "getHint", "()Ljava/lang/CharSequence;", "getMaxLines", "()I", "getAddressEditText", "()Lru/yandex/taxi/widget/KeyboardAwareRobotoEditText;", "addressEditText", "Companion", "asy", "zry", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ListItemInputComponent extends DividerAwareComponent {
    private static final long BORDER_TO_UNDERLINE_ANIMATION_DURATION_MS = 200;
    private static final int IME_OPTION_DONE = 0;
    private static final int IME_OPTION_SEARCH = 3;
    private static final String INPUT_SUBTITLE_TEXT_COLOR_ATTR = "component_input_subtitle_text_color";
    private static final String INPUT_TEXT_COLOR_ATTR = "component_input_text_color";
    private static final String INPUT_TITLE_TEXT_COLOR_ATTR = "component_input_title_text_color";
    private static final int INPUT_TYPE_DECIMAL_NUMBER = 2;
    private static final int INPUT_TYPE_EMAIL = 6;
    private static final int INPUT_TYPE_NUMBER = 1;
    private static final int INPUT_TYPE_PHONE = 4;
    private static final int INPUT_TYPE_TEXT_CAP_SENTENCES = 5;
    private static final int INPUT_TYPE_TEXT_WORD_CAPS = 3;
    private int _maxLines;
    private String alertText;
    private boolean animateLayoutChanges;
    private boolean areTextWatcherEnabled;
    private View bottomAnimationDivider;
    private final LinearLayout center;
    private final ConstraintLayout container;
    private final int disabledTextColor;
    private FrameLayout.LayoutParams dividerAsBorderLayoutParams;
    private FrameLayout.LayoutParams dividerAsFocusedLayoutParams;
    private boolean ellipsizeHint;
    private boolean forceScrollingEnabled;
    private CharSequence hintText;
    private int hintTextColor;
    private int horizontalPaddingEnd;
    private int horizontalPaddingStart;
    private final KeyboardAwareRobotoEditText input;
    private boolean isAnimateDividerToHighlight;
    private boolean isReadOnly;
    public final LayoutTransition layoutTransition;
    private final ListItemSideContainer leadFrame;
    private Runnable onClear;
    private ShimmeringPaint shimmeringPaint;
    private boolean showClearButton;
    private boolean showClearButtonUnfocused;
    private boolean showUnderLine;
    private final RobotoTextView subtitle;
    private CharSequence subtitleText;
    private final lz40 textClearedFlow;
    private final lz40 textFocusFlow;
    private final lz40 textValueFlow;
    private final RobotoTextView title;
    private CharSequence titleText;
    private final ListItemSideContainer trailFrame;
    private int trailImageRes;
    private int trailImageTintAttr;
    private final Runnable updateStateAction;
    public static final asy Companion = new asy();
    private static final int DEFAULT_PADDING_RES = mrg0.go_design_m_space;
    private static final int INPUT_TITLE_TEXT_COLOR_STYLE = c4i0.ListItemInputComponent_component_input_title_text_color;
    private static final int INPUT_TITLE_TEXT_COLOR_TAG = ndh0.main_text_id;
    private static final int INPUT_SUBTITLE_TEXT_COLOR_STYLE = c4i0.ListItemInputComponent_component_input_subtitle_text_color;
    private static final int INPUT_SUBTITLE_TEXT_COLOR_TAG = ndh0.minor_text_id;
    private static final int INPUT_TEXT_COLOR_STYLE = c4i0.ListItemInputComponent_component_input_text_color;
    private static final int INPUT_TEXT_COLOR_TAG = ndh0.input_text_id;

    public ListItemInputComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.layoutTransition = new LayoutTransition();
        this.showUnderLine = true;
        this.trailImageRes = dzg0.component_list_item_input_clear_button;
        this.trailImageTintAttr = xng0.textMain;
        int i2 = DEFAULT_PADDING_RES;
        this.horizontalPaddingStart = tje.r(i2, getContext());
        this.horizontalPaddingEnd = tje.r(i2, getContext());
        this.updateStateAction = new qks(this, 1);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams.bottomToBottom = 0;
        layoutParams.topToTop = 0;
        layoutParams.startToStart = 0;
        int i3 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        ListItemSideContainer listItemSideContainer = new ListItemSideContainer(context, null, 0, i3, defaultConstructorMarker);
        listItemSideContainer.setLayoutParams(layoutParams);
        listItemSideContainer.setId(ndh0.input_lead_frame);
        this.leadFrame = listItemSideContainer;
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams2.bottomToBottom = 0;
        layoutParams2.endToEnd = 0;
        layoutParams2.startToEnd = ndh0.input_lead_frame;
        layoutParams2.topToTop = 0;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams2);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, tje.u(12, linearLayout.getContext()), 0, tje.u(12, linearLayout.getContext()));
        linearLayout.setId(ndh0.component_input_center);
        this.center = linearLayout;
        AttributeSet attributeSet2 = null;
        int i4 = 0;
        RobotoTextView robotoTextView = new RobotoTextView(context, attributeSet2, i4, i3, defaultConstructorMarker);
        robotoTextView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        robotoTextView.setEllipsize(truncateAt);
        robotoTextView.setMaxLines(2);
        robotoTextView.setTextAlignment(5);
        robotoTextView.setTextColorAttr(xng0.textMinor);
        robotoTextView.setTextSize(tje.s(mrg0.component_text_size_caption, robotoTextView.getContext()));
        tp11.b(0, robotoTextView);
        robotoTextView.setVisibility(8);
        robotoTextView.setId(ndh0.component_list_item_title);
        this.title = robotoTextView;
        RobotoTextView robotoTextView2 = new RobotoTextView(context, attributeSet2, i4, i3, defaultConstructorMarker);
        robotoTextView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        robotoTextView2.setEllipsize(truncateAt);
        robotoTextView2.setMaxLines(1);
        robotoTextView2.setTextAlignment(5);
        robotoTextView2.setTextColor(qje.t(xng0.textMinor, robotoTextView2.getContext()));
        robotoTextView2.setTextSize(tje.s(mrg0.component_text_size_caption, robotoTextView2.getContext()));
        tp11.b(0, robotoTextView2);
        robotoTextView2.setVisibility(8);
        robotoTextView2.setId(ndh0.component_list_item_subtitle);
        this.subtitle = robotoTextView2;
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.container = constraintLayout;
        int i5 = 0;
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = new KeyboardAwareRobotoEditText(context, null, i5, i3, defaultConstructorMarker);
        keyboardAwareRobotoEditText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        keyboardAwareRobotoEditText.setBackground(vng.t(dzg0.component_input_bg, keyboardAwareRobotoEditText.getContext()));
        keyboardAwareRobotoEditText.setPadding(0, 0, tje.r(mrg0.list_item_input_end_padding, keyboardAwareRobotoEditText.getContext()), 0);
        keyboardAwareRobotoEditText.setTextAlignment(5);
        keyboardAwareRobotoEditText.setTextColorAttr(xng0.textMain);
        keyboardAwareRobotoEditText.setTextCursorDrawable(vng.t(dzg0.blue_toxic_input_cursor, keyboardAwareRobotoEditText.getContext()));
        keyboardAwareRobotoEditText.setTextSize(tje.s(mrg0.component_text_size_body, keyboardAwareRobotoEditText.getContext()));
        tp11.b(0, keyboardAwareRobotoEditText);
        keyboardAwareRobotoEditText.setId(ndh0.component_list_item_input);
        this.input = keyboardAwareRobotoEditText;
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams3.bottomToBottom = 0;
        layoutParams3.topToTop = 0;
        layoutParams3.endToEnd = 0;
        ListItemSideContainer listItemSideContainer2 = new ListItemSideContainer(context, null, i5, i3, defaultConstructorMarker);
        listItemSideContainer2.setLayoutParams(layoutParams3);
        listItemSideContainer2.setId(ndh0.trail_frame);
        this.trailFrame = listItemSideContainer2;
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.setOrientation(1);
        addView(constraintLayout);
        constraintLayout.addView(listItemSideContainer);
        constraintLayout.addView(linearLayout);
        constraintLayout.addView(listItemSideContainer2);
        linearLayout.addView(robotoTextView);
        linearLayout.addView(linearLayout2);
        linearLayout2.addView(keyboardAwareRobotoEditText);
        linearLayout2.addView(robotoTextView2);
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.textValueFlow = ffx.b(0, 1, bufferOverflow);
        this.textClearedFlow = ffx.b(0, 1, bufferOverflow);
        this.textFocusFlow = ffx.b(0, 1, bufferOverflow);
        this.areTextWatcherEnabled = true;
        this.showClearButton = true;
        this._maxLines = Integer.MAX_VALUE;
        this.ellipsizeHint = true;
        this.hintTextColor = qje.t(xng0.textMinor, getContext());
        this.disabledTextColor = qje.t(xng0.textMinor, getContext());
        init(attributeSet);
    }

    private final void applyClearFrame() {
        if (this.showClearButton) {
            this.trailFrame.setImage(this.trailImageRes);
            this.trailFrame.setImageTintColor(qje.t(this.trailImageTintAttr, getContext()));
        }
        this.trailFrame.getAsImageView().setBackgroundDrawable(vng.t(dzg0.bg_transparent_ripple, getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean disallowParentInterceptTouchEventsOnScroll$lambda$0(ListItemInputComponent listItemInputComponent, View view, MotionEvent motionEvent) {
        if (listItemInputComponent.input.hasFocus()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            if ((motionEvent.getAction() & 255) == 8) {
                view.getParent().requestDisallowInterceptTouchEvent(false);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasError() {
        String str = this.alertText;
        return !(str == null || evu0.J(str));
    }

    private final void init(AttributeSet attrs) {
        final int i = 0;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attrs, c4i0.ListItemInputComponent, 0, 0);
        this.titleText = obtainStyledAttributes.getString(c4i0.ListItemInputComponent_component_input_title);
        this.hintText = obtainStyledAttributes.getString(c4i0.ListItemInputComponent_component_input_hint);
        final int i2 = 2;
        final int i3 = 1;
        if (attrs != null) {
            qje.S(attrs, obtainStyledAttributes, INPUT_TITLE_TEXT_COLOR_ATTR, INPUT_TITLE_TEXT_COLOR_STYLE, xng0.textMain, new Consumer(this) { // from class: xry
                public final /* synthetic */ ListItemInputComponent b;

                {
                    this.b = this;
                }

                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i4 = i;
                    ListItemInputComponent listItemInputComponent = this.b;
                    Integer num = (Integer) obj;
                    switch (i4) {
                        case 0:
                            listItemInputComponent.setTitleTextColorAttr(num.intValue());
                            break;
                        case 1:
                            ListItemInputComponent.init$lambda$0(listItemInputComponent, num);
                            break;
                        case 2:
                            listItemInputComponent.setSubtitleTextColorAttr(num.intValue());
                            break;
                        case 3:
                            ListItemInputComponent.init$lambda$1(listItemInputComponent, num);
                            break;
                        case 4:
                            listItemInputComponent.setInputTextColorAttr(num.intValue());
                            break;
                        default:
                            ListItemInputComponent.init$lambda$2(listItemInputComponent, num);
                            break;
                    }
                }
            }, new Consumer(this) { // from class: xry
                public final /* synthetic */ ListItemInputComponent b;

                {
                    this.b = this;
                }

                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i4 = i3;
                    ListItemInputComponent listItemInputComponent = this.b;
                    Integer num = (Integer) obj;
                    switch (i4) {
                        case 0:
                            listItemInputComponent.setTitleTextColorAttr(num.intValue());
                            break;
                        case 1:
                            ListItemInputComponent.init$lambda$0(listItemInputComponent, num);
                            break;
                        case 2:
                            listItemInputComponent.setSubtitleTextColorAttr(num.intValue());
                            break;
                        case 3:
                            ListItemInputComponent.init$lambda$1(listItemInputComponent, num);
                            break;
                        case 4:
                            listItemInputComponent.setInputTextColorAttr(num.intValue());
                            break;
                        default:
                            ListItemInputComponent.init$lambda$2(listItemInputComponent, num);
                            break;
                    }
                }
            });
            final int i4 = 3;
            qje.S(attrs, obtainStyledAttributes, INPUT_SUBTITLE_TEXT_COLOR_ATTR, INPUT_SUBTITLE_TEXT_COLOR_STYLE, xng0.textMinor, new Consumer(this) { // from class: xry
                public final /* synthetic */ ListItemInputComponent b;

                {
                    this.b = this;
                }

                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i42 = i2;
                    ListItemInputComponent listItemInputComponent = this.b;
                    Integer num = (Integer) obj;
                    switch (i42) {
                        case 0:
                            listItemInputComponent.setTitleTextColorAttr(num.intValue());
                            break;
                        case 1:
                            ListItemInputComponent.init$lambda$0(listItemInputComponent, num);
                            break;
                        case 2:
                            listItemInputComponent.setSubtitleTextColorAttr(num.intValue());
                            break;
                        case 3:
                            ListItemInputComponent.init$lambda$1(listItemInputComponent, num);
                            break;
                        case 4:
                            listItemInputComponent.setInputTextColorAttr(num.intValue());
                            break;
                        default:
                            ListItemInputComponent.init$lambda$2(listItemInputComponent, num);
                            break;
                    }
                }
            }, new Consumer(this) { // from class: xry
                public final /* synthetic */ ListItemInputComponent b;

                {
                    this.b = this;
                }

                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i42 = i4;
                    ListItemInputComponent listItemInputComponent = this.b;
                    Integer num = (Integer) obj;
                    switch (i42) {
                        case 0:
                            listItemInputComponent.setTitleTextColorAttr(num.intValue());
                            break;
                        case 1:
                            ListItemInputComponent.init$lambda$0(listItemInputComponent, num);
                            break;
                        case 2:
                            listItemInputComponent.setSubtitleTextColorAttr(num.intValue());
                            break;
                        case 3:
                            ListItemInputComponent.init$lambda$1(listItemInputComponent, num);
                            break;
                        case 4:
                            listItemInputComponent.setInputTextColorAttr(num.intValue());
                            break;
                        default:
                            ListItemInputComponent.init$lambda$2(listItemInputComponent, num);
                            break;
                    }
                }
            });
            int i5 = INPUT_TEXT_COLOR_STYLE;
            int i6 = xng0.textMain;
            final int i7 = 4;
            Consumer consumer = new Consumer(this) { // from class: xry
                public final /* synthetic */ ListItemInputComponent b;

                {
                    this.b = this;
                }

                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i42 = i7;
                    ListItemInputComponent listItemInputComponent = this.b;
                    Integer num = (Integer) obj;
                    switch (i42) {
                        case 0:
                            listItemInputComponent.setTitleTextColorAttr(num.intValue());
                            break;
                        case 1:
                            ListItemInputComponent.init$lambda$0(listItemInputComponent, num);
                            break;
                        case 2:
                            listItemInputComponent.setSubtitleTextColorAttr(num.intValue());
                            break;
                        case 3:
                            ListItemInputComponent.init$lambda$1(listItemInputComponent, num);
                            break;
                        case 4:
                            listItemInputComponent.setInputTextColorAttr(num.intValue());
                            break;
                        default:
                            ListItemInputComponent.init$lambda$2(listItemInputComponent, num);
                            break;
                    }
                }
            };
            final int i8 = 5;
            qje.S(attrs, obtainStyledAttributes, INPUT_TEXT_COLOR_ATTR, i5, i6, consumer, new Consumer(this) { // from class: xry
                public final /* synthetic */ ListItemInputComponent b;

                {
                    this.b = this;
                }

                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i42 = i8;
                    ListItemInputComponent listItemInputComponent = this.b;
                    Integer num = (Integer) obj;
                    switch (i42) {
                        case 0:
                            listItemInputComponent.setTitleTextColorAttr(num.intValue());
                            break;
                        case 1:
                            ListItemInputComponent.init$lambda$0(listItemInputComponent, num);
                            break;
                        case 2:
                            listItemInputComponent.setSubtitleTextColorAttr(num.intValue());
                            break;
                        case 3:
                            ListItemInputComponent.init$lambda$1(listItemInputComponent, num);
                            break;
                        case 4:
                            listItemInputComponent.setInputTextColorAttr(num.intValue());
                            break;
                        default:
                            ListItemInputComponent.init$lambda$2(listItemInputComponent, num);
                            break;
                    }
                }
            });
        } else {
            setTitleTextColorAttr(xng0.textMain);
            setSubtitleTextColorAttr(xng0.textMinor);
            setInputTextColorAttr(xng0.textMain);
        }
        setInputTypeFromAttributes(obtainStyledAttributes);
        setImeOptionsFromAttributes(obtainStyledAttributes);
        this.showClearButton = obtainStyledAttributes.getBoolean(c4i0.ListItemInputComponent_component_input_clear_enable, true);
        this.showClearButtonUnfocused = obtainStyledAttributes.getBoolean(c4i0.ListItemInputComponent_show_clear_button_unfocused, false);
        this.forceScrollingEnabled = obtainStyledAttributes.getBoolean(c4i0.ListItemInputComponent_component_force_scrolling_enabled, false);
        if (this.showClearButton) {
            applyClearFrame();
            this.trailFrame.getAsImageView().setContentDescription(getContext().getString(mzh0.common_clear_description));
            this.trailFrame.setOnImageClickListener(new t37(i2, this));
        }
        this._maxLines = obtainStyledAttributes.getInt(c4i0.ListItemInputComponent_component_max_lines, Integer.MAX_VALUE);
        this.showUnderLine = obtainStyledAttributes.getBoolean(c4i0.ListItemInputComponent_component_show_underline, true);
        androidx.core.view.b.p(this.input, new zry(this));
        this.input.setMaxLines(this._maxLines);
        this.input.setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
        this.input.addTextChangedListener(new BaseTextWatcher() { // from class: ru.yandex.taxi.design.ListItemInputComponent$init$8
            @Override // ru.yandex.taxi.utils.BaseTextWatcher, android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                ListItemInputComponent.this.alertText = null;
                ListItemInputComponent.this.updateInputState();
            }
        });
        this.input.addTextChangedListener(new TextWatcher() { // from class: ru.yandex.taxi.design.ListItemInputComponent$init$9
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                boolean z;
                lz40 lz40Var;
                z = ListItemInputComponent.this.areTextWatcherEnabled;
                if (z) {
                    lz40Var = ListItemInputComponent.this.textValueFlow;
                    lz40Var.g(s);
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                lz40 lz40Var;
                if (before <= 0 || !TextUtils.isEmpty(s)) {
                    return;
                }
                lz40Var = ListItemInputComponent.this.textClearedFlow;
                lz40Var.g(zy11.a);
            }
        });
        this.input.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: yry
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                ListItemInputComponent.init$lambda$4(ListItemInputComponent.this, view, z);
            }
        });
        setImportantForAccessibility(2);
        this.leadFrame.setMinimumWidth(0);
        obtainStyledAttributes.recycle();
        updateInputState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$0(ListItemInputComponent listItemInputComponent, Integer num) {
        Resources resources = listItemInputComponent.getResources();
        int intValue = num.intValue();
        Resources.Theme theme = listItemInputComponent.getContext().getTheme();
        ThreadLocal threadLocal = wuj0.a;
        listItemInputComponent.setTitleTextColor(resources.getColor(intValue, theme));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$1(ListItemInputComponent listItemInputComponent, Integer num) {
        Resources resources = listItemInputComponent.getResources();
        int intValue = num.intValue();
        Resources.Theme theme = listItemInputComponent.getContext().getTheme();
        ThreadLocal threadLocal = wuj0.a;
        listItemInputComponent.setSubtitleTextColor(resources.getColor(intValue, theme));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$2(ListItemInputComponent listItemInputComponent, Integer num) {
        Resources resources = listItemInputComponent.getResources();
        int intValue = num.intValue();
        Resources.Theme theme = listItemInputComponent.getContext().getTheme();
        ThreadLocal threadLocal = wuj0.a;
        listItemInputComponent.setInputTextColor(resources.getColor(intValue, theme));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$3(ListItemInputComponent listItemInputComponent, View view) {
        Runnable runnable = listItemInputComponent.onClear;
        if (runnable != null) {
            runnable.run();
        }
        listItemInputComponent.input.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$4(ListItemInputComponent listItemInputComponent, View view, boolean z) {
        listItemInputComponent.updateInputState();
        listItemInputComponent.processBorderAnimation(z);
        listItemInputComponent.textFocusFlow.g(Boolean.valueOf(z));
    }

    private final boolean inputEmpty() {
        Editable text = this.input.getText();
        return text == null || text.length() == 0;
    }

    private final boolean inputNonEmpty() {
        return !inputEmpty();
    }

    private final boolean isTextSameAsInput(CharSequence newText) {
        String str;
        String obj;
        String str2 = "";
        if (newText == null || (str = newText.toString()) == null) {
            str = "";
        }
        Editable text = this.input.getText();
        if (text != null && (obj = text.toString()) != null) {
            str2 = obj;
        }
        return str2.equals(str);
    }

    private final void processBorderAnimation(boolean hasFocus) {
        View view;
        if (this.showUnderLine && this.isAnimateDividerToHighlight && (view = this.bottomAnimationDivider) != null) {
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.c = 200L;
            TransitionManager.a(changeBounds, this);
            int i = hasError() ? mqg0.component_red_toxic : mqg0.component_amber_toxic;
            int i2 = mqg0.component_gray_225;
            if (hasFocus) {
                view.setLayoutParams(this.dividerAsFocusedLayoutParams);
                cma1.d(view, i2, i, 200L, 0L, null);
            } else {
                view.setLayoutParams(this.dividerAsBorderLayoutParams);
                cma1.d(view, i, i2, 200L, 0L, null);
            }
        }
    }

    private final int resolveImeOptionsAttrValue(int options) {
        if (options != 0) {
            return options != 3 ? 1 : 3;
        }
        return 6;
    }

    private final int resolveInputType(int inputTypeAttr) {
        switch (inputTypeAttr) {
            case 1:
                return 2;
            case 2:
                return 8194;
            case 3:
                return 8193;
            case 4:
                return 3;
            case 5:
                return 16385;
            case 6:
                return 32;
            default:
                return 1;
        }
    }

    private final void setImeOptionsFromAttributes(TypedArray attributes) {
        int i = c4i0.ListItemInputComponent_imeOptions;
        if (attributes.hasValue(i)) {
            setImeOptions(resolveImeOptionsAttrValue(attributes.getInt(i, 0)));
        }
    }

    private final void setInputTextColorInternal(int color) {
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = this.input;
        if (!isEnabled()) {
            color = this.disabledTextColor;
        }
        keyboardAwareRobotoEditText.setTextColor(color);
    }

    private final void setInputTypeFromAttributes(TypedArray attributes) {
        int i = c4i0.ListItemInputComponent_component_input_type;
        if (attributes.hasValue(i)) {
            this.input.setInputType(resolveInputType(attributes.getInt(i, 0)));
        }
    }

    private final void setSubtitleTextColorInternal(int color) {
        this.subtitle.setTextColor(color);
    }

    private final void setTitleTextColorInternal(int color) {
        this.title.setTextColor(color);
    }

    private final boolean shouldShowClearButton() {
        if (!this.showClearButton || this.isReadOnly || inputEmpty()) {
            return false;
        }
        return this.showClearButtonUnfocused || this.input.hasFocus();
    }

    private final void updateBottomDivider() {
        boolean z = this.isAnimateDividerToHighlight;
        View view = this.bottomAnimationDivider;
        if (!z) {
            if (view != null) {
                removeView(view);
                this.bottomAnimationDivider = null;
                this.dividerAsBorderLayoutParams = null;
                this.dividerAsFocusedLayoutParams = null;
                return;
            }
            return;
        }
        if (view == null) {
            setDividers(DividerPosition.BOTTOM, DividerType.NONE);
            View view2 = new View(getContext());
            view2.setBackgroundColor(qje.t(xng0.line, getContext()));
            this.bottomAnimationDivider = view2;
            this.dividerAsBorderLayoutParams = new FrameLayout.LayoutParams(-1, tje.v(getContext(), 0.5f), 80);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, tje.u(2, getContext()), 80);
            layoutParams.bottomMargin = tje.u(4, getContext());
            layoutParams.setMarginStart(tje.r(mrg0.go_design_m_space, getContext()));
            layoutParams.setMarginEnd(tje.r(mrg0.go_design_m_space, getContext()));
            this.dividerAsFocusedLayoutParams = layoutParams;
            addView(view2, this.dividerAsBorderLayoutParams);
        }
    }

    private final void updateHintColor() {
        int i = isEnabled() ? this.hintTextColor : this.disabledTextColor;
        this.title.setTextColor(i);
        this.input.setHintTextColor(i);
    }

    private final void updateHorizontalPaddings() {
        LinearLayout linearLayout = this.center;
        linearLayout.setPaddingRelative(this.horizontalPaddingStart, linearLayout.getPaddingTop(), this.horizontalPaddingEnd, this.center.getPaddingBottom());
    }

    private final void updateInputBackground() {
        if (!this.showUnderLine || this.isReadOnly || this.isAnimateDividerToHighlight) {
            this.input.setBackground(null);
        } else {
            this.input.setBackgroundResource(dzg0.component_input_bg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateInputState() {
        boolean isAttachedToWindow = isAttachedToWindow();
        Runnable runnable = this.updateStateAction;
        if (!isAttachedToWindow) {
            runnable.run();
        } else {
            removeCallbacks(runnable);
            post(this.updateStateAction);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateInputStateNow() {
        CharSequence charSequence;
        CharSequence charSequence2;
        if (this.showClearButton) {
            this.trailFrame.getAsImageView().setVisibility(shouldShowClearButton() ? 0 : 4);
            this.trailFrame.setImageTintColor(qje.t(this.trailImageTintAttr, getContext()));
        }
        if (hasError()) {
            updateInputStateWithError();
            return;
        }
        if (this.input.hasFocus() || inputNonEmpty()) {
            CharSequence charSequence3 = this.titleText;
            if (charSequence3 == null || evu0.J(charSequence3)) {
                this.title.setVisibility(8);
            } else {
                this.title.setVisibility(0);
                this.title.setText(this.titleText);
            }
            if (this.showClearButton) {
                this.trailFrame.getAsImageView().clearColorFilter();
            }
            this.input.setHint(this.hintText);
        } else {
            this.title.setVisibility(8);
            String str = this.ellipsizeHint ? EllipsizedTextView.DEFAULT_ELLIPSIS : "";
            KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = this.input;
            CharSequence charSequence4 = this.titleText;
            if (charSequence4 == null || evu0.J(charSequence4)) {
                charSequence2 = this.hintText;
            } else {
                charSequence2 = ((Object) this.titleText) + str;
            }
            keyboardAwareRobotoEditText.setHint(charSequence2);
        }
        if (this.input.hasFocus() || (charSequence = this.subtitleText) == null || evu0.J(charSequence)) {
            this.subtitle.setVisibility(8);
        } else {
            this.subtitle.setVisibility(0);
            this.subtitle.setText(this.subtitleText);
        }
        if (!this.input.hasFocus()) {
            updateHintColor();
        }
        updateInputBackground();
        updateReadOnly();
        updateHorizontalPaddings();
        invalidateMaxLinesAndInputPadding();
        if (!this.isAnimateDividerToHighlight) {
            this.center.setLayoutTransition(this.animateLayoutChanges ? this.layoutTransition : null);
        }
        updateBottomDivider();
    }

    private final void updateInputStateWithError() {
        this.title.setTextColor(getContext().getColor(mqg0.component_red_toxic));
        this.title.setVisibility(0);
        this.title.setText(this.alertText);
        this.input.setHint(this.hintText);
        this.input.setBackgroundResource(dzg0.component_input_bg_red);
        if (this.showClearButton) {
            this.trailFrame.getAsImageView().setColorFilter(getContext().getColor(mqg0.component_red_toxic));
        }
    }

    private final void updateReadOnly() {
        boolean z = this.isReadOnly;
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = this.input;
        if (!z) {
            keyboardAwareRobotoEditText.setTouchable(true);
            this.input.setFocusableInTouchMode(true);
        } else {
            if (keyboardAwareRobotoEditText.hasFocus()) {
                this.input.clearFocus();
            }
            this.input.setTouchable(false);
            this.input.setFocusable(false);
        }
    }

    @Override // ru.yandex.taxi.design.DividerAwareComponent, com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        applyClearFrame();
        Object tag = getTag(INPUT_TITLE_TEXT_COLOR_TAG);
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            setTitleTextColorInternal(qje.t(num.intValue(), getContext()));
        }
        Object tag2 = getTag(INPUT_SUBTITLE_TEXT_COLOR_TAG);
        Integer num2 = tag2 instanceof Integer ? (Integer) tag2 : null;
        if (num2 != null) {
            setSubtitleTextColorInternal(qje.t(num2.intValue(), getContext()));
        }
        Object tag3 = getTag(INPUT_TEXT_COLOR_TAG);
        Integer num3 = tag3 instanceof Integer ? (Integer) tag3 : null;
        if (num3 != null) {
            setInputTextColorInternal(qje.t(num3.intValue(), getContext()));
        }
    }

    @Override // com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    public final void disallowParentInterceptTouchEventsOnScroll() {
        this.input.setVerticalScrollBarEnabled(true);
        this.input.setOnTouchListener(new t8(9, this));
    }

    @Override // ru.yandex.taxi.design.DividerAwareComponent, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ShimmeringPaint shimmeringPaint = this.shimmeringPaint;
        if (shimmeringPaint != null) {
            shimmeringPaint.updateShimmering();
            canvas.drawPaint(shimmeringPaint);
            postInvalidateOnAnimation();
        }
    }

    /* renamed from: getAddressEditText, reason: from getter */
    public final KeyboardAwareRobotoEditText getInput() {
        return this.input;
    }

    public final String getAlertText() {
        return this.alertText;
    }

    /* renamed from: getHint, reason: from getter */
    public final CharSequence getHintText() {
        return this.hintText;
    }

    public final int getMaxLines() {
        return this.input.getMaxLines();
    }

    public final Editable getText() {
        return this.input.getText();
    }

    public final void invalidateMaxLinesAndInputPadding() {
        boolean isHintShowing = isHintShowing();
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = this.input;
        if (isHintShowing) {
            keyboardAwareRobotoEditText.setMaxLines(1);
            this.input.setHorizontallyScrolling(true);
            this.input.setEllipsize(TextUtils.TruncateAt.END);
        } else {
            keyboardAwareRobotoEditText.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.input.setMaxLines(this._maxLines);
            if (!this.forceScrollingEnabled) {
                this.input.setHorizontallyScrolling(false);
            }
        }
        int r = shouldShowClearButton() ? tje.r(mrg0.list_item_input_end_padding, getContext()) : 0;
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText2 = this.input;
        keyboardAwareRobotoEditText2.setPaddingRelative(keyboardAwareRobotoEditText2.getPaddingStart(), this.input.getPaddingTop(), r, this.input.getPaddingBottom());
    }

    public final boolean isHintShowing() {
        return inputEmpty();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.dividerAsFocusedLayoutParams = null;
        this.dividerAsBorderLayoutParams = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        ShimmeringPaint shimmeringPaint = this.shimmeringPaint;
        if (shimmeringPaint != null) {
            shimmeringPaint.updateOffset(this);
        }
    }

    public final void placeCursorAtEnd() {
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = this.input;
        keyboardAwareRobotoEditText.setSelection(keyboardAwareRobotoEditText.length());
    }

    public final void requestInputFocus() {
        this.input.requestFocus();
    }

    public final void setAlertText(String alertText) {
        boolean l = jl40.l(this.alertText, alertText);
        this.alertText = alertText;
        updateInputState();
        if (l) {
            return;
        }
        sendAccessibilityEvent(2048);
    }

    public final void setAnimateDividerToHighlight(boolean animateDividerToHighlight) {
        if (this.isAnimateDividerToHighlight != animateDividerToHighlight) {
            this.isAnimateDividerToHighlight = animateDividerToHighlight;
            updateInputState();
        }
    }

    public final void setAnimateLayoutChanges(boolean animateLayoutChanges) {
        this.animateLayoutChanges = animateLayoutChanges;
        updateInputState();
    }

    public final void setCenterVerticalPaddings(int padding) {
        LinearLayout linearLayout = this.center;
        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), padding, this.center.getPaddingEnd(), padding);
    }

    public final void setClearButtonSize(int size) {
        this.trailFrame.setIconSize(size);
    }

    public final void setCompanionSubtext(String text) {
        this.trailFrame.setCompanionSubtext(text);
    }

    public final void setCompanionSubtextAlignment(int alignment) {
        this.trailFrame.setCompanionSubtextAlignment(alignment);
    }

    public final void setCompanionText(String text) {
        this.trailFrame.setCompanionText(text);
    }

    public final void setCompanionTextAlignment(int alignment) {
        this.trailFrame.setCompanionTextAlignment(alignment);
    }

    public final void setEllipsizeHint(boolean ellipsizeHint) {
        this.ellipsizeHint = ellipsizeHint;
        updateInputState();
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.input.setEnabled(enabled);
        updateInputState();
    }

    public final void setHint(int res) {
        this.hintText = getContext().getString(res);
        updateInputState();
    }

    public final void setHintColor(int color) {
        this.hintTextColor = color;
        updateHintColor();
    }

    public final void setImeOptions(int imeOptions) {
        this.input.setImeOptions(imeOptions);
    }

    public final void setInputPaddingBottom(int padding) {
        xw31.y(padding, this.input);
    }

    public final void setInputTextColor(int color) {
        setTag(INPUT_TEXT_COLOR_TAG, null);
        setInputTextColorInternal(color);
    }

    public final void setInputTextColorAttr(int attrId) {
        setTag(INPUT_TEXT_COLOR_TAG, Integer.valueOf(attrId));
        setInputTextColorInternal(qje.t(attrId, getContext()));
    }

    public final void setInputType(int inputType) {
        this.input.setInputType(inputType);
    }

    public final void setInputVerticalPadding(int padding) {
        xw31.N(padding, this.input);
    }

    public final void setLeadImage(int drawable) {
        this.leadFrame.setImage(drawable);
    }

    public final void setListItemPaddingEnd(int paddingInPixels) {
        this.horizontalPaddingEnd = paddingInPixels;
        updateInputState();
    }

    public final void setListItemPaddingStart(int paddingInPixels) {
        this.horizontalPaddingStart = paddingInPixels;
        updateInputState();
    }

    public final void setMaxCompanionTextWidth(int width) {
        this.trailFrame.setMaxCompanionTextWidth(width);
    }

    public final void setMaxLines(int maxLines) {
        this._maxLines = maxLines;
        invalidateMaxLinesAndInputPadding();
    }

    @Override // android.view.View
    public void setMinimumHeight(int minHeight) {
        this.leadFrame.setMinimumHeight(minHeight);
        this.trailFrame.setMinimumHeight(minHeight);
        super.setMinimumHeight(minHeight);
    }

    public final void setOnClear(Runnable onClear) {
        this.onClear = onClear;
    }

    public final void setOnEditorActionListener(TextView.OnEditorActionListener l) {
        this.input.setOnEditorActionListener(l);
    }

    public final void setOnKeyboardCloseListener(Runnable onClose) {
        this.input.setOnCloseListener(onClose == null ? null : new pw0(3, onClose));
    }

    public final void setProgress(boolean isEnabled) {
        if (!isEnabled) {
            this.shimmeringPaint = null;
            return;
        }
        ShimmeringPaint shimmeringPaint = new ShimmeringPaint(getContext());
        this.shimmeringPaint = shimmeringPaint;
        shimmeringPaint.updateOffset(this);
        postInvalidateOnAnimation();
    }

    public final void setReadOnly(boolean isReadOnly) {
        this.isReadOnly = isReadOnly;
        updateInputState();
    }

    public final void setShowUnderLine(boolean showUnderLine) {
        this.showUnderLine = showUnderLine;
        updateInputState();
    }

    public final void setSubtitle(CharSequence subtitle) {
        this.subtitleText = subtitle;
        updateInputState();
    }

    public final void setSubtitleTextColor(int color) {
        setTag(INPUT_SUBTITLE_TEXT_COLOR_TAG, null);
        setSubtitleTextColorInternal(color);
    }

    public final void setSubtitleTextColorAttr(int attrId) {
        setTag(INPUT_SUBTITLE_TEXT_COLOR_TAG, Integer.valueOf(attrId));
        setSubtitleTextColorInternal(qje.t(attrId, getContext()));
    }

    public final void setText(CharSequence text) {
        this.input.setText(text);
    }

    public final void setTextSize(int res) {
        this.input.setTextSize(0, tje.r(res, getContext()));
    }

    public final void setTextWithoutNotifying(CharSequence newText) {
        if (isTextSameAsInput(newText)) {
            return;
        }
        this.areTextWatcherEnabled = false;
        this.input.setText(newText);
        this.areTextWatcherEnabled = true;
    }

    public final void setTitle(CharSequence title) {
        this.titleText = title;
        updateInputState();
    }

    public final void setTitleContentDescription(String contentDescription) {
        this.title.setContentDescription(contentDescription);
    }

    public final void setTitleTextColor(int color) {
        setTag(INPUT_TITLE_TEXT_COLOR_TAG, null);
        setTitleTextColorInternal(color);
    }

    public final void setTitleTextColorAttr(int attrId) {
        setTag(INPUT_TITLE_TEXT_COLOR_TAG, Integer.valueOf(attrId));
        setTitleTextColorInternal(qje.t(attrId, getContext()));
    }

    public final void setTrailImage(int res) {
        this.trailImageRes = res;
        applyClearFrame();
    }

    public final void setTrailPaddingBottom(int padding) {
        xw31.y(padding, this.trailFrame);
    }

    public final hnr0 textClearedFlow() {
        return this.textClearedFlow;
    }

    public final hnr0 textFocusFlow() {
        return this.textFocusFlow;
    }

    public final hnr0 textValueFlow() {
        return this.textValueFlow;
    }

    public final void setTrailImage(int imageRes, int trailImageTintAttr) {
        this.trailImageTintAttr = trailImageTintAttr;
        setTrailImage(imageRes);
    }

    public final void setHint(CharSequence hint) {
        this.hintText = hint;
        updateInputState();
    }

    public ListItemInputComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ListItemInputComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ListItemInputComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
