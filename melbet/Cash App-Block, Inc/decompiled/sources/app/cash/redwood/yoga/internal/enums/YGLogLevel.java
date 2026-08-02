package app.cash.redwood.yoga.internal.enums;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class YGLogLevel {
    public static final /* synthetic */ YGLogLevel[] $VALUES = {new YGLogLevel("YGLogLevelError", 0), new YGLogLevel("YGLogLevelWarn", 1), new YGLogLevel("YGLogLevelInfo", 2), new YGLogLevel("YGLogLevelDebug", 3), new YGLogLevel("YGLogLevelVerbose", 4), new YGLogLevel("YGLogLevelFatal", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    YGLogLevel EF5;

    public static YGLogLevel valueOf(String str) {
        return (YGLogLevel) Enum.valueOf(YGLogLevel.class, str);
    }

    public static YGLogLevel[] values() {
        return (YGLogLevel[]) $VALUES.clone();
    }
}
