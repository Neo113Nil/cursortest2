package com.bumptech.glide.load.engine;

import android.util.Log;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.bumptech.glide.load.Key;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class GlideException extends Exception {
    public static final StackTraceElement[] EMPTY_ELEMENTS = new StackTraceElement[0];
    public final List causes;
    public Class dataClass;
    public int dataSource;
    public final String detailMessage;
    public Key key;

    public GlideException(String str, List list) {
        this.detailMessage = str;
        setStackTrace(EMPTY_ELEMENTS);
        this.causes = list;
    }

    public static void addRootCauses(Throwable th, ArrayList arrayList) {
        if (!(th instanceof GlideException)) {
            arrayList.add(th);
            return;
        }
        Iterator it = ((GlideException) th).causes.iterator();
        while (it.hasNext()) {
            addRootCauses((Throwable) it.next(), arrayList);
        }
    }

    public static void appendCausesWrapped(List list, IndentedAppendable indentedAppendable) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            indentedAppendable.append("Cause (");
            int i2 = i + 1;
            indentedAppendable.append(String.valueOf(i2));
            indentedAppendable.append(" of ");
            indentedAppendable.append(String.valueOf(size));
            indentedAppendable.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof GlideException) {
                ((GlideException) th).printStackTrace(indentedAppendable);
            } else {
                appendExceptionMessage(th, indentedAppendable);
            }
            i = i2;
        }
    }

    public static void appendExceptionMessage(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            a$$ExternalSyntheticBUOutline0.m(th);
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.detailMessage);
        String str2 = "";
        if (this.dataClass != null) {
            str = ", " + this.dataClass;
        } else {
            str = "";
        }
        sb.append(str);
        int i = this.dataSource;
        sb.append(i != 0 ? ", ".concat(Thread$State$EnumUnboxingLocalUtility.stringValueOf(i)) : "");
        if (this.key != null) {
            str2 = ", " + this.key;
        }
        sb.append(str2);
        ArrayList arrayList = new ArrayList();
        addRootCauses(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public final void logRootCauses() {
        ArrayList arrayList = new ArrayList();
        addRootCauses(this, arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i("Glide", sb.toString(), (Throwable) arrayList.get(i));
            i = i2;
        }
    }

    public final void printStackTrace(Appendable appendable) {
        appendExceptionMessage(this, appendable);
        try {
            appendCausesWrapped(this.causes, new IndentedAppendable(appendable));
        } catch (IOException e) {
            a$$ExternalSyntheticBUOutline0.m((Throwable) e);
        }
    }

    public GlideException(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        printStackTrace((Appendable) printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        printStackTrace((Appendable) printWriter);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace((Appendable) System.err);
    }

    public final class IndentedAppendable implements Appendable {
        public final Appendable appendable;
        public boolean printedNewLine = true;

        public IndentedAppendable(Appendable appendable) {
            this.appendable = appendable;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i, int i2) {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z = this.printedNewLine;
            Appendable appendable = this.appendable;
            boolean z2 = false;
            if (z) {
                this.printedNewLine = false;
                appendable.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == '\n') {
                z2 = true;
            }
            this.printedNewLine = z2;
            appendable.append(charSequence, i, i2);
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c) {
            boolean z = this.printedNewLine;
            Appendable appendable = this.appendable;
            if (z) {
                this.printedNewLine = false;
                appendable.append("  ");
            }
            this.printedNewLine = c == '\n';
            appendable.append(c);
            return this;
        }
    }
}
