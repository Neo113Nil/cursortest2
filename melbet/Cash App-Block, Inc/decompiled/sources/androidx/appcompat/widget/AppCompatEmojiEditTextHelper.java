package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.appcompat.R$styleable;
import androidx.camera.video.Recorder;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.viewsintegration.EmojiInputConnection;
import androidx.emoji2.viewsintegration.EmojiKeyListener;
import androidx.emoji2.viewsintegration.EmojiTextWatcher;
import androidx.room.TransactorKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes3.dex */
public final class AppCompatEmojiEditTextHelper {
    public final Recorder.AnonymousClass1 mEmojiEditTextHelper;
    public final EditText mView;

    public AppCompatEmojiEditTextHelper(EditText editText) {
        this.mView = editText;
        this.mEmojiEditTextHelper = new Recorder.AnonymousClass1(editText);
    }

    public static boolean isEmojiCapableKeyListener(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public final KeyListener getKeyListener(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        this.mEmojiEditTextHelper.getClass();
        if (keyListener instanceof EmojiKeyListener) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new EmojiKeyListener(keyListener);
    }

    public final boolean isEnabled() {
        return ((EmojiTextWatcher) this.mEmojiEditTextHelper.this$0).mEnabled;
    }

    public final void loadFromAttributes(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.mView.getContext().obtainStyledAttributes(attributeSet, R$styleable.AppCompatTextView, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            setEnabled(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final EmojiInputConnection onCreateInputConnection(InputConnection inputConnection, EditorInfo editorInfo) {
        Recorder.AnonymousClass1 anonymousClass1 = this.mEmojiEditTextHelper;
        anonymousClass1.getClass();
        if (inputConnection == null) {
            return null;
        }
        return inputConnection instanceof EmojiInputConnection ? (EmojiInputConnection) inputConnection : new EmojiInputConnection(editorInfo, inputConnection, (EditText) anonymousClass1.val$videoEncoderSession);
    }

    public final void setEnabled(boolean z) {
        EmojiTextWatcher emojiTextWatcher = (EmojiTextWatcher) this.mEmojiEditTextHelper.this$0;
        if (emojiTextWatcher.mEnabled != z) {
            if (emojiTextWatcher.mInitCallback != null) {
                EmojiCompat emojiCompat = EmojiCompat.get();
                EmojiTextWatcher.InitCallbackImpl initCallbackImpl = emojiTextWatcher.mInitCallback;
                ArraySet arraySet = emojiCompat.mInitCallbacks;
                TransactorKt.checkNotNull(initCallbackImpl, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = emojiCompat.mInitLock;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    ArrayList arrayList = new ArrayList();
                    arraySet.getClass();
                    ArrayMap.KeyIterator keyIterator = new ArrayMap.KeyIterator(arraySet);
                    while (keyIterator.hasNext()) {
                        EmojiCompat.InitWithExecutor initWithExecutor = (EmojiCompat.InitWithExecutor) keyIterator.next();
                        if (initWithExecutor.mInitCallback == initCallbackImpl) {
                            arrayList.add(initWithExecutor);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arraySet.remove((EmojiCompat.InitWithExecutor) it.next());
                    }
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            emojiTextWatcher.mEnabled = z;
            if (z) {
                EmojiTextWatcher.processTextOnEnablingEvent(emojiTextWatcher.mEditText, EmojiCompat.get().getLoadState());
            }
        }
    }
}
