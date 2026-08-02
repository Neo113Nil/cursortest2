package ru.yandex.taxi.design;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.google.ar.core.ImageMetadata;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.bdc;
import defpackage.bk;
import defpackage.c2r0;
import defpackage.c4i0;
import defpackage.ce0;
import defpackage.dzg0;
import defpackage.evu0;
import defpackage.ff2;
import defpackage.gdc;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.kbs;
import defpackage.kdc;
import defpackage.ly1;
import defpackage.mg;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.ndh0;
import defpackage.nwy0;
import defpackage.pw0;
import defpackage.qje;
import defpackage.rp31;
import defpackage.sls;
import defpackage.sph0;
import defpackage.sql;
import defpackage.ssy0;
import defpackage.t8;
import defpackage.tf;
import defpackage.tje;
import defpackage.tls;
import defpackage.uty0;
import defpackage.vng;
import defpackage.w511;
import defpackage.wls;
import defpackage.xd2;
import defpackage.xng0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.utils.ToggledTextWatcher;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.utils.BaseTextWatcher;
import ru.yandex.taxi.widget.KeyboardAwareRobotoEditText;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\b\u0083\u0002\u0084\u0002\u0085\u0002\u0086\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0015\u001a\u00020\u00142\u001a\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\u00112\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010 \u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\u00142\u0006\u0010'\u001a\u00020)¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020)¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020\u00142\u0006\u0010.\u001a\u00020)¢\u0006\u0004\b/\u0010+J\u0015\u00102\u001a\u00020\u00142\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u001d\u00102\u001a\u00020\u00142\u0006\u00101\u001a\u0002002\u0006\u00104\u001a\u00020\u0019¢\u0006\u0004\b2\u00105J\u0015\u00107\u001a\u00020\u00142\u0006\u00106\u001a\u00020\u0007¢\u0006\u0004\b7\u00108J\r\u00101\u001a\u000200¢\u0006\u0004\b1\u00109J#\u0010<\u001a\u00020\u00142\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0014\u0018\u00010:¢\u0006\u0004\b<\u0010=J\u001b\u0010@\u001a\u00020\u00142\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00140>¢\u0006\u0004\b@\u0010AJ\u001b\u0010C\u001a\u00020\u00142\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00140>¢\u0006\u0004\bC\u0010AJ!\u0010E\u001a\u00020\u00142\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00140:¢\u0006\u0004\bE\u0010=J'\u0010H\u001a\u00020\u00142\u0018\u0010D\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u00190F¢\u0006\u0004\bH\u0010IJ\r\u0010J\u001a\u00020\u0014¢\u0006\u0004\bJ\u0010KJ\r\u0010L\u001a\u00020\u0014¢\u0006\u0004\bL\u0010KJ\r\u0010M\u001a\u00020\u0014¢\u0006\u0004\bM\u0010KJ\u0017\u0010O\u001a\u00020\u00142\b\b\u0001\u0010N\u001a\u00020\u0007¢\u0006\u0004\bO\u00108J\u0017\u0010Q\u001a\u00020\u00142\b\b\u0001\u0010P\u001a\u00020\u0007¢\u0006\u0004\bQ\u00108J\u000f\u0010R\u001a\u00020\u0014H\u0015¢\u0006\u0004\bR\u0010KJ\u000f\u0010S\u001a\u00020\u0014H\u0014¢\u0006\u0004\bS\u0010KJ\u0015\u0010V\u001a\u00020\u00142\u0006\u0010U\u001a\u00020T¢\u0006\u0004\bV\u0010WJ\u0015\u0010X\u001a\u00020\u00142\u0006\u0010U\u001a\u00020T¢\u0006\u0004\bX\u0010WJ\r\u0010Y\u001a\u00020\u0014¢\u0006\u0004\bY\u0010KJ\r\u0010Z\u001a\u00020\u0014¢\u0006\u0004\bZ\u0010KJ\u000f\u0010\\\u001a\u00020[H\u0004¢\u0006\u0004\b\\\u0010]J\u0017\u0010_\u001a\u00020\u00142\u0006\u0010^\u001a\u00020\u0019H\u0016¢\u0006\u0004\b_\u0010`J\u0015\u0010a\u001a\u00020\u00142\u0006\u00101\u001a\u00020\u0019¢\u0006\u0004\ba\u0010`J\u0015\u0010c\u001a\u00020\u00142\u0006\u0010b\u001a\u00020\u0007¢\u0006\u0004\bc\u00108J\u0017\u0010e\u001a\u00020\u00142\b\b\u0001\u0010d\u001a\u00020\u0007¢\u0006\u0004\be\u00108J\r\u0010g\u001a\u00020f¢\u0006\u0004\bg\u0010hJ\u0015\u0010j\u001a\u00020\u00142\u0006\u0010i\u001a\u000200¢\u0006\u0004\bj\u00103J\u0017\u0010l\u001a\u00020\u00142\b\b\u0001\u0010k\u001a\u00020\u0007¢\u0006\u0004\bl\u00108J\u001b\u0010n\u001a\u00020\u00142\f\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00140>¢\u0006\u0004\bn\u0010AJ\r\u0010o\u001a\u00020\u0014¢\u0006\u0004\bo\u0010KJ\u0017\u0010q\u001a\u00020\u00142\b\u0010p\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\bq\u0010rJ\u0017\u0010u\u001a\u00020\u00142\b\u0010t\u001a\u0004\u0018\u00010s¢\u0006\u0004\bu\u0010vJ5\u0010{\u001a\u00020\u00142\b\b\u0001\u0010w\u001a\u00020\u00072\b\b\u0001\u0010x\u001a\u00020\u00072\b\b\u0001\u0010y\u001a\u00020\u00072\b\b\u0001\u0010z\u001a\u00020\u0007¢\u0006\u0004\b{\u0010|J\u0015\u0010~\u001a\u00020\u00142\u0006\u0010}\u001a\u000200¢\u0006\u0004\b~\u00103J\u0019\u0010\u0080\u0001\u001a\u00020\u00142\b\b\u0001\u0010\u007f\u001a\u00020\u0007¢\u0006\u0005\b\u0080\u0001\u00108J\u001e\u0010\u0082\u0001\u001a\u00020\u00142\r\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u00140>¢\u0006\u0005\b\u0082\u0001\u0010AJ\u000f\u0010\u0083\u0001\u001a\u00020\u0014¢\u0006\u0005\b\u0083\u0001\u0010KJ\u0019\u0010\u0084\u0001\u001a\u00020\u00142\b\u0010p\u001a\u0004\u0018\u00010\u000b¢\u0006\u0005\b\u0084\u0001\u0010rJ\u0018\u0010\u0086\u0001\u001a\u00020\u00142\u0007\u0010\u0085\u0001\u001a\u00020\u0019¢\u0006\u0005\b\u0086\u0001\u0010`J7\u0010\u0087\u0001\u001a\u00020\u00142\b\b\u0001\u0010w\u001a\u00020\u00072\b\b\u0001\u0010x\u001a\u00020\u00072\b\b\u0001\u0010y\u001a\u00020\u00072\b\b\u0001\u0010z\u001a\u00020\u0007¢\u0006\u0005\b\u0087\u0001\u0010|J&\u0010\u008a\u0001\u001a\u00020\u00142\t\b\u0001\u0010\u0088\u0001\u001a\u00020\u00072\t\b\u0001\u0010\u0089\u0001\u001a\u00020\u0007¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u001a\u0010\u008d\u0001\u001a\u00020\u00142\t\b\u0001\u0010\u008c\u0001\u001a\u00020\u0007¢\u0006\u0005\b\u008d\u0001\u00108J\u000f\u0010\u008e\u0001\u001a\u00020\u0014¢\u0006\u0005\b\u008e\u0001\u0010KJ\u001a\u0010\u0090\u0001\u001a\u00020\u00142\u0007\u0010\u008f\u0001\u001a\u00020\u0019H\u0014¢\u0006\u0005\b\u0090\u0001\u0010`J%\u0010\u0094\u0001\u001a\u00020\u00142\u0011\u0010\u0093\u0001\u001a\f\u0012\u0005\u0012\u00030\u0092\u0001\u0018\u00010\u0091\u0001H\u0014¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J%\u0010\u0096\u0001\u001a\u00020\u00142\u0011\u0010\u0093\u0001\u001a\f\u0012\u0005\u0012\u00030\u0092\u0001\u0018\u00010\u0091\u0001H\u0014¢\u0006\u0006\b\u0096\u0001\u0010\u0095\u0001J\u0011\u0010\u0097\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b\u0097\u0001\u0010KJ\u001b\u0010\u0099\u0001\u001a\u00020\u00192\u0007\u0010\u0098\u0001\u001a\u000200H\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u001a\u0010\u009c\u0001\u001a\u00020\u00142\u0007\u0010\u009b\u0001\u001a\u00020\u0019H\u0002¢\u0006\u0005\b\u009c\u0001\u0010`J$\u0010\u009d\u0001\u001a\u00020\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u0011\u0010\u009f\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b\u009f\u0001\u0010KJ\u001c\u0010¢\u0001\u001a\u00020\u00142\b\u0010¡\u0001\u001a\u00030 \u0001H\u0002¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u0013\u0010¥\u0001\u001a\u00030¤\u0001H\u0002¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u0011\u0010§\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b§\u0001\u0010KJ\u0011\u0010¨\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b¨\u0001\u0010KJ\u0019\u0010©\u0001\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u0019H\u0002¢\u0006\u0005\b©\u0001\u0010`J\u0011\u0010ª\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\bª\u0001\u0010KJ5\u0010¬\u0001\u001a\u00020\u00142\u0007\u0010\u0089\u0001\u001a\u00020\u00072\u0007\u0010\u0088\u0001\u001a\u00020\u00072\u0007\u0010\u008c\u0001\u001a\u00020\u00072\u0007\u0010«\u0001\u001a\u00020\u0007H\u0002¢\u0006\u0005\b¬\u0001\u0010|J\u0011\u0010\u00ad\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b\u00ad\u0001\u0010KJ5\u0010°\u0001\u001a\u00020\u00142\u0007\u0010®\u0001\u001a\u00020\u00072\u0007\u0010¯\u0001\u001a\u00020\u00072\u000f\u0010\u0093\u0001\u001a\n\u0012\u0005\u0012\u00030\u0092\u00010\u0091\u0001H\u0002¢\u0006\u0006\b°\u0001\u0010±\u0001R\u0016\u0010'\u001a\u00030²\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b'\u0010³\u0001R\u0017\u0010´\u0001\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u0018\u0010·\u0001\u001a\u00030¶\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u0018\u0010¹\u0001\u001a\u00030¶\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010¸\u0001R\u0017\u0010º\u0001\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u0018\u0010¼\u0001\u001a\u00030²\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010³\u0001R\u0018\u0010¾\u0001\u001a\u00030½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u0017\u0010À\u0001\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u0017\u0010Â\u0001\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u0017\u0010Ä\u0001\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010Ã\u0001R\u0019\u0010Å\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010Ã\u0001R\u001a\u0010Ç\u0001\u001a\u00030Æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001R\u001a\u0010É\u0001\u001a\u00030Æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010È\u0001R\u0019\u0010Ê\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010Ã\u0001R\u001b\u0010Ë\u0001\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R\u0017\u0010Í\u0001\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÍ\u0001\u0010Ã\u0001R\u0017\u0010Î\u0001\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010Ã\u0001R\u0019\u0010Ï\u0001\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÏ\u0001\u0010Ð\u0001R\u0019\u0010Ñ\u0001\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÑ\u0001\u0010Ð\u0001R\u0019\u0010Ò\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010Ã\u0001R\u0019\u0010Ó\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0001\u0010Ã\u0001R\u0019\u0010Ô\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R\u0019\u0010Ö\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÖ\u0001\u0010Õ\u0001R\u0019\u0010×\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b×\u0001\u0010Õ\u0001R\u0019\u0010Ø\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bØ\u0001\u0010Ã\u0001R\u0019\u0010Ù\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÙ\u0001\u0010Ã\u0001R\u0019\u0010Ú\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÚ\u0001\u0010Ã\u0001R\u0019\u0010Û\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0001\u0010Ã\u0001R\u0019\u0010Ü\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÜ\u0001\u0010Ã\u0001R\u0019\u0010Ý\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010Ã\u0001R\u0019\u0010Þ\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÞ\u0001\u0010Ã\u0001R\u0019\u0010ß\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bß\u0001\u0010Ã\u0001R\u0019\u0010à\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0001\u0010Ã\u0001R\u0019\u0010á\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bá\u0001\u0010Ã\u0001R\u0019\u0010â\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bâ\u0001\u0010Ã\u0001R\u0019\u0010ã\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bã\u0001\u0010Ã\u0001R\u001a\u0010å\u0001\u001a\u00030ä\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bå\u0001\u0010æ\u0001R\u001a\u0010ç\u0001\u001a\u00030ä\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bç\u0001\u0010æ\u0001R\u001a\u0010è\u0001\u001a\u00030ä\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bè\u0001\u0010æ\u0001R(\u0010é\u0001\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u00198\u0007@BX\u0086\u000e¢\u0006\u000f\n\u0006\bé\u0001\u0010Õ\u0001\u001a\u0005\bê\u0001\u0010\u001dR3\u0010ë\u0001\u001a\u0004\u0018\u00010)2\b\u00101\u001a\u0004\u0018\u00010)8\u0007@FX\u0086\u000e¢\u0006\u0016\n\u0006\bë\u0001\u0010Ð\u0001\u001a\u0005\bë\u0001\u0010-\"\u0005\bì\u0001\u0010+R\u001a\u0010í\u0001\u001a\u00030¤\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bí\u0001\u0010î\u0001R%\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0014\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b;\u0010ï\u0001R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00140>8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b?\u0010ð\u0001R\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00140>8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bB\u0010ð\u0001R'\u0010ñ\u0001\u001a\u0012\u0012\u0004\u0012\u00020T0\u0010j\b\u0012\u0004\u0012\u00020T`\u00118\u0002X\u0082\u0004¢\u0006\b\n\u0006\bñ\u0001\u0010ò\u0001R\u0018\u0010ô\u0001\u001a\u00030ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bô\u0001\u0010õ\u0001R'\u0010ö\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0014\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bö\u0001\u0010ï\u0001R-\u0010÷\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u0019\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b÷\u0001\u0010ø\u0001R \u0010ú\u0001\u001a\t\u0018\u00010ù\u0001R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bú\u0001\u0010û\u0001R9\u0010\u0082\u0002\u001a\n\u0012\u0005\u0012\u00030ý\u00010ü\u00012\u000e\u00101\u001a\n\u0012\u0005\u0012\u00030ý\u00010ü\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bþ\u0001\u0010ÿ\u0001\"\u0006\b\u0080\u0002\u0010\u0081\u0002¨\u0006\u0087\u0002"}, d2 = {"Lru/yandex/taxi/design/AnimatedListItemInputComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "focused", "direction", "focusSearch", "(Landroid/view/View;I)Landroid/view/View;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "views", "focusableMode", "Lzy11;", "addFocusables", "(Ljava/util/ArrayList;II)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "performClick", "()Z", "Landroid/graphics/Rect;", "previouslyFocusedRect", "requestFocus", "(ILandroid/graphics/Rect;)Z", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Landroid/widget/TextView;", "title", "()Landroid/widget/TextView;", "", "setInputTitle", "(Ljava/lang/String;)V", "getInputTitle", "()Ljava/lang/String;", "hint", "setInputHint", "", "value", "setValue", "(Ljava/lang/CharSequence;)V", "notifyListeners", "(Ljava/lang/CharSequence;Z)V", "index", "setSelection", "(I)V", "()Ljava/lang/CharSequence;", "Lkotlin/Function1;", "onFocusStateChanged", "setOnFocusStateChanged", "(Ltls;)V", "Lkotlin/Function0;", "onKeyboardClosed", "setOnKeyboardClosed", "(Lsls;)V", "onInputClicked", "setOnInputClicked", "listener", "setOnEditorActionListener", "Lkotlin/Function2;", "Landroid/view/KeyEvent;", "overrideOnEditorActionListener", "(Lwls;)V", "showKeyboard", "()V", "hideKeyboard", "cleanError", "colorAttrId", "setInputTextColorAttr", "colorId", "setInputTextColor", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/text/TextWatcher;", "textWatcher", "addTextChangedListener", "(Landroid/text/TextWatcher;)V", "removeTextChangedListener", "focusInput", "clearInputFocus", "Lru/yandex/taxi/design/DividerWithColorView;", "getBottomDivider", "()Lru/yandex/taxi/design/DividerWithColorView;", BackendConfig.Restrictions.ENABLED, "setEnabled", "(Z)V", "setDividerVisibility", "imeOptions", "setImeOptions", "inputType", "updateInputType", "Lru/yandex/taxi/widget/KeyboardAwareRobotoEditText;", "getInputEditText", "()Lru/yandex/taxi/widget/KeyboardAwareRobotoEditText;", "leadText", "setLeadText", "leadTextColorInt", "setLeadTextColor", "onLeadViewClicked", "setLeadClickListener", "showLeadVerticalDivider", "view", "setLeadView", "(Landroid/view/View;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setLeadImage", "(Landroid/graphics/drawable/Drawable;)V", "left", "top", "right", "bottom", "setLeadPaddings", "(IIII)V", "trailText", "setTrailText", "trailTextColorInt", "setTrailTextColor", "onTrailViewClicked", "setTrailClickListener", "showTrailVerticalDivider", "setTrailView", "useClearTextButton", "setUseClearTextButton", "setTrailPaddings", "startMargin", "endMargin", "updateDividerMargins", "(II)V", "bottomSpace", "setDividerFocusedBottomSpace", "combineAccessibilityFocus", "animated", "applyState", "Landroid/util/SparseArray;", "Landroid/os/Parcelable;", "container", "dispatchSaveInstanceState", "(Landroid/util/SparseArray;)V", "dispatchRestoreInstanceState", "init", "newValue", "isTextChanged", "(Ljava/lang/CharSequence;)Z", "disable", "disableViewHierarchyFocusSearch", "applyAttrs", "(Landroid/util/AttributeSet;I)V", "calculateTitleMinSize", "Landroid/content/res/TypedArray;", "attributes", "setInputAttributes", "(Landroid/content/res/TypedArray;)V", "Lru/yandex/taxi/design/AnimatedListItemInputComponent$State;", "estimateState", "()Lru/yandex/taxi/design/AnimatedListItemInputComponent$State;", "invalidateComponent", "forceInvalidateComponent", "inputFocusChanged", "createInternalStates", "height", "updateDividerParams", "toNonErrorState", "id", "byId", "overwriteStoreContainerKey", "(IILandroid/util/SparseArray;)V", "Lru/yandex/taxi/widget/RobotoTextView;", "Lru/yandex/taxi/widget/RobotoTextView;", "input", "Lru/yandex/taxi/widget/KeyboardAwareRobotoEditText;", "Lru/yandex/taxi/design/ListItemSideContainer;", "trailFrame", "Lru/yandex/taxi/design/ListItemSideContainer;", "leadFrame", "bottomDivider", "Lru/yandex/taxi/design/DividerWithColorView;", "textErrorView", "Landroid/widget/ImageView;", "imageErrorView", "Landroid/widget/ImageView;", "clearTextView", "Landroid/view/View;", "borderInactiveSize", CA20Status.STATUS_USER_I, "borderActiveSize", "dividerFocusedBottomSpace", "Lkdc;", "borderInactiveColor", "Lkdc;", "borderActiveColor", "componentErrorColor", "componentErrorIcon", "Landroid/graphics/drawable/Drawable;", "titleTextSize", "mainTextSize", "inputTitle", "Ljava/lang/String;", "inputHint", "maxLines", "maxLength", "withDivider", "Z", "withHighlight", "withInputTitle", "componentDividerMarginEnd", "componentDividerMarginStart", "componentDividerFocusedStateMarginEnd", "componentDividerFocusedStateMarginStart", "topLeadPadding", "leftLeadPadding", "bottomLeadPadding", "rightLeadPadding", "topTrailPadding", "leftTrailPadding", "bottomTrailPadding", "rightTrailPadding", "Landroidx/constraintlayout/widget/e;", "normalState", "Landroidx/constraintlayout/widget/e;", "normalEmptyState", "focusedState", "inputFocused", "isInputFocused", "errorText", "setErrorText", "currentState", "Lru/yandex/taxi/design/AnimatedListItemInputComponent$State;", "Ltls;", "Lsls;", "listeners", "Ljava/util/ArrayList;", "Lru/yandex/taxi/design/utils/ToggledTextWatcher;", "innerTextListener", "Lru/yandex/taxi/design/utils/ToggledTextWatcher;", "externalOnEditorActionListener", "onEditorActionListenerOverride", "Lwls;", "Lru/yandex/taxi/design/AnimatedListItemInputComponent$ClearTextButtonDelegate;", "clearTextButtonDelegate", "Lru/yandex/taxi/design/AnimatedListItemInputComponent$ClearTextButtonDelegate;", "", "Landroid/text/InputFilter;", "getFilters", "()[Landroid/text/InputFilter;", "setFilters", "([Landroid/text/InputFilter;)V", "filters", "State", "ClearTextButtonDelegate", "ru/yandex/taxi/design/c", "mg", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public class AnimatedListItemInputComponent extends ConstraintLayout implements nwy0 {
    private kdc borderActiveColor;
    private final int borderActiveSize;
    private kdc borderInactiveColor;
    private final int borderInactiveSize;
    private final DividerWithColorView bottomDivider;
    private int bottomLeadPadding;
    private int bottomTrailPadding;
    private ClearTextButtonDelegate clearTextButtonDelegate;
    private final View clearTextView;
    private int componentDividerFocusedStateMarginEnd;
    private int componentDividerFocusedStateMarginStart;
    private int componentDividerMarginEnd;
    private int componentDividerMarginStart;
    private int componentErrorColor;
    private Drawable componentErrorIcon;
    private State currentState;
    private int dividerFocusedBottomSpace;
    private String errorText;
    private tls externalOnEditorActionListener;
    private androidx.constraintlayout.widget.e focusedState;
    private final ImageView imageErrorView;
    private final ToggledTextWatcher innerTextListener;
    private final KeyboardAwareRobotoEditText input;
    private boolean inputFocused;
    private String inputHint;
    private String inputTitle;
    private final ListItemSideContainer leadFrame;
    private int leftLeadPadding;
    private int leftTrailPadding;
    private final ArrayList<TextWatcher> listeners;
    private final int mainTextSize;
    private int maxLength;
    private int maxLines;
    private androidx.constraintlayout.widget.e normalEmptyState;
    private androidx.constraintlayout.widget.e normalState;
    private wls onEditorActionListenerOverride;
    private tls onFocusStateChanged;
    private sls onInputClicked;
    private sls onKeyboardClosed;
    private int rightLeadPadding;
    private int rightTrailPadding;
    private final RobotoTextView textErrorView;
    private final RobotoTextView title;
    private final int titleTextSize;
    private int topLeadPadding;
    private int topTrailPadding;
    private final ListItemSideContainer trailFrame;
    private boolean withDivider;
    private boolean withHighlight;
    private boolean withInputTitle;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/design/AnimatedListItemInputComponent$ClearTextButtonDelegate;", "Lru/yandex/taxi/utils/BaseTextWatcher;", "<init>", "(Lru/yandex/taxi/design/AnimatedListItemInputComponent;)V", "", "hasFocus", "", "value", "Lzy11;", "updateClearButtonVisibility", "(ZLjava/lang/CharSequence;)V", "s", "", "start", "before", "count", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "focused", "onFocusChanged", "(Z)V", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public final class ClearTextButtonDelegate extends BaseTextWatcher {
        public ClearTextButtonDelegate() {
        }

        private final void updateClearButtonVisibility(boolean hasFocus, CharSequence value) {
            if (!hasFocus || value == null || value.length() == 0) {
                AnimatedListItemInputComponent.this.clearTextView.setVisibility(4);
            } else {
                AnimatedListItemInputComponent.this.clearTextView.setVisibility(0);
            }
        }

        public final void onFocusChanged(boolean focused) {
            updateClearButtonVisibility(focused, AnimatedListItemInputComponent.this.value());
        }

        @Override // ru.yandex.taxi.utils.BaseTextWatcher, android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            updateClearButtonVisibility(AnimatedListItemInputComponent.this.getInputFocused(), s);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/design/AnimatedListItemInputComponent$State;", "", "EMPTY", "NORMAL", "FOCUSED", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State EMPTY;
        public static final State FOCUSED;
        public static final State NORMAL;

        static {
            State state = new State("EMPTY", 0);
            EMPTY = state;
            State state2 = new State("NORMAL", 1);
            NORMAL = state2;
            State state3 = new State("FOCUSED", 2);
            FOCUSED = state3;
            State[] stateArr = {state, state2, state3};
            $VALUES = stateArr;
            $ENTRIES = kotlin.enums.a.a(stateArr);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public AnimatedListItemInputComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ru.yandex.taxi.design.utils.c.q(this, sph0.component_animated_list_item_input, true);
        int i2 = ndh0.component_list_item_title;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.title = (RobotoTextView) ((View) rp31.d(this, i2));
        this.input = (KeyboardAwareRobotoEditText) ((View) rp31.d(this, ndh0.component_list_item_input));
        this.trailFrame = (ListItemSideContainer) ((View) rp31.d(this, ndh0.input_trail_frame));
        this.leadFrame = (ListItemSideContainer) ((View) rp31.d(this, ndh0.input_lead_frame));
        this.bottomDivider = (DividerWithColorView) ((View) rp31.d(this, ndh0.component_bottom_divider));
        this.textErrorView = (RobotoTextView) ((View) rp31.d(this, ndh0.text_error));
        this.imageErrorView = (ImageView) ((View) rp31.d(this, ndh0.image_error));
        this.clearTextView = (View) rp31.d(this, ndh0.clear_text);
        this.borderInactiveSize = tje.v(getContext(), 0.5f);
        this.borderActiveSize = tje.u(2, getContext());
        this.dividerFocusedBottomSpace = tje.u(4, getContext());
        this.borderInactiveColor = new bdc(xng0.line);
        this.borderActiveColor = new gdc(mqg0.component_amber_toxic);
        this.componentErrorColor = qje.t(xng0.error, getContext());
        this.componentErrorIcon = vng.t(dzg0.ic_item_input_error, getContext());
        this.titleTextSize = tje.r(mrg0.component_text_size_caption, getContext());
        this.mainTextSize = tje.r(mrg0.component_text_size_body, getContext());
        this.inputTitle = "";
        this.inputHint = "";
        this.maxLines = 1;
        this.maxLength = 1;
        this.withDivider = true;
        this.withHighlight = true;
        this.withInputTitle = true;
        int r = tje.r(mrg0.go_design_m_space, getContext());
        this.componentDividerFocusedStateMarginEnd = r;
        this.componentDividerFocusedStateMarginStart = r;
        applyAttrs(attributeSet, i);
        init();
        this.currentState = State.EMPTY;
        this.onKeyboardClosed = new ly1(16);
        this.onInputClicked = new ly1(17);
        ArrayList<TextWatcher> arrayList = new ArrayList<>();
        this.listeners = arrayList;
        this.innerTextListener = new ToggledTextWatcher(arrayList, true);
    }

    private final void applyAttrs(AttributeSet attrs, int defStyleAttr) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attrs, c4i0.AnimatedListItemInputComponent, defStyleAttr, 0);
        String string = obtainStyledAttributes.getString(c4i0.AnimatedListItemInputComponent_component_title_input);
        if (string == null) {
            string = "";
        }
        setInputTitle(string);
        String string2 = obtainStyledAttributes.getString(c4i0.AnimatedListItemInputComponent_component_hint_input);
        setInputHint(string2 != null ? string2 : "");
        setInputAttributes(obtainStyledAttributes);
        this.withDivider = obtainStyledAttributes.getBoolean(c4i0.AnimatedListItemInputComponent_component_input_divider, this.withDivider);
        if (attrs != null) {
            kdc T = qje.T(attrs, obtainStyledAttributes, "component_input_focused_divider_color", c4i0.AnimatedListItemInputComponent_component_input_focused_divider_color, null);
            if (T == null) {
                T = this.borderActiveColor;
            }
            this.borderActiveColor = T;
            kdc T2 = qje.T(attrs, obtainStyledAttributes, "component_input_unfocused_divider_color", c4i0.AnimatedListItemInputComponent_component_input_unfocused_divider_color, null);
            if (T2 == null) {
                T2 = this.borderInactiveColor;
            }
            this.borderInactiveColor = T2;
        }
        this.withHighlight = obtainStyledAttributes.getBoolean(c4i0.AnimatedListItemInputComponent_component_input_highlight, this.withHighlight);
        this.withInputTitle = obtainStyledAttributes.getBoolean(c4i0.AnimatedListItemInputComponent_component_with_input_title, this.withInputTitle);
        this.maxLines = obtainStyledAttributes.getInt(c4i0.AnimatedListItemInputComponent_component_input_max_lines, this.maxLines);
        this.maxLength = obtainStyledAttributes.getInt(c4i0.AnimatedListItemInputComponent_component_input_max_length, Integer.MAX_VALUE);
        this.input.setMaxLines(this.maxLines);
        this.input.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(this.maxLength)});
        this.componentDividerMarginEnd = obtainStyledAttributes.getDimensionPixelSize(c4i0.AnimatedListItemInputComponent_component_divider_margin_right, this.componentDividerMarginEnd);
        this.componentDividerMarginStart = obtainStyledAttributes.getDimensionPixelSize(c4i0.AnimatedListItemInputComponent_component_divider_margin_left, this.componentDividerMarginStart);
        this.componentDividerFocusedStateMarginEnd = obtainStyledAttributes.getDimensionPixelSize(c4i0.AnimatedListItemInputComponent_component_divider_focused_state_margin_right, this.componentDividerFocusedStateMarginEnd);
        this.componentDividerFocusedStateMarginStart = obtainStyledAttributes.getDimensionPixelSize(c4i0.AnimatedListItemInputComponent_component_divider_focused_state_margin_left, this.componentDividerFocusedStateMarginStart);
        this.componentErrorColor = obtainStyledAttributes.getColor(c4i0.AnimatedListItemInputComponent_component_error_color, qje.t(xng0.error, getContext()));
        Drawable drawable = obtainStyledAttributes.getDrawable(c4i0.AnimatedListItemInputComponent_component_error_icon);
        if (drawable == null) {
            drawable = vng.t(dzg0.ic_item_input_error, getContext());
        }
        this.componentErrorIcon = drawable;
        this.imageErrorView.setImageDrawable(drawable);
    }

    private final void calculateTitleMinSize() {
        TextPaint paint = this.input.getPaint();
        String str = this.inputTitle;
        this.title.setMinWidth((int) paint.measureText(str, 0, str.length()));
    }

    private final void createInternalStates() {
        updateDividerParams(this.componentDividerMarginEnd, this.componentDividerMarginStart, 0, this.borderInactiveSize);
        this.clearTextView.setVisibility(this.clearTextButtonDelegate != null ? 4 : 8);
        this.input.setVisibility(0);
        this.title.setVisibility(this.withInputTitle ? 0 : 8);
        this.bottomDivider.setVisibility(this.withDivider ? 0 : 8);
        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
        this.normalState = eVar;
        eVar.g(this);
        updateDividerParams(this.componentDividerMarginEnd, this.componentDividerMarginStart, 0, this.borderInactiveSize);
        this.input.setVisibility(8);
        this.title.setVisibility(this.withInputTitle ? 0 : 8);
        this.bottomDivider.setVisibility(this.withDivider ? 0 : 8);
        this.clearTextView.setVisibility(this.clearTextButtonDelegate != null ? 4 : 8);
        androidx.constraintlayout.widget.e eVar2 = new androidx.constraintlayout.widget.e();
        this.normalEmptyState = eVar2;
        eVar2.g(this);
        updateDividerParams(this.componentDividerFocusedStateMarginEnd, this.componentDividerFocusedStateMarginStart, this.dividerFocusedBottomSpace, this.borderActiveSize);
        this.clearTextView.setVisibility(this.clearTextButtonDelegate == null ? 8 : 4);
        this.input.setVisibility(0);
        this.title.setVisibility(this.withInputTitle ? 0 : 8);
        this.bottomDivider.setVisibility(this.withHighlight ? 0 : 8);
        androidx.constraintlayout.widget.e eVar3 = new androidx.constraintlayout.widget.e();
        this.focusedState = eVar3;
        eVar3.g(this);
    }

    private final void disableViewHierarchyFocusSearch(boolean disable) {
        View rootView = getRootView();
        if (rootView == null || !(rootView instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) rootView).setDescendantFocusability(disable ? ImageMetadata.HOT_PIXEL_MODE : 131072);
    }

    private final State estimateState() {
        if (this.inputFocused) {
            return State.FOCUSED;
        }
        CharSequence value = value();
        return (value == null || value.length() == 0) ? State.EMPTY : State.NORMAL;
    }

    private final void forceInvalidateComponent() {
        this.currentState = estimateState();
        applyState(true);
    }

    private final void init() {
        setMinimumHeight(tje.r(mrg0.list_item_component_min_height, getContext()));
        createInternalStates();
        this.currentState = State.EMPTY;
        setValue("");
        this.input.setHideKeyboardOnDetach(false);
        this.input.setOnCloseListener(new pw0(1, this));
        this.input.setOnEditorActionListener(new ff2(0, this));
        applyState(false);
        androidx.core.view.b.p(this, new c(this));
        androidx.core.view.b.p(this.input, new mg(this));
        setClickable(true);
        this.clearTextView.setOnClickListener(new tf(7, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$0(AnimatedListItemInputComponent animatedListItemInputComponent) {
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = animatedListItemInputComponent.input;
        if (keyboardAwareRobotoEditText != null) {
            keyboardAwareRobotoEditText.post(new ce0(keyboardAwareRobotoEditText, 15));
        }
        animatedListItemInputComponent.onKeyboardClosed.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean init$lambda$1(AnimatedListItemInputComponent animatedListItemInputComponent, TextView textView, int i, KeyEvent keyEvent) {
        wls wlsVar = animatedListItemInputComponent.onEditorActionListenerOverride;
        if (wlsVar != null) {
            return ((Boolean) wlsVar.invoke(Integer.valueOf(i), keyEvent)).booleanValue();
        }
        tls tlsVar = animatedListItemInputComponent.externalOnEditorActionListener;
        if (tlsVar != null) {
            tlsVar.invoke(Integer.valueOf(i));
        }
        if (i != 6) {
            return false;
        }
        animatedListItemInputComponent.clearInputFocus();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$2(AnimatedListItemInputComponent animatedListItemInputComponent, View view) {
        animatedListItemInputComponent.input.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void inputFocusChanged(boolean focused) {
        if (this.inputFocused != focused) {
            this.inputFocused = focused;
            tls tlsVar = this.onFocusStateChanged;
            if (tlsVar != null) {
                tlsVar.invoke(Boolean.valueOf(focused));
            }
            ClearTextButtonDelegate clearTextButtonDelegate = this.clearTextButtonDelegate;
            if (clearTextButtonDelegate != null) {
                clearTextButtonDelegate.onFocusChanged(focused);
            }
        }
        invalidateComponent();
    }

    private final void invalidateComponent() {
        State estimateState = estimateState();
        if (estimateState != this.currentState) {
            this.currentState = estimateState;
            applyState(true);
        }
    }

    private final boolean isTextChanged(CharSequence newValue) {
        CharSequence text = this.input.getText();
        if (text == null) {
            text = "";
        }
        if (newValue.length() != text.length()) {
            return true;
        }
        int length = newValue.length();
        for (int i = 0; i < length; i++) {
            if (newValue.charAt(i) != text.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onAttachedToWindow$lambda$1(AnimatedListItemInputComponent animatedListItemInputComponent, View view, MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getAction() != 1) {
            return false;
        }
        animatedListItemInputComponent.performClick();
        return false;
    }

    private final void overwriteStoreContainerKey(int id, int byId, SparseArray<Parcelable> container) {
        Parcelable parcelable = container.get(id);
        if (parcelable != null) {
            container.remove(id);
            container.put(byId, parcelable);
        }
    }

    private final void setInputAttributes(TypedArray attributes) {
        int i;
        if (attributes.hasValue(c4i0.AnimatedListItemInputComponent_component_type_input)) {
            switch (attributes.getInt(c4i0.AnimatedListItemInputComponent_component_type_input, 0)) {
                case 0:
                    i = 1;
                    break;
                case 1:
                    i = 2;
                    break;
                case 2:
                    i = 8194;
                    break;
                case 3:
                    i = 8193;
                    break;
                case 4:
                    i = 3;
                    break;
                case 5:
                    i = 16385;
                    break;
                case 6:
                    i = 32;
                    break;
                case 7:
                    i = 524288;
                    break;
                default:
                    kbs.g("Invalid input type");
                    return;
            }
            this.input.setInputType(i);
        }
        if (attributes.hasValue(c4i0.AnimatedListItemInputComponent_android_imeOptions)) {
            setImeOptions(attributes.getInt(c4i0.AnimatedListItemInputComponent_android_imeOptions, 0));
        }
        setFocusableInTouchMode(attributes.getBoolean(c4i0.AnimatedListItemInputComponent_android_focusableInTouchMode, true));
    }

    private final void toNonErrorState() {
        this.title.setTextColor(qje.t(xng0.textMinor, getContext()));
        RobotoTextView robotoTextView = this.textErrorView;
        robotoTextView.setText(this.errorText);
        robotoTextView.setVisibility(8);
        this.imageErrorView.setVisibility(8);
    }

    private final void updateDividerParams(int endMargin, int startMargin, int bottomSpace, int height) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.bottomDivider.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).height = height;
        layoutParams.setMarginEnd(endMargin);
        layoutParams.setMarginStart(startMargin);
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = bottomSpace;
        this.bottomDivider.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> views, int direction, int focusableMode) {
        if (views == null) {
            return;
        }
        if ((focusableMode & 1) != 1 || isFocusableInTouchMode()) {
            views.add(this);
        }
    }

    public final void addTextChangedListener(TextWatcher textWatcher) {
        this.listeners.add(textWatcher);
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b1, code lost:
    
        if (r4 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b4, code lost:
    
        r1 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c3, code lost:
    
        r1.b(r3);
        r4 = r3.title;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cc, code lost:
    
        if (r3.currentState != ru.yandex.taxi.design.AnimatedListItemInputComponent.State.EMPTY) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ce, code lost:
    
        r1 = r3.mainTextSize;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d5, code lost:
    
        r4.setTextSize(0, r1);
        r4 = r3.errorText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00db, code lost:
    
        if (r4 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e1, code lost:
    
        if (r4.length() != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e4, code lost:
    
        r3.bottomDivider.updateColorInt(r3.componentErrorColor);
        r3.title.setTextColor(r3.componentErrorColor);
        r4 = r3.textErrorView;
        r4.setText(r3.errorText);
        r4.setVisibility(0);
        r3.title.setVisibility(0);
        r3.imageErrorView.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0127, code lost:
    
        sendAccessibilityEvent(2048);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x012c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0107, code lost:
    
        r4 = r3.currentState;
        r1 = ru.yandex.taxi.design.AnimatedListItemInputComponent.State.FOCUSED;
        r2 = r3.bottomDivider;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010d, code lost:
    
        if (r4 != r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010f, code lost:
    
        r2.updateColor(r3.borderActiveColor);
        toNonErrorState();
        r4 = r3.clearTextButtonDelegate;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0119, code lost:
    
        if (r4 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011b, code lost:
    
        r4.onFocusChanged(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011f, code lost:
    
        r2.updateColor(r3.borderInactiveColor);
        toNonErrorState();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d2, code lost:
    
        r1 = r3.titleTextSize;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bc, code lost:
    
        if (r4 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c1, code lost:
    
        if (r4 == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void applyState(boolean animated) {
        androidx.constraintlayout.widget.e eVar;
        String str;
        String str2;
        if (animated) {
            TransitionSet transitionSet = new TransitionSet();
            Fade fade = new Fade();
            fade.y.add(this.imageErrorView);
            transitionSet.Z(fade);
            ssy0 ssy0Var = new ssy0();
            ssy0Var.y.add(this.title);
            transitionSet.Z(ssy0Var);
            uty0 uty0Var = new uty0();
            uty0Var.y.add(this.title);
            transitionSet.Z(uty0Var);
            sql sqlVar = new sql();
            sqlVar.y.add(this.bottomDivider);
            transitionSet.Z(sqlVar);
            transitionSet.P(200L);
            TransitionManager.a(transitionSet, this);
            if (getParent() != null && (getParent() instanceof ViewGroup) && ((this.textErrorView.getVisibility() == 0 && ((str2 = this.errorText) == null || str2.length() == 0)) || (this.textErrorView.getVisibility() != 0 && (str = this.errorText) != null && str.length() != 0))) {
                ViewGroup viewGroup = (ViewGroup) getParent();
                TransitionSet transitionSet2 = new TransitionSet();
                transitionSet2.P(50L);
                transitionSet2.Z(new ChangeBounds());
                TransitionManager.a(transitionSet2, viewGroup);
            }
        }
        int i = d.a[this.currentState.ordinal()];
        androidx.constraintlayout.widget.e eVar2 = null;
        if (i == 1) {
            eVar = this.normalEmptyState;
        } else if (i == 2) {
            eVar = this.normalState;
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            eVar = this.focusedState;
        }
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        applyState(false);
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final void cleanError() {
        setErrorText(null);
    }

    public final void clearInputFocus() {
        if (this.inputFocused) {
            disableViewHierarchyFocusSearch(true);
            this.input.clearFocus();
            KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = this.input;
            if (keyboardAwareRobotoEditText != null) {
                keyboardAwareRobotoEditText.post(new ce0(keyboardAwareRobotoEditText, 15));
            }
            disableViewHierarchyFocusSearch(false);
        }
    }

    public final void combineAccessibilityFocus() {
        setContentDescription(((Object) this.title.getText()) + " " + ((Object) this.input.getText()));
        this.input.setImportantForAccessibility(2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
        if (container != null) {
            overwriteStoreContainerKey(this.input.getId() + getId(), this.input.getId(), container);
        }
        super.dispatchRestoreInstanceState(container);
        invalidateComponent();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> container) {
        super.dispatchSaveInstanceState(container);
        if (container != null) {
            overwriteStoreContainerKey(this.input.getId(), this.input.getId() + getId(), container);
        }
    }

    /* renamed from: errorText, reason: from getter */
    public final String getErrorText() {
        return this.errorText;
    }

    public final void focusInput() {
        if (this.inputFocused) {
            return;
        }
        inputFocusChanged(true);
        this.input.requestFocus();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View focused, int direction) {
        return super.focusSearch(this, direction);
    }

    public final DividerWithColorView getBottomDivider() {
        return this.bottomDivider;
    }

    public final InputFilter[] getFilters() {
        return this.input.getFilters();
    }

    /* renamed from: getInputEditText, reason: from getter */
    public final KeyboardAwareRobotoEditText getInput() {
        return this.input;
    }

    public final String getInputTitle() {
        return this.inputTitle;
    }

    public final void hideKeyboard() {
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = this.input;
        if (keyboardAwareRobotoEditText == null) {
            return;
        }
        keyboardAwareRobotoEditText.post(new ce0(keyboardAwareRobotoEditText, 15));
    }

    /* renamed from: isInputFocused, reason: from getter */
    public final boolean getInputFocused() {
        return this.inputFocused;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = 2;
        this.input.setOnFocusChangeListener(new bk(i, this));
        this.input.setOnTouchListener(new t8(i, this));
        this.input.addTextChangedListener(this.innerTextListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.input.setOnFocusChangeListener(null);
        this.input.removeTextChangedListener(this.innerTextListener);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        boolean onTouchEvent = super.onTouchEvent(event);
        if (onTouchEvent && event != null && event.getAction() == 1) {
            performClick();
        }
        return onTouchEvent;
    }

    public final void overrideOnEditorActionListener(wls listener) {
        this.onEditorActionListenerOverride = listener;
    }

    @Override // android.view.View
    public boolean performClick() {
        this.onInputClicked.invoke();
        if (tje.J(getContext())) {
            focusInput();
        }
        return super.performClick();
    }

    public final void removeTextChangedListener(TextWatcher textWatcher) {
        this.listeners.remove(textWatcher);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int direction, Rect previouslyFocusedRect) {
        focusInput();
        return true;
    }

    public final void setDividerFocusedBottomSpace(int bottomSpace) {
        this.dividerFocusedBottomSpace = bottomSpace;
        createInternalStates();
        applyState(false);
    }

    public final void setDividerVisibility(boolean value) {
        this.withDivider = value;
        createInternalStates();
        applyState(false);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.input.setEnabled(enabled);
    }

    public final void setErrorText(String str) {
        boolean l = jl40.l(this.errorText, str);
        this.errorText = str;
        forceInvalidateComponent();
        if (l || str == null || !(!evu0.J(str))) {
            return;
        }
        this.textErrorView.sendAccessibilityEvent(8);
    }

    public final void setFilters(InputFilter[] inputFilterArr) {
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = this.input;
        c2r0 c2r0Var = new c2r0(2, 1);
        c2r0Var.a(new InputFilter.LengthFilter(this.maxLength));
        c2r0Var.b(inputFilterArr);
        ArrayList arrayList = c2r0Var.b;
        keyboardAwareRobotoEditText.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[arrayList.size()]));
    }

    public final void setImeOptions(int imeOptions) {
        this.input.setImeOptions(imeOptions);
    }

    public final void setInputHint(String hint) {
        this.inputHint = hint;
        this.input.setHint(hint);
    }

    public final void setInputTextColor(int colorId) {
        this.input.setTextColor(colorId);
    }

    public final void setInputTextColorAttr(int colorAttrId) {
        this.input.setTextColorAttr(colorAttrId);
    }

    public final void setInputTitle(String title) {
        this.inputTitle = title;
        this.title.setText(title);
        calculateTitleMinSize();
    }

    public final void setLeadClickListener(sls onLeadViewClicked) {
        this.leadFrame.setDebounceClickListener(onLeadViewClicked);
    }

    public final void setLeadImage(Drawable drawable) {
        this.leadFrame.setImage(drawable);
    }

    public final void setLeadPaddings(int left, int top, int right, int bottom) {
        this.leftLeadPadding = left;
        this.topLeadPadding = top;
        this.rightLeadPadding = right;
        this.bottomLeadPadding = bottom;
        this.leadFrame.setPadding(left, top, right, bottom);
    }

    public final void setLeadText(CharSequence leadText) {
        this.leadFrame.setCompanionText(leadText);
    }

    public final void setLeadTextColor(int leadTextColorInt) {
        this.leadFrame.setCompanionTextColor(leadTextColorInt);
    }

    public final void setLeadView(View view) {
        this.leadFrame.setView(view);
    }

    public final void setOnEditorActionListener(tls listener) {
        this.externalOnEditorActionListener = listener;
    }

    public final void setOnFocusStateChanged(tls onFocusStateChanged) {
        this.onFocusStateChanged = onFocusStateChanged;
    }

    public final void setOnInputClicked(sls onInputClicked) {
        this.onInputClicked = onInputClicked;
    }

    public final void setOnKeyboardClosed(sls onKeyboardClosed) {
        this.onKeyboardClosed = onKeyboardClosed;
    }

    public final void setSelection(int index) {
        this.input.setSelection(index);
    }

    public final void setTrailClickListener(sls onTrailViewClicked) {
        this.trailFrame.setDebounceClickListener(onTrailViewClicked);
    }

    public final void setTrailPaddings(int left, int top, int right, int bottom) {
        this.leftTrailPadding = left;
        this.topTrailPadding = top;
        this.rightTrailPadding = right;
        this.bottomTrailPadding = bottom;
        this.trailFrame.setPadding(left, top, right, bottom);
    }

    public final void setTrailText(CharSequence trailText) {
        this.trailFrame.setCompanionText(trailText);
    }

    public final void setTrailTextColor(int trailTextColorInt) {
        this.trailFrame.setCompanionTextColor(trailTextColorInt);
    }

    public final void setTrailView(View view) {
        this.trailFrame.setView(view);
    }

    public final void setUseClearTextButton(boolean useClearTextButton) {
        TextWatcher textWatcher = this.clearTextButtonDelegate;
        if (useClearTextButton && textWatcher == null) {
            ClearTextButtonDelegate clearTextButtonDelegate = new ClearTextButtonDelegate();
            addTextChangedListener(clearTextButtonDelegate);
            this.clearTextButtonDelegate = clearTextButtonDelegate;
        } else if (textWatcher != null) {
            removeTextChangedListener(textWatcher);
            this.clearTextButtonDelegate = null;
        }
        if (jl40.l(textWatcher, this.clearTextButtonDelegate)) {
            return;
        }
        createInternalStates();
        applyState(false);
    }

    public final void setValue(CharSequence value, boolean notifyListeners) {
        if (isTextChanged(value)) {
            if (notifyListeners) {
                this.input.setText(value);
            } else {
                this.innerTextListener.setEnabled(false);
                this.input.setText(value);
                this.innerTextListener.setEnabled(true);
            }
            invalidateComponent();
        }
    }

    public final void showKeyboard() {
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = this.input;
        if (keyboardAwareRobotoEditText == null) {
            return;
        }
        keyboardAwareRobotoEditText.post(new xd2(keyboardAwareRobotoEditText, 1));
    }

    public final void showLeadVerticalDivider() {
        this.leadFrame.showStartDivider();
    }

    public final void showTrailVerticalDivider() {
        this.trailFrame.showStartDivider();
    }

    public final TextView title() {
        return this.title;
    }

    public final void updateDividerMargins(int startMargin, int endMargin) {
        this.componentDividerMarginStart = startMargin;
        this.componentDividerMarginEnd = endMargin;
        this.componentDividerFocusedStateMarginStart = startMargin;
        this.componentDividerFocusedStateMarginEnd = endMargin;
        createInternalStates();
        applyState(false);
    }

    public final void updateInputType(int inputType) {
        int i;
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = this.input;
        switch (inputType) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 8194;
                break;
            case 3:
                i = 8193;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 16385;
                break;
            case 6:
                i = 32;
                break;
            case 7:
                i = 524288;
                break;
            default:
                kbs.g("Invalid input type");
                return;
        }
        keyboardAwareRobotoEditText.setInputType(i);
    }

    public final CharSequence value() {
        Editable text = this.input.getText();
        return text != null ? text : "";
    }

    public final void setValue(CharSequence value) {
        setValue(value, true);
    }

    public AnimatedListItemInputComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AnimatedListItemInputComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ AnimatedListItemInputComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.animatedListItemInputComponentStyle : i);
    }
}
